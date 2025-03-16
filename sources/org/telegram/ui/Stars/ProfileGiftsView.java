package org.telegram.ui.Stars;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarsController;

/* loaded from: classes5.dex */
public class ProfileGiftsView extends View implements NotificationCenter.NotificationCenterDelegate {
    private float actionBarProgress;
    public final AnimatedFloat animatedCount;
    private final View avatarContainer;
    private final ProfileActivity.AvatarImageView avatarImage;
    private final int currentAccount;
    private float cy;
    private final long dialogId;
    private float expandProgress;
    private float expandRight;
    private boolean expandRightPad;
    private final AnimatedFloat expandRightPadAnimated;
    private float expandY;
    public final HashSet giftIds;
    public final ArrayList gifts;
    private float left;
    private StarsController.GiftsList list;
    public int maxCount;
    public final ArrayList oldGifts;
    private Gift pressedGift;
    private float progressToInsets;
    private final Theme.ResourcesProvider resourcesProvider;
    private float right;
    private final AnimatedFloat rightAnimated;

    public final class Gift {
        public AnimatedFloat animatedFloat;
        public final ButtonBounce bounce;
        public final int color;
        public final TLRPC.Document document;
        public final long documentId;
        public AnimatedEmojiDrawable emojiDrawable;
        public RadialGradient gradient;
        public Paint gradientPaint;
        public final long id;
        public final String slug;
        public final Matrix gradientMatrix = new Matrix();
        public final RectF bounds = new RectF();

