package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.bt;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public class o6 extends FrameLayout {
    public static final ac0 G;
    public static final ac0 H;
    public static final ac0 I;
    public static final ac0 J;
    public float E;
    public ValueAnimator F;
    public boolean a;
    public final int b;
    public final n6 c;
    public final ai.a6 d;
    public final org.telegram.ui.ActionBar.j5 e;
    public final org.telegram.ui.Components.u9 f;
    public final org.telegram.ui.Components.u9 h;
    public int n;
    public final org.telegram.ui.Components.f9 r;
    public final kw0 s;
    public final org.telegram.ui.ActionBar.e6 v;
    public final int w;
    public long x;
    public final m6 y;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.i6.y6;
        G = new ac0(i10, i11);
        ac0 ac0Var = new ac0(R.drawable.msg_reactions, i11);
        ac0Var.g = 16;
        ac0Var.h = 16;
        ac0Var.i = 5.66f;
        H = ac0Var;
        int i12 = R.drawable.mini_repost_story;
        int i13 = org.telegram.ui.ActionBar.i6.hk;
        I = new ac0(i12, i13);
        J = new ac0(R.drawable.mini_forward_story, i13);
    }

    public o6(int i10, int i11, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context);
        this.r = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.e6) null);
        this.E = 1.0f;
        this.w = i10;
        this.b = i11;
        this.v = e6Var;
        this.y = new m6(this, e6Var);
        setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(50.0f)));
        int i12 = i10 == 1 ? 48 : 34;
        n6 n6Var = new n6(this, context, i10);
        this.c = n6Var;
        float f7 = i12;
        n6Var.setRoundRadius(AndroidUtilities.dp(f7));
        addView(n6Var, w7.x5.i(f7, f7, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i10 == 1) {
            setClipChildren(false);
        }
        ai.a6 a6Var = new ai.a6(context, 2);
        this.d = a6Var;
        NotificationCenter.listenEmojiLoading(a6Var);
        a6Var.setTextSize(16);
        a6Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, e6Var));
        a6Var.setEllipsizeByGradient(true);
        a6Var.setImportantForAccessibility(2);
        a6Var.setRightPadding(AndroidUtilities.dp(30.0f));
        a6Var.setTranslationX(LocaleController.isRTL ? AndroidUtilities.dp(30.0f) : 0.0f);
        a6Var.setRightDrawableOutside(true);
        float f10 = i10 == 1 ? 7.66f : 5.33f;
        float f11 = i10 == 1 ? 73.0f : 55.0f;
        addView(a6Var, w7.x5.i(-1.0f, -2.0f, 55, f11, f10, 12.0f, 0.0f));
        kw0 kw0Var = new kw0(this);
        this.s = kw0Var;
        a6Var.setDrawablePadding(AndroidUtilities.dp(3.0f));
        a6Var.i(kw0Var.a);
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.e = j5Var;
        j5Var.setTextSize(13);
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.y6, e6Var));
        j5Var.setEllipsizeByGradient(true);
        j5Var.setImportantForAccessibility(2);
        j5Var.setTranslationX(LocaleController.isRTL ? AndroidUtilities.dp(30.0f) : 0.0f);
        addView(j5Var, w7.x5.i(-1.0f, -2.0f, 55, f11, i10 == 1 ? 24.0f : 19.0f, 20.0f, 0.0f));
        if (z11) {
            org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
            this.f = u9Var;
            addView(u9Var, w7.x5.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            org.telegram.ui.Components.u9 u9Var2 = new org.telegram.ui.Components.u9(context);
            this.h = u9Var2;
            addView(u9Var2, w7.x5.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z10) {
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.i6.K0(false));
            addView(view, w7.x5.c(-1.0f, -1));
        }
    }

    public final void a(float f7, boolean z10) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
        }
        if (!z10) {
            this.E = f7;
            invalidate();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, f7);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new r(this, 4));
        this.F.addListener(new org.telegram.ui.ActionBar.z0(this, f7, 2));
        this.F.setInterpolator(qr.h);
        this.F.setDuration(420L);
        this.F.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0059, code lost:
    
        if (r1 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r1 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02b8  */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.graphics.drawable.BitmapDrawable] */
    /* JADX WARN: Type inference failed for: r1v39, types: [android.graphics.drawable.BitmapDrawable] */
    /* JADX WARN: Type inference failed for: r20v0, types: [android.view.View, org.telegram.ui.Cells.o6] */
    /* JADX WARN: Type inference failed for: r22v0, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.view.View, org.telegram.ui.ActionBar.j5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TLRPC.User user, TLRPC.Chat chat, TLRPC.Reaction reaction, boolean z10, long j3, TL_stories.StoryItem storyItem, boolean z11, boolean z12, boolean z13) {
        String formatString;
        boolean z14;
        boolean z15;
        long j10;
        float f7;
        float f10;
        TL_stories.StoryFwdHeader storyFwdHeader;
        TLRPC.Document document;
        org.telegram.ui.Components.u9 u9Var;
        TLRPC.Photo photo;
        org.telegram.ui.Components.f9 f9Var;
        TLRPC.User user2 = user == null ? chat : user;
        if (user2 == null) {
            return;
        }
        int i10 = this.w == 1 ? org.telegram.ui.ActionBar.i6.G6 : org.telegram.ui.ActionBar.i6.z9;
        org.telegram.ui.ActionBar.e6 e6Var = this.v;
        this.s.a(user, chat, org.telegram.ui.ActionBar.i6.v0(i10, e6Var), false);
        org.telegram.ui.Components.f9 f9Var2 = this.r;
        int i11 = this.b;
        f9Var2.j(i11, user2);
        ai.a6 a6Var = this.d;
        if (user != null) {
            this.x = user.id;
            a6Var.k(UserObject.getUserName(user));
        } else {
            this.x = -chat.id;
            a6Var.k(chat.title);
        }
        if (user == null) {
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            if (chatPhoto != null) {
                ?? r12 = chatPhoto.strippedBitmap;
                f9Var = r12;
            }
            this.c.h(ImageLocation.getForUserOrChat(i11, user2, 1), "50_50", f9Var2, user2);
            org.telegram.ui.Components.u9 u9Var2 = this.f;
            if (!z10) {
            }
            org.telegram.ui.Components.u9 u9Var3 = this.h;
            if (storyItem == null) {
            }
            j10 = j3;
            if (j10 != 0) {
            }
            setContentDescription(formatString);
            f7 = 0.0f;
            ?? r62 = this.e;
            if (j10 != 0) {
            }
            a6Var.setRightPadding(AndroidUtilities.dp(z14 ? 30.0f : 0.0f));
            a6Var.setTranslationX((z14 || !LocaleController.isRTL) ? 0.0f : AndroidUtilities.dp(30.0f));
            ((ViewGroup.MarginLayoutParams) r62.getLayoutParams()).rightMargin = AndroidUtilities.dp((z14 || LocaleController.isRTL) ? 12.0f : 36.0f);
            if (z14) {
            }
            r62.setTranslationX(f7);
        }
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null) {
            ?? r13 = userProfilePhoto.strippedBitmap;
            f9Var = r13;
        }
        this.c.h(ImageLocation.getForUserOrChat(i11, user2, 1), "50_50", f9Var2, user2);
        org.telegram.ui.Components.u9 u9Var22 = this.f;
        if (!z10) {
            if (u9Var22 != null) {
                u9Var22.setAnimatedEmojiDrawable(null);
            }
            Drawable mutate = getContext().getDrawable(R.drawable.media_like_active).mutate();
            u9Var22.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
            u9Var22.setImageDrawable(mutate);
            formatString = LocaleController.formatString("AccDescrLike", R.string.AccDescrLike, new Object[0]);
            z14 = true;
        } else if (reaction != null) {
            zg.p0 d = zg.p0.d(reaction);
            if (d.f != null) {
                if (u9Var22 != null) {
                    u9Var22.setAnimatedEmojiDrawable(null);
                }
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(d.f);
                if (u9Var22 != null) {
                    if (tL_availableReaction != null) {
                        u9Var22.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", DocumentObject.getSvgThumb(tL_availableReaction.static_icon.thumbs, org.telegram.ui.ActionBar.i6.a7, 1.0f), tL_availableReaction);
                        z15 = true;
                    } else {
                        u9Var22.setImageDrawable(null);
                        z15 = false;
                    }
                    u9Var22.setColorFilter(null);
                } else {
                    z15 = false;
                }
            } else {
                org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(0, i11, d.g);
                o5Var.setColorFilter(org.telegram.ui.ActionBar.i6.n0(e6Var));
                if (u9Var22 != null) {
                    u9Var22.setAnimatedEmojiDrawable(o5Var);
                }
                z15 = true;
            }
            int i12 = R.string.AccDescrReactedWith;
            CharSequence text = a6Var.getText();
            Object obj = d.f;
            if (obj == null) {
                obj = reaction;
            }
            formatString = LocaleController.formatString("AccDescrReactedWith", i12, text, obj);
            z14 = z15;
        } else {
            if (u9Var22 != null) {
                u9Var22.setAnimatedEmojiDrawable(null);
                u9Var22.setImageDrawable(null);
            }
            formatString = LocaleController.formatString("AccDescrPersonHasSeen", R.string.AccDescrPersonHasSeen, a6Var.getText());
            z14 = false;
        }
        org.telegram.ui.Components.u9 u9Var32 = this.h;
        if (storyItem == null) {
            this.n = storyItem.id;
            if (u9Var32 != null) {
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia == null || (photo = messageMedia.photo) == null) {
                    if (messageMedia != null && (document = messageMedia.document) != null) {
                        u9Var = u9Var32;
                        u9Var.j(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 35, false, null, true), storyItem.media.document), "22_35", null, null, -1, storyItem);
                    }
                    u9Var32.setRoundRadius(AndroidUtilities.dp(3.33f));
                } else {
                    u9Var = u9Var32;
                    u9Var.j(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 35, false, null, true), storyItem.media.photo), "22_35", null, null, -1, storyItem);
                }
                u9Var32 = u9Var;
                u9Var32.setRoundRadius(AndroidUtilities.dp(3.33f));
            }
            if (j3 <= 0) {
                j10 = storyItem.date;
                if (j10 != 0) {
                    StringBuilder h = w.c.h(formatString, " ");
                    h.append(LocaleController.formatSeenDate(j10));
                    formatString = h.toString();
                }
                setContentDescription(formatString);
                f7 = 0.0f;
                ?? r622 = this.e;
                if (j10 != 0) {
                    r622.setVisibility(0);
                    ac0 ac0Var = storyItem != null ? z11 ? J : I : z12 ? G : H;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(ac0Var.a(getContext(), e6Var));
                    spannableStringBuilder.append((CharSequence) LocaleController.formatSeenDate(j10));
                    if (z11 || storyItem == null) {
                        f10 = 9.0f;
                    } else {
                        f10 = 9.0f;
                        if (!TextUtils.isEmpty(storyItem.caption)) {
                            spannableStringBuilder.append((CharSequence) "\u2004");
                            spannableStringBuilder.append((CharSequence) ".");
                            bt btVar = new bt();
                            btVar.c = 2.33333f;
                            btVar.b = AndroidUtilities.dp(5.0f);
                            spannableStringBuilder.setSpan(btVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.append((CharSequence) "\u2004");
                            int length = spannableStringBuilder.length();
                            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryRepostCommented));
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length, spannableStringBuilder.length(), 33);
                            r622.l(spannableStringBuilder, false);
                            r622.setTranslationY(z12 ? AndroidUtilities.dp(-1.0f) : 0.0f);
                            a6Var.setTranslationY(0.0f);
                            if (z13) {
                                a6Var.setTranslationY(AndroidUtilities.dp(f10));
                                a6Var.animate().translationY(0.0f);
                                r622.setAlpha(0.0f);
                                r622.animate().alpha(1.0f);
                            }
                        }
                    }
                    if (!z11 && storyItem != null && (storyFwdHeader = storyItem.fwd_from) != null && storyFwdHeader.modified) {
                        spannableStringBuilder.append((CharSequence) "\u2004");
                        spannableStringBuilder.append((CharSequence) ".");
                        bt btVar2 = new bt();
                        btVar2.c = 2.33333f;
                        btVar2.b = AndroidUtilities.dp(5.0f);
                        spannableStringBuilder.setSpan(btVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) "\u2004");
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) "edited");
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length2, spannableStringBuilder.length(), 33);
                    }
                    r622.l(spannableStringBuilder, false);
                    r622.setTranslationY(z12 ? AndroidUtilities.dp(-1.0f) : 0.0f);
                    a6Var.setTranslationY(0.0f);
                    if (z13) {
                    }
                } else {
                    r622.setVisibility(8);
                    a6Var.setTranslationY(AndroidUtilities.dp(9.0f));
                }
                a6Var.setRightPadding(AndroidUtilities.dp(z14 ? 30.0f : 0.0f));
                a6Var.setTranslationX((z14 || !LocaleController.isRTL) ? 0.0f : AndroidUtilities.dp(30.0f));
                ((ViewGroup.MarginLayoutParams) r622.getLayoutParams()).rightMargin = AndroidUtilities.dp((z14 || LocaleController.isRTL) ? 12.0f : 36.0f);
                if (z14 && LocaleController.isRTL) {
                    f7 = AndroidUtilities.dp(30.0f);
                }
                r622.setTranslationX(f7);
            }
        } else {
            this.n = -1;
            if (u9Var32 != null) {
                u9Var32.setImageDrawable(null);
            }
        }
        j10 = j3;
        if (j10 != 0) {
        }
        setContentDescription(formatString);
        f7 = 0.0f;
        ?? r6222 = this.e;
        if (j10 != 0) {
        }
        a6Var.setRightPadding(AndroidUtilities.dp(z14 ? 30.0f : 0.0f));
        a6Var.setTranslationX((z14 || !LocaleController.isRTL) ? 0.0f : AndroidUtilities.dp(30.0f));
        ((ViewGroup.MarginLayoutParams) r6222.getLayoutParams()).rightMargin = AndroidUtilities.dp((z14 || LocaleController.isRTL) ? 12.0f : 36.0f);
        if (z14) {
            f7 = AndroidUtilities.dp(30.0f);
        }
        r6222.setTranslationX(f7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        if (this.E < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (this.E * 255.0f), 31);
            z10 = true;
        } else {
            z10 = false;
        }
        super.dispatchDraw(canvas);
        if (this.a) {
            float dp = AndroidUtilities.dp(this.w == 1 ? 73.0f : 55.0f);
            boolean z11 = LocaleController.isRTL;
            org.telegram.ui.ActionBar.e6 e6Var = this.v;
            if (z11) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.T0("paintDivider", e6Var));
            } else {
                canvas.drawLine(dp, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.T0("paintDivider", e6Var));
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.E;
    }

    public org.telegram.ui.ActionBar.e6 getResourcesProvider() {
        return this.v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s.a.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.s.a.b();
        this.y.g();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.w == 0 ? 50 : 58), TLObject.FLAG_30));
    }

    public void setUserReaction(TLRPC.MessagePeerReaction messagePeerReaction) {
        TLRPC.User user;
        if (messagePeerReaction == null) {
            return;
        }
        long peerId = MessageObject.getPeerId(messagePeerReaction.peer_id);
        int i10 = this.b;
        TLRPC.Chat chat = null;
        if (peerId > 0) {
            user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerId));
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerId));
            user = null;
            chat = chat2;
        }
        c(user, chat, messagePeerReaction.reaction, false, messagePeerReaction.date, null, false, messagePeerReaction.dateIsSeen, false);
    }

    public void b(long j3) {
    }
}
