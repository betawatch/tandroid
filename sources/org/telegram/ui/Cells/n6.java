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
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.zs;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class n6 extends FrameLayout {
    public static final bc0 D;
    public static final bc0 E;
    public static final bc0 F;
    public static final bc0 G;
    public float B;
    public ValueAnimator C;
    public boolean a;
    public final int b;
    public final m6 c;
    public final ig.c d;
    public final org.telegram.ui.ActionBar.k5 e;
    public final org.telegram.ui.Components.p9 f;
    public final org.telegram.ui.Components.p9 h;
    public int n;
    public final org.telegram.ui.Components.z8 r;
    public final lw0 s;
    public final org.telegram.ui.ActionBar.f6 v;
    public final int w;
    public long x;
    public final l6 y;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.j6.y6;
        D = new bc0(i10, i11);
        bc0 bc0Var = new bc0(R.drawable.msg_reactions, i11);
        bc0Var.g = 16;
        bc0Var.h = 16;
        bc0Var.i = 5.66f;
        E = bc0Var;
        int i12 = R.drawable.mini_repost_story;
        int i13 = org.telegram.ui.ActionBar.j6.hk;
        F = new bc0(i12, i13);
        G = new bc0(R.drawable.mini_forward_story, i13);
    }

    public n6(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, boolean z10) {
        super(context);
        this.r = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        this.B = 1.0f;
        this.w = i10;
        this.b = i11;
        this.v = f6Var;
        this.y = new l6(this, f6Var);
        setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(50.0f)));
        int i12 = i10 == 1 ? 48 : 34;
        m6 m6Var = new m6(this, context, i10);
        this.c = m6Var;
        float f10 = i12;
        m6Var.setRoundRadius(AndroidUtilities.dp(f10));
        addView(m6Var, k7.b6.i(f10, f10, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i10 == 1) {
            setClipChildren(false);
        }
        ig.c cVar = new ig.c(context, 3);
        this.d = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        cVar.setTextSize(16);
        cVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var));
        cVar.setEllipsizeByGradient(true);
        cVar.setImportantForAccessibility(2);
        cVar.setRightPadding(AndroidUtilities.dp(30.0f));
        cVar.setTranslationX(LocaleController.isRTL ? AndroidUtilities.dp(30.0f) : 0.0f);
        cVar.setRightDrawableOutside(true);
        float f11 = i10 == 1 ? 7.66f : 5.33f;
        float f12 = i10 == 1 ? 73.0f : 55.0f;
        addView(cVar, k7.b6.i(-1.0f, -2.0f, 55, f12, f11, 12.0f, 0.0f));
        lw0 lw0Var = new lw0(this);
        this.s = lw0Var;
        cVar.setDrawablePadding(AndroidUtilities.dp(3.0f));
        cVar.i(lw0Var.a);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.e = k5Var;
        k5Var.setTextSize(13);
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y6, f6Var));
        k5Var.setEllipsizeByGradient(true);
        k5Var.setImportantForAccessibility(2);
        k5Var.setTranslationX(LocaleController.isRTL ? AndroidUtilities.dp(30.0f) : 0.0f);
        addView(k5Var, k7.b6.i(-1.0f, -2.0f, 55, f12, i10 == 1 ? 24.0f : 19.0f, 20.0f, 0.0f));
        if (z10) {
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
            this.f = p9Var;
            addView(p9Var, k7.b6.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(context);
            this.h = p9Var2;
            addView(p9Var2, k7.b6.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z4) {
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            addView(view, k7.b6.c(-1.0f, -1));
        }
    }

    public final void a(float f10, boolean z4) {
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.C = null;
        }
        if (!z4) {
            this.B = f10;
            invalidate();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.B, f10);
        this.C = ofFloat;
        ofFloat.addUpdateListener(new r(this, 4));
        this.C.addListener(new org.telegram.ui.ActionBar.a1(this, f10, 2));
        this.C.setInterpolator(nr.h);
        this.C.setDuration(420L);
        this.C.start();
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
    /* JADX WARN: Type inference failed for: r6v4, types: [android.view.View, org.telegram.ui.ActionBar.k5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TLRPC.User user, TLRPC.Chat chat, TLRPC.Reaction reaction, boolean z4, long j10, TL_stories.StoryItem storyItem, boolean z10, boolean z11, boolean z12) {
        String formatString;
        boolean z13;
        boolean z14;
        long j11;
        float f10;
        float f11;
        TL_stories.StoryFwdHeader storyFwdHeader;
        TLRPC.Document document;
        org.telegram.ui.Components.p9 p9Var;
        TLRPC.Photo photo;
        org.telegram.ui.Components.z8 z8Var;
        TLRPC.User user2 = user == null ? chat : user;
        if (user2 == null) {
            return;
        }
        int i10 = this.w == 1 ? org.telegram.ui.ActionBar.j6.G6 : org.telegram.ui.ActionBar.j6.z9;
        org.telegram.ui.ActionBar.f6 f6Var = this.v;
        this.s.a(user, chat, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), false);
        org.telegram.ui.Components.z8 z8Var2 = this.r;
        int i11 = this.b;
        z8Var2.j(i11, user2);
        ig.c cVar = this.d;
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
            this.c.h(ImageLocation.getForUserOrChat(i11, user2, 1), "50_50", z8Var2, user2);
            org.telegram.ui.Components.p9 p9Var2 = this.f;
            if (!z4) {
            }
            org.telegram.ui.Components.p9 p9Var3 = this.h;
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
            cVar.setRightPadding(AndroidUtilities.dp(z13 ? 30.0f : 0.0f));
            cVar.setTranslationX((z13 || !LocaleController.isRTL) ? 0.0f : AndroidUtilities.dp(30.0f));
            ((ViewGroup.MarginLayoutParams) r62.getLayoutParams()).rightMargin = AndroidUtilities.dp((z13 || LocaleController.isRTL) ? 12.0f : 36.0f);
            if (z13) {
            }
            r62.setTranslationX(f10);
        }
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null) {
            ?? r13 = userProfilePhoto.strippedBitmap;
            z8Var = r13;
        }
        this.c.h(ImageLocation.getForUserOrChat(i11, user2, 1), "50_50", z8Var2, user2);
        org.telegram.ui.Components.p9 p9Var22 = this.f;
        if (!z4) {
            if (p9Var22 != null) {
                p9Var22.setAnimatedEmojiDrawable(null);
            }
            Drawable mutate = getContext().getDrawable(R.drawable.media_like_active).mutate();
            p9Var22.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
            p9Var22.setImageDrawable(mutate);
            formatString = LocaleController.formatString("AccDescrLike", R.string.AccDescrLike, new Object[0]);
            z13 = true;
        } else if (reaction != null) {
            mg.q0 d = mg.q0.d(reaction);
            if (d.f != null) {
                if (p9Var22 != null) {
                    p9Var22.setAnimatedEmojiDrawable(null);
                }
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(d.f);
                if (p9Var22 != null) {
                    if (tL_availableReaction != null) {
                        p9Var22.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", DocumentObject.getSvgThumb(tL_availableReaction.static_icon.thumbs, org.telegram.ui.ActionBar.j6.a7, 1.0f), tL_availableReaction);
                        z14 = true;
                    } else {
                        p9Var22.setImageDrawable(null);
                        z14 = false;
                    }
                    p9Var22.setColorFilter(null);
                } else {
                    z14 = false;
                }
            } else {
                org.telegram.ui.Components.l5 l5Var = new org.telegram.ui.Components.l5(0, i11, d.g);
                l5Var.setColorFilter(org.telegram.ui.ActionBar.j6.n0(f6Var));
                if (p9Var22 != null) {
                    p9Var22.setAnimatedEmojiDrawable(l5Var);
                }
                z14 = true;
            }
            int i12 = R.string.AccDescrReactedWith;
            CharSequence text = cVar.getText();
            Object obj = d.f;
            if (obj == null) {
                obj = reaction;
            }
            formatString = LocaleController.formatString("AccDescrReactedWith", i12, text, obj);
            z13 = z14;
        } else {
            if (p9Var22 != null) {
                p9Var22.setAnimatedEmojiDrawable(null);
                p9Var22.setImageDrawable(null);
            }
            formatString = LocaleController.formatString("AccDescrPersonHasSeen", R.string.AccDescrPersonHasSeen, cVar.getText());
            z13 = false;
        }
        org.telegram.ui.Components.p9 p9Var32 = this.h;
        if (storyItem == null) {
            this.n = storyItem.id;
            if (p9Var32 != null) {
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia == null || (photo = messageMedia.photo) == null) {
                    if (messageMedia != null && (document = messageMedia.document) != null) {
                        p9Var = p9Var32;
                        p9Var.j(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 35, false, null, true), storyItem.media.document), "22_35", null, null, -1, storyItem);
                    }
                    p9Var32.setRoundRadius(AndroidUtilities.dp(3.33f));
                } else {
                    p9Var = p9Var32;
                    p9Var.j(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 35, false, null, true), storyItem.media.photo), "22_35", null, null, -1, storyItem);
                }
                p9Var32 = p9Var;
                p9Var32.setRoundRadius(AndroidUtilities.dp(3.33f));
            }
            if (j10 <= 0) {
                j11 = storyItem.date;
                if (j11 != 0) {
                    StringBuilder f12 = vh.v2.f(formatString, " ");
                    f12.append(LocaleController.formatSeenDate(j11));
                    formatString = f12.toString();
                }
                setContentDescription(formatString);
                f10 = 0.0f;
                ?? r622 = this.e;
                if (j11 != 0) {
                    r622.setVisibility(0);
                    bc0 bc0Var = storyItem != null ? z10 ? G : F : z11 ? D : E;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(bc0Var.a(getContext(), f6Var));
                    spannableStringBuilder.append((CharSequence) LocaleController.formatSeenDate(j11));
                    if (z10 || storyItem == null) {
                        f11 = 9.0f;
                    } else {
                        f11 = 9.0f;
                        if (!TextUtils.isEmpty(storyItem.caption)) {
                            spannableStringBuilder.append((CharSequence) "\u2004");
                            spannableStringBuilder.append((CharSequence) ".");
                            zs zsVar = new zs();
                            zsVar.c = 2.33333f;
                            zsVar.b = AndroidUtilities.dp(5.0f);
                            spannableStringBuilder.setSpan(zsVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.append((CharSequence) "\u2004");
                            int length = spannableStringBuilder.length();
                            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryRepostCommented));
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length, spannableStringBuilder.length(), 33);
                            r622.l(spannableStringBuilder, false);
                            r622.setTranslationY(z11 ? AndroidUtilities.dp(-1.0f) : 0.0f);
                            cVar.setTranslationY(0.0f);
                            if (z12) {
                                cVar.setTranslationY(AndroidUtilities.dp(f11));
                                cVar.animate().translationY(0.0f);
                                r622.setAlpha(0.0f);
                                r622.animate().alpha(1.0f);
                            }
                        }
                    }
                    if (!z10 && storyItem != null && (storyFwdHeader = storyItem.fwd_from) != null && storyFwdHeader.modified) {
                        spannableStringBuilder.append((CharSequence) "\u2004");
                        spannableStringBuilder.append((CharSequence) ".");
                        zs zsVar2 = new zs();
                        zsVar2.c = 2.33333f;
                        zsVar2.b = AndroidUtilities.dp(5.0f);
                        spannableStringBuilder.setSpan(zsVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) "\u2004");
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) "edited");
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length2, spannableStringBuilder.length(), 33);
                    }
                    r622.l(spannableStringBuilder, false);
                    r622.setTranslationY(z11 ? AndroidUtilities.dp(-1.0f) : 0.0f);
                    cVar.setTranslationY(0.0f);
                    if (z12) {
                    }
                } else {
                    r622.setVisibility(8);
                    cVar.setTranslationY(AndroidUtilities.dp(9.0f));
                }
                cVar.setRightPadding(AndroidUtilities.dp(z13 ? 30.0f : 0.0f));
                cVar.setTranslationX((z13 || !LocaleController.isRTL) ? 0.0f : AndroidUtilities.dp(30.0f));
                ((ViewGroup.MarginLayoutParams) r622.getLayoutParams()).rightMargin = AndroidUtilities.dp((z13 || LocaleController.isRTL) ? 12.0f : 36.0f);
                if (z13 && LocaleController.isRTL) {
                    f10 = AndroidUtilities.dp(30.0f);
                }
                r622.setTranslationX(f10);
            }
        } else {
            this.n = -1;
            if (p9Var32 != null) {
                p9Var32.setImageDrawable(null);
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
        cVar.setRightPadding(AndroidUtilities.dp(z13 ? 30.0f : 0.0f));
        cVar.setTranslationX((z13 || !LocaleController.isRTL) ? 0.0f : AndroidUtilities.dp(30.0f));
        ((ViewGroup.MarginLayoutParams) r6222.getLayoutParams()).rightMargin = AndroidUtilities.dp((z13 || LocaleController.isRTL) ? 12.0f : 36.0f);
        if (z13) {
            f10 = AndroidUtilities.dp(30.0f);
        }
        r6222.setTranslationX(f10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        if (this.B < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (this.B * 255.0f), 31);
            z4 = true;
        } else {
            z4 = false;
        }
        super.dispatchDraw(canvas);
        if (this.a) {
            float dp = AndroidUtilities.dp(this.w == 1 ? 73.0f : 55.0f);
            boolean z10 = LocaleController.isRTL;
            org.telegram.ui.ActionBar.f6 f6Var = this.v;
            if (z10) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.T0("paintDivider", f6Var));
            } else {
                canvas.drawLine(dp, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.T0("paintDivider", f6Var));
            }
        }
        if (z4) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.B;
    }

    public org.telegram.ui.ActionBar.f6 getResourcesProvider() {
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

    public void b(long j10) {
    }
}