        public Gift(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
            this.bounce = new ButtonBounce(ProfileGiftsView.this);
            this.id = tL_starGiftUnique.id;
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            this.document = document;
            this.documentId = document == null ? 0L : document.id;
            this.color = ((TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
            this.slug = tL_starGiftUnique.slug;
        }

        public void copy(Gift gift) {
            this.gradient = gift.gradient;
            this.emojiDrawable = gift.emojiDrawable;
            this.gradientPaint = gift.gradientPaint;
            this.animatedFloat = gift.animatedFloat;
        }

        public void draw(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6) {
            if (f5 <= 0.0f) {
                return;
            }
            float dp = AndroidUtilities.dp(45.0f);
            float f7 = dp / 2.0f;
            this.bounds.set(f - f7, f2 - f7, f + f7, f2 + f7);
            canvas.save();
            canvas.translate(f, f2);
            canvas.rotate(f4);
            float scale = this.bounce.getScale(0.1f) * f3;
            canvas.scale(scale, scale);
            Paint paint = this.gradientPaint;
            if (paint != null) {
                paint.setAlpha((int) (f5 * 255.0f * f6));
                float f8 = (-dp) / 2.0f;
                canvas.drawRect(f8, f8, f7, f7, this.gradientPaint);
            }
            if (this.emojiDrawable != null) {
                int dp2 = AndroidUtilities.dp(24.0f);
                int i = (-dp2) / 2;
                int i2 = dp2 / 2;
                this.emojiDrawable.setBounds(i, i, i2, i2);
                this.emojiDrawable.setAlpha((int) (f5 * 255.0f));
                this.emojiDrawable.draw(canvas);
            }
            canvas.restore();
        }

        public boolean equals(Gift gift) {
            return gift != null && gift.id == this.id;
        }
    }

    public ProfileGiftsView(Context context, int i, long j, View view, ProfileActivity.AvatarImageView avatarImageView, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.expandRightPadAnimated = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.rightAnimated = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.progressToInsets = 1.0f;
        this.oldGifts = new ArrayList();
        this.gifts = new ArrayList();
        this.giftIds = new HashSet();
        this.animatedCount = new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator);
        this.currentAccount = i;
        this.dialogId = j;
        this.avatarContainer = view;
        this.avatarImage = avatarImageView;
        this.resourcesProvider = resourcesProvider;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == this.dialogId) {
            update();
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        float min;
        float dp;
        float f3;
        float f4;
        if (this.gifts.isEmpty()) {
            return;
        }
        float f5 = 1.0f;
        if (this.expandProgress >= 1.0f) {
            return;
        }
        float x = this.avatarContainer.getX();
        float y = this.avatarContainer.getY();
        float width = this.avatarContainer.getWidth() * this.avatarContainer.getScaleX();
        float height = this.avatarContainer.getHeight() * this.avatarContainer.getScaleY();
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.expandY);
        float f6 = x + (width / 2.0f);
        float min2 = Math.min(f6, AndroidUtilities.dp(48.0f));
        float f7 = y + (height / 2.0f);
        float min3 = (Math.min(width, height) / 2.0f) + AndroidUtilities.dp(6.0f);
        float width2 = getWidth() / 2.0f;
        float clamp01 = Utilities.clamp01((this.expandY - (AndroidUtilities.statusBarHeight + ActionBar.getCurrentActionBarHeight())) / AndroidUtilities.dp(50.0f));
        int i = 0;
        while (i < this.gifts.size()) {
            Gift gift = (Gift) this.gifts.get(i);
            float f8 = gift.animatedFloat.set(f5);
            float lerp = AndroidUtilities.lerp(0.5f, f5, f8);
            if (i == 0) {
                double d = f6;
                float f9 = f7;
                double d2 = min3;
                double cos = Math.cos(-1.1344639929903682d);
                Double.isNaN(d2);
                Double.isNaN(d);
                f = min3;
                double d3 = f9;
                double sin = Math.sin(-1.1344639929903682d);
                Double.isNaN(d2);
                Double.isNaN(d3);
                f2 = f9;
                gift.draw(canvas, (float) (d + (cos * d2)), (float) (d3 + (d2 * sin)), lerp, 25.0f, (1.0f - this.expandProgress) * f8, AndroidUtilities.lerp(0.9f, 0.25f, this.actionBarProgress));
                width2 = width2;
            } else {
                f = min3;
                float f10 = width2;
                f2 = f7;
                if (i == 1) {
                    width2 = f10;
                    min = AndroidUtilities.lerp(Math.min(getWidth() * 0.27f, AndroidUtilities.dp(62.0f)) + min2, width2, this.actionBarProgress * 0.5f);
                    dp = f2 - AndroidUtilities.dp(52.0f);
                    f3 = f8 * f8 * (1.0f - this.expandProgress) * (1.0f - this.actionBarProgress) * clamp01;
                    f4 = -4.0f;
                } else {
                    width2 = f10;
                    if (i == 2) {
                        min = AndroidUtilities.lerp(Math.min(getWidth() * 0.46f, AndroidUtilities.dp(105.0f)) + min2, width2, this.actionBarProgress * 0.5f);
                        dp = f2 - AndroidUtilities.dp(72.0f);
                        f3 = f8 * (1.0f - this.expandProgress) * (1.0f - this.actionBarProgress) * clamp01;
                        f4 = 8.0f;
                    } else if (i == 3) {
                        min = AndroidUtilities.lerp(Math.min(getWidth() * 0.6f, AndroidUtilities.dp(136.0f)) + min2, width2, this.actionBarProgress * 0.5f);
                        dp = f2 - AndroidUtilities.dp(46.0f);
                        f3 = f8 * (1.0f - this.expandProgress) * (1.0f - this.actionBarProgress) * clamp01;
                        f4 = 3.0f;
                    } else if (i == 4) {
                        min = AndroidUtilities.lerp(Math.min(getWidth() * 0.08f, AndroidUtilities.dp(21.6f)) + min2, width2, this.actionBarProgress * 0.5f);
                        dp = f2 - AndroidUtilities.dp(82.0f);
                        f3 = f8 * (1.0f - this.expandProgress) * (1.0f - this.actionBarProgress) * clamp01;
                        f4 = -3.0f;
                    } else if (i == 5) {
                        min = AndroidUtilities.lerp(Math.min(getWidth() * 0.745f, AndroidUtilities.dp(186.0f)) + min2, width2, this.actionBarProgress * 0.5f);
                        dp = f2 - AndroidUtilities.dp(39.0f);
                        f3 = f8 * (1.0f - this.expandProgress) * (1.0f - this.actionBarProgress) * clamp01;
                        f4 = 2.0f;
                    } else if (i == 6) {
                        min = min2 + Math.min(getWidth() * 0.38f, AndroidUtilities.dp(102.0f));
                        dp = this.expandY - AndroidUtilities.dp(12.0f);
                        f3 = f8 * (1.0f - this.expandProgress) * (1.0f - this.actionBarProgress) * clamp01;
                        f4 = 0.0f;
                    } else if (i == 7) {
                        min = min2 + Math.min(getWidth() * 0.135f, AndroidUtilities.dp(36.0f));
                        dp = this.expandY - AndroidUtilities.dp(17.6f);
                        f3 = f8 * (1.0f - this.expandProgress) * (1.0f - this.actionBarProgress) * clamp01;
                        f4 = -5.0f;
                    } else if (i == 8) {
                        gift.draw(canvas, min2 + Math.min(getWidth() * 0.76f, AndroidUtilities.dp(178.0f)), this.expandY - AndroidUtilities.dp(21.66f), lerp, 5.0f, f8 * (1.0f - this.expandProgress) * (1.0f - this.actionBarProgress) * clamp01, 1.0f);
                        i++;
                        f7 = f2;
                        min3 = f;
                        f5 = 1.0f;
                    }
                }
                gift.draw(canvas, min, dp, lerp, f4, f3, 1.0f);
            }
            i++;
            f7 = f2;
            min3 = f;
            f5 = 1.0f;
        }
        canvas.restore();
    }

