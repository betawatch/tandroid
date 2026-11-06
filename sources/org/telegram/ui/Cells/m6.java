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
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public class m6 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public static final oa0 H;
    public static final oa0 I;
    public static final oa0 J;
    public static final oa0 K;
    public long D;
    public final k6 E;
    public float F;
    public ValueAnimator G;
    public boolean a;
    public final int b;
    public final l6 c;
    public final di.d4 d;
    public final org.telegram.ui.ActionBar.k5 e;
    public final org.telegram.ui.Components.l9 f;
    public final org.telegram.ui.Components.l9 h;
    public int n;
    public final org.telegram.ui.Components.w8 r;
    public final View s;
    public final nu0 w;
    public final org.telegram.ui.ActionBar.f6 x;
    public final int y;

    static {
        int i7 = org.telegram.ui.ActionBar.k6.y6;
        H = new oa0(R.drawable.msg_mini_checks, i7);
        oa0 oa0Var = new oa0(R.drawable.msg_reactions, i7);
        oa0Var.g = 16;
        oa0Var.h = 16;
        oa0Var.i = 5.66f;
        I = oa0Var;
        int i10 = org.telegram.ui.ActionBar.k6.Vk;
        J = new oa0(R.drawable.mini_repost_story, i10);
        K = new oa0(R.drawable.mini_forward_story, i10);
    }

    public m6(int i7, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9, boolean z10) {
        super(context);
        this.r = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        this.F = 1.0f;
        this.y = i7;
        this.b = i10;
        this.x = f6Var;
        this.E = new k6(this, f6Var);
        setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(50.0f)));
        int i11 = i7 == 1 ? 48 : 34;
        l6 l6Var = new l6(this, context, i7);
        this.c = l6Var;
        float f10 = i11;
        l6Var.setRoundRadius(org.telegram.messenger.g0.L(f10));
        addView(l6Var, c8.ha.i(f10, f10, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i7 == 1) {
            setClipChildren(false);
        }
        di.d4 d4Var = new di.d4(context, 2);
        this.d = d4Var;
        qs.i(d4Var);
        d4Var.setTextSize(16);
        org.telegram.ui.ActionBar.r6.Y(d4Var, org.telegram.ui.ActionBar.k6.E8, f6Var);
        d4Var.setEllipsizeByGradient(true);
        d4Var.setImportantForAccessibility(2);
        d4Var.setRightPadding(org.telegram.messenger.g0.L(30.0f));
        d4Var.setTranslationX(hd.a0 ? org.telegram.messenger.g0.L(30.0f) : 0.0f);
        d4Var.setRightDrawableOutside(true);
        float f11 = i7 == 1 ? 7.66f : 5.33f;
        float f12 = i7 == 1 ? 73.0f : 55.0f;
        addView(d4Var, c8.ha.i(-1.0f, -2.0f, 55, f12, f11, 12.0f, 0.0f));
        nu0 nu0Var = new nu0(this);
        this.w = nu0Var;
        d4Var.setDrawablePadding(org.telegram.messenger.g0.L(3.0f));
        d4Var.i(nu0Var.a);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.e = k5Var;
        k5Var.setTextSize(13);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.y6, f6Var);
        k5Var.setEllipsizeByGradient(true);
        k5Var.setImportantForAccessibility(2);
        k5Var.setTranslationX(hd.a0 ? org.telegram.messenger.g0.L(30.0f) : 0.0f);
        addView(k5Var, c8.ha.i(-1.0f, -2.0f, 55, f12, i7 == 1 ? 24.0f : 19.0f, 20.0f, 0.0f));
        if (z10) {
            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
            this.f = l9Var;
            addView(l9Var, c8.ha.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            org.telegram.ui.Components.l9 l9Var2 = new org.telegram.ui.Components.l9(context);
            this.h = l9Var2;
            addView(l9Var2, c8.ha.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z9) {
            View view = new View(context);
            this.s = view;
            view.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
            addView(view, c8.ha.c(-1.0f, -1));
        }
    }

    public final void a(boolean z9, float f10) {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (!z9) {
            this.F = f10;
            invalidate();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, f10);
        this.G = ofFloat;
        ofFloat.addUpdateListener(new r(this, 4));
        this.G.addListener(new org.telegram.ui.ActionBar.t0(this, f10, 2));
        this.G.setInterpolator(xq.h);
        this.G.setDuration(420L);
        this.G.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0057, code lost:
    
        if (r1 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r1 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c3  */
    /* JADX WARN: Type inference failed for: r19v0, types: [android.view.View, org.telegram.ui.Cells.m6] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.graphics.drawable.BitmapDrawable] */
    /* JADX WARN: Type inference failed for: r1v49, types: [android.graphics.drawable.BitmapDrawable] */
    /* JADX WARN: Type inference failed for: r21v0, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View, org.telegram.ui.ActionBar.k5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TLRPC.User user, TLRPC.Chat chat, TLRPC.Reaction reaction, boolean z9, long j3, TL_stories.StoryItem storyItem, boolean z10, boolean z11, boolean z12) {
        String a02;
        boolean z13;
        boolean z14;
        String str;
        long j10;
        long j11;
        float f10;
        TL_stories.StoryFwdHeader storyFwdHeader;
        TLRPC.Document document;
        TLRPC.Photo photo;
        org.telegram.ui.Components.w8 w8Var;
        TLRPC.User user2 = user == null ? chat : user;
        if (user2 == null) {
            return;
        }
        int i7 = this.y == 1 ? org.telegram.ui.ActionBar.k6.G6 : org.telegram.ui.ActionBar.k6.z9;
        org.telegram.ui.ActionBar.f6 f6Var = this.x;
        this.w.b(user, chat, org.telegram.ui.ActionBar.k6.w0(i7, f6Var), false);
        org.telegram.ui.Components.w8 w8Var2 = this.r;
        w8Var2.p(user2);
        di.d4 d4Var = this.d;
        if (user != null) {
            this.D = user.id;
            d4Var.k(t10.p(user));
        } else {
            this.D = -chat.id;
            d4Var.k(chat.title);
        }
        if (user == null) {
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            if (chatPhoto != null) {
                ?? r12 = chatPhoto.strippedBitmap;
                w8Var = r12;
            }
            int i10 = this.b;
            this.c.j(hc.m(i10, 1, user2), "50_50", w8Var2, user2);
            org.telegram.ui.Components.l9 l9Var = this.f;
            if (!z9) {
            }
            org.telegram.ui.Components.l9 l9Var2 = this.h;
            if (storyItem == null) {
            }
            j11 = j3;
            if (j11 != j10) {
            }
            setContentDescription(a02);
            f10 = 0.0f;
            ?? r62 = this.e;
            if (j11 != j10) {
            }
            d4Var.setRightPadding(org.telegram.messenger.g0.L(z13 ? 30.0f : 0.0f));
            d4Var.setTranslationX((z13 || !hd.a0) ? 0.0f : org.telegram.messenger.g0.L(30.0f));
            ((ViewGroup.MarginLayoutParams) r62.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L((z13 || hd.a0) ? 12.0f : 36.0f);
            if (z13) {
            }
            r62.setTranslationX(f10);
        }
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null) {
            ?? r13 = userProfilePhoto.strippedBitmap;
            w8Var = r13;
        }
        int i102 = this.b;
        this.c.j(hc.m(i102, 1, user2), "50_50", w8Var2, user2);
        org.telegram.ui.Components.l9 l9Var3 = this.f;
        if (!z9) {
            if (l9Var3 != null) {
                l9Var3.setAnimatedEmojiDrawable(null);
            }
            Drawable mutate = getContext().getDrawable(R.drawable.media_like_active).mutate();
            l9Var3.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
            l9Var3.setImageDrawable(mutate);
            a02 = hd.a0("AccDescrLike", null, 2131754851, new Object[0]);
            z13 = true;
        } else if (reaction != null) {
            ch.o0 d = ch.o0.d(reaction);
            if (d.f != null) {
                if (l9Var3 != null) {
                    l9Var3.setAnimatedEmojiDrawable(null);
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(i102).r.get(d.f);
                if (l9Var3 != null) {
                    if (tL_availableReaction != null) {
                        l9Var3.k(hc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", org.telegram.messenger.t5.d(tL_availableReaction.static_icon.thumbs, org.telegram.ui.ActionBar.k6.a7, 1.0f, false), tL_availableReaction);
                        z14 = true;
                    } else {
                        l9Var3.setImageDrawable(null);
                        z14 = false;
                    }
                    l9Var3.setColorFilter(null);
                } else {
                    z14 = false;
                }
            } else {
                org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(0, i102, d.g);
                i5Var.setColorFilter(org.telegram.ui.ActionBar.k6.o0(f6Var));
                if (l9Var3 != null) {
                    l9Var3.setAnimatedEmojiDrawable(i5Var);
                }
                z14 = true;
            }
            CharSequence text = d4Var.getText();
            Object obj = d.f;
            if (obj == null) {
                obj = reaction;
            }
            z13 = z14;
            a02 = hd.a0("AccDescrReactedWith", null, 2131754791, text, obj);
        } else {
            if (l9Var3 != null) {
                l9Var3.setAnimatedEmojiDrawable(null);
                l9Var3.setImageDrawable(null);
            }
            a02 = hd.a0("AccDescrPersonHasSeen", null, 2131754812, d4Var.getText());
            z13 = false;
        }
        org.telegram.ui.Components.l9 l9Var22 = this.h;
        if (storyItem == null) {
            this.n = storyItem.id;
            if (l9Var22 != null) {
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia == null || (photo = messageMedia.photo) == null) {
                    str = null;
                    j10 = 0;
                    if (messageMedia != null && (document = messageMedia.document) != null) {
                        l9Var22.l(hc.c(org.telegram.messenger.w7.w(document.thumbs, 35, false, null, true), storyItem.media.document), "22_35", null, null, -1, storyItem);
                    }
                } else {
                    str = null;
                    j10 = 0;
                    l9Var22.l(hc.i(org.telegram.messenger.w7.w(photo.sizes, 35, false, null, true), storyItem.media.photo), "22_35", null, null, -1, storyItem);
                }
                l9Var22.setRoundRadius(org.telegram.messenger.g0.L(3.33f));
            } else {
                str = null;
                j10 = 0;
            }
            if (j3 <= j10) {
                j11 = storyItem.date;
                if (j11 != j10) {
                    StringBuilder j12 = rf.b.j(a02, " ");
                    j12.append(hd.O(j11));
                    a02 = j12.toString();
                }
                setContentDescription(a02);
                f10 = 0.0f;
                ?? r622 = this.e;
                if (j11 != j10) {
                    r622.setVisibility(0);
                    oa0 oa0Var = storyItem != null ? z10 ? K : J : z11 ? H : I;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(oa0Var.a(getContext(), f6Var));
                    spannableStringBuilder.append((CharSequence) hd.O(j11));
                    if (!z10 && storyItem != null) {
                        if (!TextUtils.isEmpty(storyItem.caption)) {
                            spannableStringBuilder.append((CharSequence) "\u2004");
                            spannableStringBuilder.append((CharSequence) ".");
                            fs fsVar = new fs();
                            fsVar.c = 2.33333f;
                            fsVar.b = org.telegram.messenger.g0.L(5.0f);
                            spannableStringBuilder.setSpan(fsVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.append((CharSequence) "\u2004");
                            int length = spannableStringBuilder.length();
                            spannableStringBuilder.append((CharSequence) hd.M0(2131744491, str));
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length, spannableStringBuilder.length(), 33);
                            r622.l(spannableStringBuilder, false);
                            r622.setTranslationY(z11 ? org.telegram.messenger.g0.L(-1.0f) : 0.0f);
                            d4Var.setTranslationY(0.0f);
                            if (z12) {
                                d4Var.setTranslationY(org.telegram.messenger.g0.L(9.0f));
                                d4Var.animate().translationY(0.0f);
                                r622.setAlpha(0.0f);
                                r622.animate().alpha(1.0f);
                            }
                        }
                    }
                    if (!z10 && storyItem != null && (storyFwdHeader = storyItem.fwd_from) != null && storyFwdHeader.modified) {
                        spannableStringBuilder.append((CharSequence) "\u2004");
                        spannableStringBuilder.append((CharSequence) ".");
                        fs fsVar2 = new fs();
                        fsVar2.c = 2.33333f;
                        fsVar2.b = org.telegram.messenger.g0.L(5.0f);
                        spannableStringBuilder.setSpan(fsVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) "\u2004");
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) "edited");
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length2, spannableStringBuilder.length(), 33);
                    }
                    r622.l(spannableStringBuilder, false);
                    r622.setTranslationY(z11 ? org.telegram.messenger.g0.L(-1.0f) : 0.0f);
                    d4Var.setTranslationY(0.0f);
                    if (z12) {
                    }
                } else {
                    r622.setVisibility(8);
                    d4Var.setTranslationY(org.telegram.messenger.g0.L(9.0f));
                }
                d4Var.setRightPadding(org.telegram.messenger.g0.L(z13 ? 30.0f : 0.0f));
                d4Var.setTranslationX((z13 || !hd.a0) ? 0.0f : org.telegram.messenger.g0.L(30.0f));
                ((ViewGroup.MarginLayoutParams) r622.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L((z13 || hd.a0) ? 12.0f : 36.0f);
                if (z13 && hd.a0) {
                    f10 = org.telegram.messenger.g0.L(30.0f);
                }
                r622.setTranslationX(f10);
            }
        } else {
            str = null;
            j10 = 0;
            this.n = -1;
            if (l9Var22 != null) {
                l9Var22.setImageDrawable(null);
            }
        }
        j11 = j3;
        if (j11 != j10) {
        }
        setContentDescription(a02);
        f10 = 0.0f;
        ?? r6222 = this.e;
        if (j11 != j10) {
        }
        d4Var.setRightPadding(org.telegram.messenger.g0.L(z13 ? 30.0f : 0.0f));
        d4Var.setTranslationX((z13 || !hd.a0) ? 0.0f : org.telegram.messenger.g0.L(30.0f));
        ((ViewGroup.MarginLayoutParams) r6222.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L((z13 || hd.a0) ? 12.0f : 36.0f);
        if (z13) {
            f10 = org.telegram.messenger.g0.L(30.0f);
        }
        r6222.setTranslationX(f10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z9;
        if (this.F < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (this.F * 255.0f), 31);
            z9 = true;
        } else {
            z9 = false;
        }
        super.dispatchDraw(canvas);
        if (this.a) {
            float L = org.telegram.messenger.g0.L(this.y == 1 ? 73.0f : 55.0f);
            boolean z10 = hd.a0;
            org.telegram.ui.ActionBar.f6 f6Var = this.x;
            if (z10) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.W0("paintDivider", f6Var));
            } else {
                canvas.drawLine(L, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.W0("paintDivider", f6Var));
            }
        }
        if (z9) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.F;
    }

    public org.telegram.ui.ActionBar.f6 getResourcesProvider() {
        return this.x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w.a.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.w.a.b();
        this.E.g();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.y == 0 ? 50 : 58), TLObject.FLAG_30));
    }

    public void setUserReaction(TLRPC.MessagePeerReaction messagePeerReaction) {
        TLRPC.User user;
        if (messagePeerReaction == null) {
            return;
        }
        long C1 = ij.C1(messagePeerReaction.peer_id);
        int i7 = this.b;
        TLRPC.Chat chat = null;
        if (C1 > 0) {
            user = qp.s1(i7).a2(Long.valueOf(C1));
        } else {
            TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-C1));
            user = null;
            chat = M0;
        }
        c(user, chat, messagePeerReaction.reaction, false, messagePeerReaction.date, null, false, messagePeerReaction.dateIsSeen, false);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        nu0 nu0Var = this.w;
        if (nu0Var != null) {
            try {
                org.telegram.ui.Components.g5 g5Var = nu0Var.a;
                if (!(g5Var != null) || g5Var.F == null) {
                    return;
                }
                g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(this.y == 1 ? org.telegram.ui.ActionBar.k6.G6 : org.telegram.ui.ActionBar.k6.z9, this.x)));
                di.d4 d4Var = this.d;
                if (d4Var != null) {
                    d4Var.invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void b(long j3) {
    }
}
