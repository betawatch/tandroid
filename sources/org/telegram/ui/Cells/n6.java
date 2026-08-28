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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.qs;
import org.telegram.ui.Components.sv0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class n6 extends FrameLayout {
    public static final hb0 C;
    public static final hb0 D;
    public static final hb0 E;
    public static final hb0 F;
    public float A;
    public ValueAnimator B;
    public boolean a;
    public final int b;
    public final m6 c;
    public final dg.c d;
    public final org.telegram.ui.ActionBar.h5 e;
    public final org.telegram.ui.Components.o9 f;
    public final org.telegram.ui.Components.o9 h;
    public int n;
    public final org.telegram.ui.Components.z8 r;
    public final sv0 s;
    public final org.telegram.ui.ActionBar.b6 v;
    public final int w;
    public long x;
    public final l6 y;

    static {
        int i9 = R.drawable.msg_mini_checks;
        int i10 = org.telegram.ui.ActionBar.f6.y6;
        C = new hb0(i9, i10);
        hb0 hb0Var = new hb0(R.drawable.msg_reactions, i10);
        hb0Var.g = 16;
        hb0Var.h = 16;
        hb0Var.i = 5.66f;
        D = hb0Var;
        int i11 = R.drawable.mini_repost_story;
        int i12 = org.telegram.ui.ActionBar.f6.hk;
        E = new hb0(i11, i12);
        F = new hb0(R.drawable.mini_forward_story, i12);
    }

    public n6(int i9, int i10, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, boolean z11) {
        super(context);
        this.r = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        this.A = 1.0f;
        this.w = i9;
        this.b = i10;
        this.v = b6Var;
        this.y = new l6(this, b6Var);
        setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(50.0f)));
        int i11 = i9 == 1 ? 48 : 34;
        m6 m6Var = new m6(this, context, i9);
        this.c = m6Var;
        float f10 = i11;
        m6Var.setRoundRadius(AndroidUtilities.dp(f10));
        addView(m6Var, g7.e6.i(f10, f10, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i9 == 1) {
            setClipChildren(false);
        }
        dg.c cVar = new dg.c(context, 3);
        this.d = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        cVar.setTextSize(16);
        cVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var));
        cVar.setEllipsizeByGradient(true);
        cVar.setImportantForAccessibility(2);
        cVar.setRightPadding(AndroidUtilities.dp(30.0f));
        cVar.setTranslationX(LocaleController.isRTL ? AndroidUtilities.dp(30.0f) : 0.0f);
        cVar.setRightDrawableOutside(true);
        float f11 = i9 == 1 ? 7.66f : 5.33f;
        float f12 = i9 == 1 ? 73.0f : 55.0f;
        addView(cVar, g7.e6.i(-1.0f, -2.0f, 55, f12, f11, 12.0f, 0.0f));
        sv0 sv0Var = new sv0(this);
        this.s = sv0Var;
        cVar.setDrawablePadding(AndroidUtilities.dp(3.0f));
        cVar.i(sv0Var.a);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.e = h5Var;
        h5Var.setTextSize(13);
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.y6, b6Var));
        h5Var.setEllipsizeByGradient(true);
        h5Var.setImportantForAccessibility(2);
        h5Var.setTranslationX(LocaleController.isRTL ? AndroidUtilities.dp(30.0f) : 0.0f);
        addView(h5Var, g7.e6.i(-1.0f, -2.0f, 55, f12, i9 == 1 ? 24.0f : 19.0f, 20.0f, 0.0f));
        if (z11) {
            org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
            this.f = o9Var;
            addView(o9Var, g7.e6.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            org.telegram.ui.Components.o9 o9Var2 = new org.telegram.ui.Components.o9(context);
            this.h = o9Var2;
            addView(o9Var2, g7.e6.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z10) {
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
            addView(view, g7.e6.c(-1.0f, -1));
        }
    }

    public final void a(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B = null;
        }
        if (!z10) {
            this.A = f10;
            invalidate();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.A, f10);
        this.B = ofFloat;
        ofFloat.addUpdateListener(new r(this, 4));
        this.B.addListener(new org.telegram.ui.ActionBar.a1(this, f10, 2));
        this.B.setInterpolator(gr.h);
        this.B.setDuration(420L);
        this.B.start();
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
    /* JADX WARN: Type inference failed for: r20v0, types: [android.view.View, org.telegram.ui.Cells.n6] */
    /* JADX WARN: Type inference failed for: r22v0, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.view.View, org.telegram.ui.ActionBar.h5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TLRPC.User user, TLRPC.Chat chat, TLRPC.Reaction reaction, boolean z10, long j10, TL_stories.StoryItem storyItem, boolean z11, boolean z12, boolean z13) {
        String formatString;
        boolean z14;
        boolean z15;
        long j11;
        float f10;
        float f11;
        TL_stories.StoryFwdHeader storyFwdHeader;
        TLRPC.Document document;
        org.telegram.ui.Components.o9 o9Var;
        TLRPC.Photo photo;
        org.telegram.ui.Components.z8 z8Var;
        TLRPC.User user2 = user == null ? chat : user;
        if (user2 == null) {
            return;
        }
        int i9 = this.w == 1 ? org.telegram.ui.ActionBar.f6.G6 : org.telegram.ui.ActionBar.f6.z9;
        org.telegram.ui.ActionBar.b6 b6Var = this.v;
        this.s.a(user, chat, org.telegram.ui.ActionBar.f6.v0(i9, b6Var), false);
        org.telegram.ui.Components.z8 z8Var2 = this.r;
        int i10 = this.b;
        z8Var2.j(i10, user2);
        dg.c cVar = this.d;
        if (user != null) {
            this.x = user.id;
            cVar.k(UserObject.getUserName(user));
        } else {
            this.x = -chat.id;
            cVar.k(chat.title);
        }
        if (user == null) {
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            if (chatPhoto != null) {
                ?? r12 = chatPhoto.strippedBitmap;
                z8Var = r12;
            }
            this.c.h(ImageLocation.getForUserOrChat(i10, user2, 1), "50_50", z8Var2, user2);
            org.telegram.ui.Components.o9 o9Var2 = this.f;
            if (!z10) {
            }
            org.telegram.ui.Components.o9 o9Var3 = this.h;
            if (storyItem == null) {
            }
            j11 = j10;
            if (j11 != 0) {
            }
            setContentDescription(formatString);
            f10 = 0.0f;
            ?? r62 = this.e;
            if (j11 != 0) {
            }
            cVar.setRightPadding(AndroidUtilities.dp(z14 ? 30.0f : 0.0f));
            cVar.setTranslationX((z14 || !LocaleController.isRTL) ? 0.0f : AndroidUtilities.dp(30.0f));
            ((ViewGroup.MarginLayoutParams) r62.getLayoutParams()).rightMargin = AndroidUtilities.dp((z14 || LocaleController.isRTL) ? 12.0f : 36.0f);
            if (z14) {
            }
            r62.setTranslationX(f10);
        }
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null) {
            ?? r13 = userProfilePhoto.strippedBitmap;
            z8Var = r13;
        }
        this.c.h(ImageLocation.getForUserOrChat(i10, user2, 1), "50_50", z8Var2, user2);
        org.telegram.ui.Components.o9 o9Var22 = this.f;
        if (!z10) {
            if (o9Var22 != null) {
                o9Var22.setAnimatedEmojiDrawable(null);
            }
            Drawable mutate = getContext().getDrawable(R.drawable.media_like_active).mutate();
            o9Var22.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
            o9Var22.setImageDrawable(mutate);
            formatString = LocaleController.formatString("AccDescrLike", R.string.AccDescrLike, new Object[0]);
            z14 = true;
        } else if (reaction != null) {
            hg.r0 d = hg.r0.d(reaction);
            if (d.f != null) {
                if (o9Var22 != null) {
                    o9Var22.setAnimatedEmojiDrawable(null);
                }
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(d.f);
                if (o9Var22 != null) {
                    if (tL_availableReaction != null) {
                        o9Var22.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", DocumentObject.getSvgThumb(tL_availableReaction.static_icon.thumbs, org.telegram.ui.ActionBar.f6.a7, 1.0f), tL_availableReaction);
                        z15 = true;
                    } else {
                        o9Var22.setImageDrawable(null);
                        z15 = false;
                    }
                    o9Var22.setColorFilter(null);
                } else {
                    z15 = false;
                }
            } else {
                org.telegram.ui.Components.k5 k5Var = new org.telegram.ui.Components.k5(0, i10, d.g);
                k5Var.setColorFilter(org.telegram.ui.ActionBar.f6.n0(b6Var));
                if (o9Var22 != null) {
                    o9Var22.setAnimatedEmojiDrawable(k5Var);
                }
                z15 = true;
            }
            int i11 = R.string.AccDescrReactedWith;
            CharSequence text = cVar.getText();
            Object obj = d.f;
            if (obj == null) {
                obj = reaction;
            }
            formatString = LocaleController.formatString("AccDescrReactedWith", i11, text, obj);
            z14 = z15;
        } else {
            if (o9Var22 != null) {
                o9Var22.setAnimatedEmojiDrawable(null);
                o9Var22.setImageDrawable(null);
            }
            formatString = LocaleController.formatString("AccDescrPersonHasSeen", R.string.AccDescrPersonHasSeen, cVar.getText());
            z14 = false;
        }
        org.telegram.ui.Components.o9 o9Var32 = this.h;
        if (storyItem == null) {
            this.n = storyItem.id;
            if (o9Var32 != null) {
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia == null || (photo = messageMedia.photo) == null) {
                    if (messageMedia != null && (document = messageMedia.document) != null) {
                        o9Var = o9Var32;
                        o9Var.j(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 35, false, null, true), storyItem.media.document), "22_35", null, null, -1, storyItem);
                    }
                    o9Var32.setRoundRadius(AndroidUtilities.dp(3.33f));
                } else {
                    o9Var = o9Var32;
                    o9Var.j(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 35, false, null, true), storyItem.media.photo), "22_35", null, null, -1, storyItem);
                }
                o9Var32 = o9Var;
                o9Var32.setRoundRadius(AndroidUtilities.dp(3.33f));
            }
            if (j10 <= 0) {
                j11 = storyItem.date;
                if (j11 != 0) {
                    StringBuilder e10 = ta.b.e(formatString, " ");
                    e10.append(LocaleController.formatSeenDate(j11));
                    formatString = e10.toString();
                }
                setContentDescription(formatString);
                f10 = 0.0f;
                ?? r622 = this.e;
                if (j11 != 0) {
                    r622.setVisibility(0);
                    hb0 hb0Var = storyItem != null ? z11 ? F : E : z12 ? C : D;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(hb0Var.a(getContext(), b6Var));
                    spannableStringBuilder.append((CharSequence) LocaleController.formatSeenDate(j11));
                    if (z11 || storyItem == null) {
                        f11 = 9.0f;
                    } else {
                        f11 = 9.0f;
                        if (!TextUtils.isEmpty(storyItem.caption)) {
                            spannableStringBuilder.append((CharSequence) "\u2004");
                            spannableStringBuilder.append((CharSequence) ".");
                            qs qsVar = new qs();
                            qsVar.c = 2.33333f;
                            qsVar.b = AndroidUtilities.dp(5.0f);
                            spannableStringBuilder.setSpan(qsVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.append((CharSequence) "\u2004");
                            int length = spannableStringBuilder.length();
                            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryRepostCommented));
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length, spannableStringBuilder.length(), 33);
                            r622.l(spannableStringBuilder, false);
                            r622.setTranslationY(z12 ? AndroidUtilities.dp(-1.0f) : 0.0f);
                            cVar.setTranslationY(0.0f);
                            if (z13) {
                                cVar.setTranslationY(AndroidUtilities.dp(f11));
                                cVar.animate().translationY(0.0f);
                                r622.setAlpha(0.0f);
                                r622.animate().alpha(1.0f);
                            }
                        }
                    }
                    if (!z11 && storyItem != null && (storyFwdHeader = storyItem.fwd_from) != null && storyFwdHeader.modified) {
                        spannableStringBuilder.append((CharSequence) "\u2004");
                        spannableStringBuilder.append((CharSequence) ".");
                        qs qsVar2 = new qs();
                        qsVar2.c = 2.33333f;
                        qsVar2.b = AndroidUtilities.dp(5.0f);
                        spannableStringBuilder.setSpan(qsVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) "\u2004");
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) "edited");
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length2, spannableStringBuilder.length(), 33);
                    }
                    r622.l(spannableStringBuilder, false);
                    r622.setTranslationY(z12 ? AndroidUtilities.dp(-1.0f) : 0.0f);
                    cVar.setTranslationY(0.0f);
                    if (z13) {
                    }
                } else {
                    r622.setVisibility(8);
                    cVar.setTranslationY(AndroidUtilities.dp(9.0f));
                }
                cVar.setRightPadding(AndroidUtilities.dp(z14 ? 30.0f : 0.0f));
                cVar.setTranslationX((z14 || !LocaleController.isRTL) ? 0.0f : AndroidUtilities.dp(30.0f));
                ((ViewGroup.MarginLayoutParams) r622.getLayoutParams()).rightMargin = AndroidUtilities.dp((z14 || LocaleController.isRTL) ? 12.0f : 36.0f);
                if (z14 && LocaleController.isRTL) {
                    f10 = AndroidUtilities.dp(30.0f);
                }
                r622.setTranslationX(f10);
            }
        } else {
            this.n = -1;
            if (o9Var32 != null) {
                o9Var32.setImageDrawable(null);
            }
        }
        j11 = j10;
        if (j11 != 0) {
        }
        setContentDescription(formatString);
        f10 = 0.0f;
        ?? r6222 = this.e;
        if (j11 != 0) {
        }
        cVar.setRightPadding(AndroidUtilities.dp(z14 ? 30.0f : 0.0f));
        cVar.setTranslationX((z14 || !LocaleController.isRTL) ? 0.0f : AndroidUtilities.dp(30.0f));
        ((ViewGroup.MarginLayoutParams) r6222.getLayoutParams()).rightMargin = AndroidUtilities.dp((z14 || LocaleController.isRTL) ? 12.0f : 36.0f);
        if (z14) {
            f10 = AndroidUtilities.dp(30.0f);
        }
        r6222.setTranslationX(f10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        if (this.A < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (this.A * 255.0f), 31);
            z10 = true;
        } else {
            z10 = false;
        }
        super.dispatchDraw(canvas);
        if (this.a) {
            float dp = AndroidUtilities.dp(this.w == 1 ? 73.0f : 55.0f);
            boolean z11 = LocaleController.isRTL;
            org.telegram.ui.ActionBar.b6 b6Var = this.v;
            if (z11) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.T0("paintDivider", b6Var));
            } else {
                canvas.drawLine(dp, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.T0("paintDivider", b6Var));
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.A;
    }

    public org.telegram.ui.ActionBar.b6 getResourcesProvider() {
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.w == 0 ? 50 : 58), TLObject.FLAG_30));
    }

    public void setUserReaction(TLRPC.MessagePeerReaction messagePeerReaction) {
        TLRPC.User user;
        if (messagePeerReaction == null) {
            return;
        }
        long peerId = MessageObject.getPeerId(messagePeerReaction.peer_id);
        int i9 = this.b;
        TLRPC.Chat chat = null;
        if (peerId > 0) {
            user = MessagesController.getInstance(i9).getUser(Long.valueOf(peerId));
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(i9).getChat(Long.valueOf(-peerId));
            user = null;
            chat = chat2;
        }
        c(user, chat, messagePeerReaction.reaction, false, messagePeerReaction.date, null, false, messagePeerReaction.dateIsSeen, false);
    }

    public void b(long j10) {
    }
}