    public Gift getGiftUnder(float f, float f2) {
        for (int i = 0; i < this.gifts.size(); i++) {
            if (((Gift) this.gifts.get(i)).bounds.contains(f, f2)) {
                return (Gift) this.gifts.get(i);
            }
        }
        return null;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        Iterator it = this.gifts.iterator();
        while (it.hasNext()) {
            ((Gift) it.next()).emojiDrawable.addView(this);
        }
        update();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        Iterator it = this.gifts.iterator();
        while (it.hasNext()) {
            ((Gift) it.next()).emojiDrawable.removeView(this);
        }
    }

    public void onGiftClick(Gift gift) {
        Browser.openUrl(getContext(), "https://t.me/nft/" + gift.slug);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        if (r7 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r7 != null) goto L18;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Gift gift;
        Gift giftUnder = getGiftUnder(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            this.pressedGift = giftUnder;
            if (giftUnder != null) {
                giftUnder.bounce.setPressed(true);
            }
        } else if (motionEvent.getAction() == 2) {
            gift = this.pressedGift;
            if (gift != giftUnder) {
            }
        } else if (motionEvent.getAction() == 1) {
            Gift gift2 = this.pressedGift;
            if (gift2 != null) {
                onGiftClick(gift2);
                gift = this.pressedGift;
                gift.bounce.setPressed(false);
                this.pressedGift = null;
            }
        } else if (motionEvent.getAction() == 3) {
            gift = this.pressedGift;
        }
        return this.pressedGift != null;
    }

    public void setActionBarActionMode(float f) {
        this.actionBarProgress = f;
        invalidate();
    }

    public void setBounds(float f, float f2, float f3, boolean z) {
        boolean z2 = Math.abs(f - this.left) > 0.1f || Math.abs(f2 - this.right) > 0.1f || Math.abs(f3 - this.cy) > 0.1f;
        this.left = f;
        this.right = f2;
        if (!z) {
            this.rightAnimated.set(f2, true);
        }
        this.cy = f3;
        if (z2) {
            invalidate();
        }
    }

    public void setExpandCoords(float f, boolean z, float f2) {
        this.expandRight = f;
        this.expandRightPad = z;
        this.expandY = f2;
        invalidate();
    }

    public void setExpandProgress(float f) {
        if (this.expandProgress != f) {
            this.expandProgress = f;
            invalidate();
        }
    }

