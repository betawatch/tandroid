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
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class l6 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final ja0 I;
    public static final ja0 J;
    public static final ja0 K;
    public static final ja0 L;
    public long E;
    public final j6 F;
    public float G;
    public ValueAnimator H;
    public boolean a;
    public final int b;
    public final k6 c;
    public final ei.e4 d;
    public final org.telegram.ui.ActionBar.k5 e;
    public final org.telegram.ui.Components.k9 f;
    public final org.telegram.ui.Components.k9 h;
    public int n;
    public final org.telegram.ui.Components.u8 r;
    public final View s;
    public final mu0 w;
    public final org.telegram.ui.ActionBar.e6 x;
    public final int y;

    static {
        int i3 = org.telegram.ui.ActionBar.k6.y6;
        I = new ja0(R.drawable.msg_mini_checks, i3);
        ja0 ja0Var = new ja0(R.drawable.msg_reactions, i3);
        ja0Var.g = 16;
        ja0Var.h = 16;
        ja0Var.i = 5.66f;
        J = ja0Var;
        int i10 = org.telegram.ui.ActionBar.k6.Vk;
        K = new ja0(R.drawable.mini_repost_story, i10);
        L = new ja0(R.drawable.mini_forward_story, i10);
    }

    public l6(int i3, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context);
        this.r = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.G = 1.0f;
        this.y = i3;
        this.b = i10;
        this.x = e6Var;
        this.F = new j6(this, e6Var);
        setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(50.0f)));
        int i11 = i3 == 1 ? 48 : 34;
        k6 k6Var = new k6(this, context, i3);
        this.c = k6Var;
        float f10 = i11;
        k6Var.setRoundRadius(org.telegram.messenger.g0.L(f10));
        addView(k6Var, mf.i(f10, f10, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i3 == 1) {
            setClipChildren(false);
        }
        ei.e4 e4Var = new ei.e4(context, 2);
        this.d = e4Var;
        hs.i(e4Var);
        e4Var.setTextSize(16);
        org.telegram.ui.ActionBar.r6.Y(e4Var, org.telegram.ui.ActionBar.k6.E8, e6Var);
        e4Var.setEllipsizeByGradient(true);
        e4Var.setImportantForAccessibility(2);
        e4Var.setRightPadding(org.telegram.messenger.g0.L(30.0f));
        e4Var.setTranslationX(bd.a0 ? org.telegram.messenger.g0.L(30.0f) : 0.0f);
        e4Var.setRightDrawableOutside(true);
        float f11 = i3 == 1 ? 7.66f : 5.33f;
        float f12 = i3 == 1 ? 73.0f : 55.0f;
        addView(e4Var, mf.i(-1.0f, -2.0f, 55, f12, f11, 12.0f, 0.0f));
        mu0 mu0Var = new mu0(this);
        this.w = mu0Var;
        e4Var.setDrawablePadding(org.telegram.messenger.g0.L(3.0f));
        e4Var.i(mu0Var.a);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.e = k5Var;
        k5Var.setTextSize(13);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.y6, e6Var);
        k5Var.setEllipsizeByGradient(true);
        k5Var.setImportantForAccessibility(2);
        k5Var.setTranslationX(bd.a0 ? org.telegram.messenger.g0.L(30.0f) : 0.0f);
        addView(k5Var, mf.i(-1.0f, -2.0f, 55, f12, i3 == 1 ? 24.0f : 19.0f, 20.0f, 0.0f));
        if (z11) {
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
            this.f = k9Var;
            addView(k9Var, mf.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            org.telegram.ui.Components.k9 k9Var2 = new org.telegram.ui.Components.k9(context);
            this.h = k9Var2;
            addView(k9Var2, mf.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z10) {
            View view = new View(context);
            this.s = view;
            view.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
            addView(view, mf.c(-1.0f, -1));
        }
    }

    public final void a(boolean z10, float f10) {
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.H = null;
        }
        if (!z10) {
            this.G = f10;
            invalidate();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, f10);
        this.H = ofFloat;
        ofFloat.addUpdateListener(new r(this, 4));
        this.H.addListener(new org.telegram.ui.ActionBar.s0(this, f10, 2));
        this.H.setInterpolator(xq.h);
        this.H.setDuration(420L);
        this.H.start();
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
    /* JADX WARN: Type inference failed for: r19v0, types: [android.view.View, org.telegram.ui.Cells.l6] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.graphics.drawable.BitmapDrawable] */
    /* JADX WARN: Type inference failed for: r1v49, types: [android.graphics.drawable.BitmapDrawable] */
    /* JADX WARN: Type inference failed for: r21v0, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View, org.telegram.ui.ActionBar.k5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TLRPC.User user, TLRPC.Chat chat, TLRPC.Reaction reaction, boolean z10, long j10, TL_stories.StoryItem storyItem, boolean z11, boolean z12, boolean z13) {
        String a02;
        boolean z14;
        boolean z15;
        String str;
        long j11;
        long j12;
        float f10;
        TL_stories.StoryFwdHeader storyFwdHeader;
        TLRPC.Document document;
        TLRPC.Photo photo;
        org.telegram.ui.Components.u8 u8Var;
        TLRPC.User user2 = user == null ? chat : user;
        if (user2 == null) {
            return;
        }
        int i3 = this.y == 1 ? org.telegram.ui.ActionBar.k6.G6 : org.telegram.ui.ActionBar.k6.z9;
        org.telegram.ui.ActionBar.e6 e6Var = this.x;
        this.w.b(user, chat, org.telegram.ui.ActionBar.k6.w0(i3, e6Var), false);
        org.telegram.ui.Components.u8 u8Var2 = this.r;
        u8Var2.p(user2);
        ei.e4 e4Var = this.d;
        if (user != null) {
            this.E = user.id;
            e4Var.k(l10.p(user));
        } else {
            this.E = -chat.id;
            e4Var.k(chat.title);
        }
        if (user == null) {
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            if (chatPhoto != null) {
                ?? r12 = chatPhoto.strippedBitmap;
                u8Var = r12;
            }
            int i10 = this.b;
            this.c.j(ac.m(i10, 1, user2), "50_50", u8Var2, user2);
            org.telegram.ui.Components.k9 k9Var = this.f;
            if (!z10) {
            }
            org.telegram.ui.Components.k9 k9Var2 = this.h;
            if (storyItem == null) {
            }
            j12 = j10;
            if (j12 != j11) {
            }
            setContentDescription(a02);
            f10 = 0.0f;
            ?? r62 = this.e;
            if (j12 != j11) {
            }
            e4Var.setRightPadding(org.telegram.messenger.g0.L(z14 ? 30.0f : 0.0f));
            e4Var.setTranslationX((z14 || !bd.a0) ? 0.0f : org.telegram.messenger.g0.L(30.0f));
            ((ViewGroup.MarginLayoutParams) r62.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L((z14 || bd.a0) ? 12.0f : 36.0f);
            if (z14) {
            }
            r62.setTranslationX(f10);
        }
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null) {
            ?? r13 = userProfilePhoto.strippedBitmap;
            u8Var = r13;
        }
        int i102 = this.b;
        this.c.j(ac.m(i102, 1, user2), "50_50", u8Var2, user2);
        org.telegram.ui.Components.k9 k9Var3 = this.f;
        if (!z10) {
            if (k9Var3 != null) {
                k9Var3.setAnimatedEmojiDrawable(null);
            }
            Drawable mutate = getContext().getDrawable(R.drawable.media_like_active).mutate();
            k9Var3.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
            k9Var3.setImageDrawable(mutate);
            a02 = bd.a0("AccDescrLike", null, 2131754851, new Object[0]);
            z14 = true;
        } else if (reaction != null) {
            dh.n0 d = dh.n0.d(reaction);
            if (d.f != null) {
                if (k9Var3 != null) {
                    k9Var3.setAnimatedEmojiDrawable(null);
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) li.b0(i102).r.get(d.f);
                if (k9Var3 != null) {
                    if (tL_availableReaction != null) {
                        k9Var3.k(ac.b(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", org.telegram.messenger.t5.d(tL_availableReaction.static_icon.thumbs, org.telegram.ui.ActionBar.k6.a7, 1.0f, false), tL_availableReaction);
                        z15 = true;
                    } else {
                        k9Var3.setImageDrawable(null);
                        z15 = false;
                    }
                    k9Var3.setColorFilter(null);
                } else {
                    z15 = false;
                }
            } else {
                org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(0, i102, d.g);
                g5Var.setColorFilter(org.telegram.ui.ActionBar.k6.o0(e6Var));
                if (k9Var3 != null) {
                    k9Var3.setAnimatedEmojiDrawable(g5Var);
                }
                z15 = true;
            }
            CharSequence text = e4Var.getText();
            Object obj = d.f;
            if (obj == null) {
                obj = reaction;
            }
            z14 = z15;
            a02 = bd.a0("AccDescrReactedWith", null, 2131754791, text, obj);
        } else {
            if (k9Var3 != null) {
                k9Var3.setAnimatedEmojiDrawable(null);
                k9Var3.setImageDrawable(null);
            }
            a02 = bd.a0("AccDescrPersonHasSeen", null, 2131754812, e4Var.getText());
            z14 = false;
        }
        org.telegram.ui.Components.k9 k9Var22 = this.h;
        if (storyItem == null) {
            this.n = storyItem.id;
            if (k9Var22 != null) {
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia == null || (photo = messageMedia.photo) == null) {
                    str = null;
                    j11 = 0;
                    if (messageMedia != null && (document = messageMedia.document) != null) {
                        k9Var22.l(ac.c(org.telegram.messenger.w7.w(document.thumbs, 35, false, null, true), storyItem.media.document), "22_35", null, null, -1, storyItem);
                    }
                } else {
                    str = null;
                    j11 = 0;
                    k9Var22.l(ac.i(org.telegram.messenger.w7.w(photo.sizes, 35, false, null, true), storyItem.media.photo), "22_35", null, null, -1, storyItem);
                }
                k9Var22.setRoundRadius(org.telegram.messenger.g0.L(3.33f));
            } else {
                str = null;
                j11 = 0;
            }
            if (j10 <= j11) {
                j12 = storyItem.date;
                if (j12 != j11) {
                    StringBuilder h = t4.c.h(a02, " ");
                    h.append(bd.O(j12));
                    a02 = h.toString();
                }
                setContentDescription(a02);
                f10 = 0.0f;
                ?? r622 = this.e;
                if (j12 != j11) {
                    r622.setVisibility(0);
                    ja0 ja0Var = storyItem != null ? z11 ? L : K : z12 ? I : J;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(ja0Var.a(getContext(), e6Var));
                    spannableStringBuilder.append((CharSequence) bd.O(j12));
                    if (!z11 && storyItem != null) {
                        if (!TextUtils.isEmpty(storyItem.caption)) {
                            spannableStringBuilder.append((CharSequence) "\u2004");
                            spannableStringBuilder.append((CharSequence) ".");
                            fs fsVar = new fs();
                            fsVar.c = 2.33333f;
                            fsVar.b = org.telegram.messenger.g0.L(5.0f);
                            spannableStringBuilder.setSpan(fsVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.append((CharSequence) "\u2004");
                            int length = spannableStringBuilder.length();
                            spannableStringBuilder.append((CharSequence) bd.M0(2131744500, str));
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length, spannableStringBuilder.length(), 33);
                            r622.l(spannableStringBuilder, false);
                            r622.setTranslationY(z12 ? org.telegram.messenger.g0.L(-1.0f) : 0.0f);
                            e4Var.setTranslationY(0.0f);
                            if (z13) {
                                e4Var.setTranslationY(org.telegram.messenger.g0.L(9.0f));
                                e4Var.animate().translationY(0.0f);
                                r622.setAlpha(0.0f);
                                r622.animate().alpha(1.0f);
                            }
                        }
                    }
                    if (!z11 && storyItem != null && (storyFwdHeader = storyItem.fwd_from) != null && storyFwdHeader.modified) {
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
                    r622.setTranslationY(z12 ? org.telegram.messenger.g0.L(-1.0f) : 0.0f);
                    e4Var.setTranslationY(0.0f);
                    if (z13) {
                    }
                } else {
                    r622.setVisibility(8);
                    e4Var.setTranslationY(org.telegram.messenger.g0.L(9.0f));
                }
                e4Var.setRightPadding(org.telegram.messenger.g0.L(z14 ? 30.0f : 0.0f));
                e4Var.setTranslationX((z14 || !bd.a0) ? 0.0f : org.telegram.messenger.g0.L(30.0f));
                ((ViewGroup.MarginLayoutParams) r622.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L((z14 || bd.a0) ? 12.0f : 36.0f);
                if (z14 && bd.a0) {
                    f10 = org.telegram.messenger.g0.L(30.0f);
                }
                r622.setTranslationX(f10);
            }
        } else {
            str = null;
            j11 = 0;
            this.n = -1;
            if (k9Var22 != null) {
                k9Var22.setImageDrawable(null);
            }
        }
        j12 = j10;
        if (j12 != j11) {
        }
        setContentDescription(a02);
        f10 = 0.0f;
        ?? r6222 = this.e;
        if (j12 != j11) {
        }
        e4Var.setRightPadding(org.telegram.messenger.g0.L(z14 ? 30.0f : 0.0f));
        e4Var.setTranslationX((z14 || !bd.a0) ? 0.0f : org.telegram.messenger.g0.L(30.0f));
        ((ViewGroup.MarginLayoutParams) r6222.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L((z14 || bd.a0) ? 12.0f : 36.0f);
        if (z14) {
            f10 = org.telegram.messenger.g0.L(30.0f);
        }
        r6222.setTranslationX(f10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        if (this.G < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (this.G * 255.0f), 31);
            z10 = true;
        } else {
            z10 = false;
        }
        super.dispatchDraw(canvas);
        if (this.a) {
            float L2 = org.telegram.messenger.g0.L(this.y == 1 ? 73.0f : 55.0f);
            boolean z11 = bd.a0;
            org.telegram.ui.ActionBar.e6 e6Var = this.x;
            if (z11) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L2, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.W0("paintDivider", e6Var));
            } else {
                canvas.drawLine(L2, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.W0("paintDivider", e6Var));
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.G;
    }

    public org.telegram.ui.ActionBar.e6 getResourcesProvider() {
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
        this.F.g();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.y == 0 ? 50 : 58), TLObject.FLAG_30));
    }

    public void setUserReaction(TLRPC.MessagePeerReaction messagePeerReaction) {
        TLRPC.User user;
        if (messagePeerReaction == null) {
            return;
        }
        long C1 = zi.C1(messagePeerReaction.peer_id);
        int i3 = this.b;
        TLRPC.Chat chat = null;
        if (C1 > 0) {
            user = hp.s1(i3).a2(Long.valueOf(C1));
        } else {
            TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-C1));
            user = null;
            chat = M0;
        }
        c(user, chat, messagePeerReaction.reaction, false, messagePeerReaction.date, null, false, messagePeerReaction.dateIsSeen, false);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        mu0 mu0Var = this.w;
        if (mu0Var != null) {
            try {
                org.telegram.ui.Components.e5 e5Var = mu0Var.a;
                if (!(e5Var != null) || e5Var.G == null) {
                    return;
                }
                e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(this.y == 1 ? org.telegram.ui.ActionBar.k6.G6 : org.telegram.ui.ActionBar.k6.z9, this.x)));
                ei.e4 e4Var = this.d;
                if (e4Var != null) {
                    e4Var.invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void b(long j10) {
    }
}