    public void setProgressToStoriesInsets(float f) {
        if (this.progressToInsets == f) {
            return;
        }
        this.progressToInsets = f;
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void update() {
        TLRPC.User user;
        boolean z;
        int i;
        int i2;
        Gift gift;
        Gift gift2;
        if (!MessagesController.getInstance(this.currentAccount).enableGiftsInProfile) {
            return;
        }
        this.maxCount = MessagesController.getInstance(this.currentAccount).stargiftsPinnedToTopLimit;
        this.oldGifts.clear();
        this.oldGifts.addAll(this.gifts);
        this.gifts.clear();
        this.giftIds.clear();
        long j = this.dialogId;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        long j2 = this.dialogId;
        TLRPC.EmojiStatus emojiStatus = (j < 0 ? (user = messagesController.getUser(Long.valueOf(-j2))) != null : (user = messagesController.getUser(Long.valueOf(j2))) != null) ? user.emoji_status : null;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            this.giftIds.add(Long.valueOf(((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id));
        }
        StarsController.GiftsList profileGiftsList = StarsController.getInstance(this.currentAccount).getProfileGiftsList(this.dialogId);
        this.list = profileGiftsList;
        if (profileGiftsList != null) {
            for (int i3 = 0; i3 < this.list.gifts.size(); i3++) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.list.gifts.get(i3);
                if (!savedStarGift.unsaved && savedStarGift.pinned_to_top) {
                    TL_stars.StarGift starGift = savedStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        Gift gift3 = new Gift((TL_stars.TL_starGiftUnique) starGift);
                        if (!this.giftIds.contains(Long.valueOf(gift3.id))) {
                            this.gifts.add(gift3);
                            this.giftIds.add(Long.valueOf(gift3.id));
                        }
                    }
                }
            }
        }
        if (this.gifts.size() == this.oldGifts.size()) {
            for (int i4 = 0; i4 < this.gifts.size(); i4++) {
                if (((Gift) this.gifts.get(i4)).equals((Gift) this.oldGifts.get(i4))) {
                }
            }
            z = false;
            for (i = 0; i < this.gifts.size(); i++) {
                Gift gift4 = (Gift) this.gifts.get(i);
                int i5 = 0;
                while (true) {
                    if (i5 >= this.oldGifts.size()) {
                        gift2 = null;
                        break;
                    } else {
                        if (((Gift) this.oldGifts.get(i5)).id == gift4.id) {
                            gift2 = (Gift) this.oldGifts.get(i5);
                            break;
                        }
                        i5++;
                    }
                }
                if (gift2 != null) {
                    gift4.copy(gift2);
                } else {
                    float dp = AndroidUtilities.dp(22.5f);
                    int i6 = gift4.color;
                    gift4.gradient = new RadialGradient(0.0f, 0.0f, dp, new int[]{i6, Theme.multAlpha(i6, 0.0f)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    Paint paint = new Paint(1);
                    gift4.gradientPaint = paint;
                    paint.setShader(gift4.gradient);
                    TLRPC.Document document = gift4.document;
                    gift4.emojiDrawable = document != null ? AnimatedEmojiDrawable.make(this.currentAccount, 0, document) : AnimatedEmojiDrawable.make(this.currentAccount, 0, gift4.documentId);
                    AnimatedFloat animatedFloat = new AnimatedFloat(this, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
                    gift4.animatedFloat = animatedFloat;
                    animatedFloat.force(0.0f);
                    if (isAttachedToWindow()) {
                        gift4.emojiDrawable.addView(this);
                    }
                }
            }
            for (i2 = 0; i2 < this.oldGifts.size(); i2++) {
                Gift gift5 = (Gift) this.oldGifts.get(i2);
                int i7 = 0;
                while (true) {
                    if (i7 >= this.gifts.size()) {
                        gift = null;
                        break;
                    } else {
                        if (((Gift) this.gifts.get(i7)).id == gift5.id) {
                            gift = (Gift) this.gifts.get(i7);
                            break;
                        }
                        i7++;
                    }
                }
                if (gift == null) {
                    gift5.emojiDrawable.removeView(this);
                    gift5.emojiDrawable = null;
                    gift5.gradient = null;
                }
            }
            if (z) {
                return;
            }
            invalidate();
            return;
        }
        z = true;
        while (i < this.gifts.size()) {
        }
        while (i2 < this.oldGifts.size()) {
        }
        if (z) {
        }
    }
}
