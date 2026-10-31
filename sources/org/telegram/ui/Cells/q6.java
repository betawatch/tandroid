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
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class q6 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public static final hb0 H;
    public static final hb0 I;
    public static final hb0 J;
    public static final hb0 K;
    public long D;
    public final o6 E;
    public float F;
    public ValueAnimator G;
    public boolean a;
    public final int b;
    public final p6 c;
    public final og.c d;
    public final org.telegram.ui.ActionBar.u5 e;
    public final org.telegram.ui.Components.g9 f;
    public final org.telegram.ui.Components.g9 h;
    public int n;
    public final org.telegram.ui.Components.r8 r;
    public final View s;
    public final pv0 w;
    public final org.telegram.ui.ActionBar.p6 x;
    public final int y;

    static {
        int i10 = org.telegram.ui.ActionBar.t6.y6;
        H = new hb0(R.drawable.msg_mini_checks, i10);
        hb0 hb0Var = new hb0(R.drawable.msg_reactions, i10);
        hb0Var.g = 16;
        hb0Var.h = 16;
        hb0Var.i = 5.66f;
        I = hb0Var;
        int i11 = org.telegram.ui.ActionBar.t6.Vk;
        J = new hb0(R.drawable.mini_repost_story, i11);
        K = new hb0(R.drawable.mini_forward_story, i11);
    }

    public q6(int i10, int i11, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11) {
        super(context);
        this.r = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.F = 1.0f;
        this.y = i10;
        this.b = i11;
        this.x = p6Var;
        this.E = new o6(this, p6Var);
        setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(50.0f)));
        int i12 = i10 == 1 ? 48 : 34;
        p6 p6Var2 = new p6(this, context, i10);
        this.c = p6Var2;
        float f7 = i12;
        p6Var2.setRoundRadius(org.telegram.messenger.i0.L(f7));
        addView(p6Var2, w7.b6.i(f7, f7, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i10 == 1) {
            setClipChildren(false);
        }
        og.c cVar = new og.c(context, 2);
        this.d = cVar;
        zs.i(cVar);
        cVar.setTextSize(16);
        org.telegram.ui.ActionBar.a7.Y(cVar, org.telegram.ui.ActionBar.t6.E8, p6Var);
        cVar.setEllipsizeByGradient(true);
        cVar.setImportantForAccessibility(2);
        cVar.setRightPadding(org.telegram.messenger.i0.L(30.0f));
        cVar.setTranslationX(cd.X ? org.telegram.messenger.i0.L(30.0f) : 0.0f);
        cVar.setRightDrawableOutside(true);
        float f10 = i10 == 1 ? 7.66f : 5.33f;
        float f11 = i10 == 1 ? 73.0f : 55.0f;
        addView(cVar, w7.b6.i(-1.0f, -2.0f, 55, f11, f10, 12.0f, 0.0f));
        pv0 pv0Var = new pv0(this);
        this.w = pv0Var;
        cVar.setDrawablePadding(org.telegram.messenger.i0.L(3.0f));
        cVar.i(pv0Var.a);
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.e = u5Var;
        u5Var.setTextSize(13);
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.y6, p6Var);
        u5Var.setEllipsizeByGradient(true);
        u5Var.setImportantForAccessibility(2);
        u5Var.setTranslationX(cd.X ? org.telegram.messenger.i0.L(30.0f) : 0.0f);
        addView(u5Var, w7.b6.i(-1.0f, -2.0f, 55, f11, i10 == 1 ? 24.0f : 19.0f, 20.0f, 0.0f));
        if (z11) {
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
            this.f = g9Var;
            addView(g9Var, w7.b6.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            org.telegram.ui.Components.g9 g9Var2 = new org.telegram.ui.Components.g9(context);
            this.h = g9Var2;
            addView(g9Var2, w7.b6.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z10) {
            View view = new View(context);
            this.s = view;
            view.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
            addView(view, w7.b6.c(-1.0f, -1));
        }
    }

    public final void a(boolean z10, float f7) {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (!z10) {
            this.F = f7;
            invalidate();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, f7);
        this.G = ofFloat;
        ofFloat.addUpdateListener(new r(this, 4));
        this.G.addListener(new org.telegram.ui.ActionBar.v0(this, f7, 2));
        this.G.setInterpolator(gr.h);
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
    /* JADX WARN: Type inference failed for: r19v0, types: [android.view.View, org.telegram.ui.Cells.q6] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.graphics.drawable.BitmapDrawable] */
    /* JADX WARN: Type inference failed for: r1v49, types: [android.graphics.drawable.BitmapDrawable] */
    /* JADX WARN: Type inference failed for: r21v0, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View, org.telegram.ui.ActionBar.u5] */
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
        float f7;
        TL_stories.StoryFwdHeader storyFwdHeader;
        TLRPC.Document document;
        TLRPC.Photo photo;
        org.telegram.ui.Components.r8 r8Var;
        TLRPC.User user2 = user == null ? chat : user;
        if (user2 == null) {
            return;
        }
        int i10 = this.y == 1 ? org.telegram.ui.ActionBar.t6.G6 : org.telegram.ui.ActionBar.t6.z9;
        org.telegram.ui.ActionBar.p6 p6Var = this.x;
        this.w.b(user, chat, org.telegram.ui.ActionBar.t6.w0(i10, p6Var), false);
        org.telegram.ui.Components.r8 r8Var2 = this.r;
        r8Var2.p(user2);
        og.c cVar = this.d;
        if (user != null) {
            this.D = user.id;
            cVar.k(h20.p(user));
        } else {
            this.D = -chat.id;
            cVar.k(chat.title);
        }
        if (user == null) {
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            if (chatPhoto != null) {
                ?? r12 = chatPhoto.strippedBitmap;
                r8Var = r12;
            }
            int i11 = this.b;
            this.c.j(ic.m(i11, 1, user2), "50_50", r8Var2, user2);
            org.telegram.ui.Components.g9 g9Var = this.f;
            if (!z10) {
            }
            org.telegram.ui.Components.g9 g9Var2 = this.h;
            if (storyItem == null) {
            }
            j12 = j10;
            if (j12 != j11) {
            }
            setContentDescription(a02);
            f7 = 0.0f;
            ?? r62 = this.e;
            if (j12 != j11) {
            }
            cVar.setRightPadding(org.telegram.messenger.i0.L(z14 ? 30.0f : 0.0f));
            cVar.setTranslationX((z14 || !cd.X) ? 0.0f : org.telegram.messenger.i0.L(30.0f));
            ((ViewGroup.MarginLayoutParams) r62.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L((z14 || cd.X) ? 12.0f : 36.0f);
            if (z14) {
            }
            r62.setTranslationX(f7);
        }
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null) {
            ?? r13 = userProfilePhoto.strippedBitmap;
            r8Var = r13;
        }
        int i112 = this.b;
        this.c.j(ic.m(i112, 1, user2), "50_50", r8Var2, user2);
        org.telegram.ui.Components.g9 g9Var3 = this.f;
        if (!z10) {
            if (g9Var3 != null) {
                g9Var3.setAnimatedEmojiDrawable(null);
            }
            Drawable mutate = getContext().getDrawable(R.drawable.media_like_active).mutate();
            g9Var3.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
            g9Var3.setImageDrawable(mutate);
            a02 = cd.a0("AccDescrLike", null, 2131754851, new Object[0]);
            z14 = true;
        } else if (reaction != null) {
            sg.o0 d = sg.o0.d(reaction);
            if (d.f != null) {
                if (g9Var3 != null) {
                    g9Var3.setAnimatedEmojiDrawable(null);
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(i112).r.get(d.f);
                if (g9Var3 != null) {
                    if (tL_availableReaction != null) {
                        g9Var3.k(ic.b(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", org.telegram.messenger.v5.d(tL_availableReaction.static_icon.thumbs, org.telegram.ui.ActionBar.t6.a7, 1.0f, false), tL_availableReaction);
                        z15 = true;
                    } else {
                        g9Var3.setImageDrawable(null);
                        z15 = false;
                    }
                    g9Var3.setColorFilter(null);
                } else {
                    z15 = false;
                }
            } else {
                org.telegram.ui.Components.f5 f5Var = new org.telegram.ui.Components.f5(0, i112, d.g);
                f5Var.setColorFilter(org.telegram.ui.ActionBar.t6.o0(p6Var));
                if (g9Var3 != null) {
                    g9Var3.setAnimatedEmojiDrawable(f5Var);
                }
                z15 = true;
            }
            CharSequence text = cVar.getText();
            Object obj = d.f;
            if (obj == null) {
                obj = reaction;
            }
            z14 = z15;
            a02 = cd.a0("AccDescrReactedWith", null, 2131754791, text, obj);
        } else {
            if (g9Var3 != null) {
                g9Var3.setAnimatedEmojiDrawable(null);
                g9Var3.setImageDrawable(null);
            }
            a02 = cd.a0("AccDescrPersonHasSeen", null, 2131754812, cVar.getText());
            z14 = false;
        }
        org.telegram.ui.Components.g9 g9Var22 = this.h;
        if (storyItem == null) {
            this.n = storyItem.id;
            if (g9Var22 != null) {
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia == null || (photo = messageMedia.photo) == null) {
                    str = null;
                    j11 = 0;
                    if (messageMedia != null && (document = messageMedia.document) != null) {
                        g9Var22.l(ic.c(org.telegram.messenger.b8.w(document.thumbs, 35, false, null, true), storyItem.media.document), "22_35", null, null, -1, storyItem);
                    }
                } else {
                    str = null;
                    j11 = 0;
                    g9Var22.l(ic.i(org.telegram.messenger.b8.w(photo.sizes, 35, false, null, true), storyItem.media.photo), "22_35", null, null, -1, storyItem);
                }
                g9Var22.setRoundRadius(org.telegram.messenger.i0.L(3.33f));
            } else {
                str = null;
                j11 = 0;
            }
            if (j10 <= j11) {
                j12 = storyItem.date;
                if (j12 != j11) {
                    StringBuilder i12 = sc.e.i(a02, " ");
                    i12.append(cd.O(j12));
                    a02 = i12.toString();
                }
                setContentDescription(a02);
                f7 = 0.0f;
                ?? r622 = this.e;
                if (j12 != j11) {
                    r622.setVisibility(0);
                    hb0 hb0Var = storyItem != null ? z11 ? K : J : z12 ? H : I;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(hb0Var.a(getContext(), p6Var));
                    spannableStringBuilder.append((CharSequence) cd.O(j12));
                    if (!z11 && storyItem != null) {
                        if (!TextUtils.isEmpty(storyItem.caption)) {
                            spannableStringBuilder.append((CharSequence) "\u2004");
                            spannableStringBuilder.append((CharSequence) ".");
                            qs qsVar = new qs();
                            qsVar.c = 2.33333f;
                            qsVar.b = org.telegram.messenger.i0.L(5.0f);
                            spannableStringBuilder.setSpan(qsVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.append((CharSequence) "\u2004");
                            int length = spannableStringBuilder.length();
                            spannableStringBuilder.append((CharSequence) cd.L0(2131744516, str));
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length, spannableStringBuilder.length(), 33);
                            r622.l(spannableStringBuilder, false);
                            r622.setTranslationY(z12 ? org.telegram.messenger.i0.L(-1.0f) : 0.0f);
                            cVar.setTranslationY(0.0f);
                            if (z13) {
                                cVar.setTranslationY(org.telegram.messenger.i0.L(9.0f));
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
                        qsVar2.b = org.telegram.messenger.i0.L(5.0f);
                        spannableStringBuilder.setSpan(qsVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) "\u2004");
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) "edited");
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length2, spannableStringBuilder.length(), 33);
                    }
                    r622.l(spannableStringBuilder, false);
                    r622.setTranslationY(z12 ? org.telegram.messenger.i0.L(-1.0f) : 0.0f);
                    cVar.setTranslationY(0.0f);
                    if (z13) {
                    }
                } else {
                    r622.setVisibility(8);
                    cVar.setTranslationY(org.telegram.messenger.i0.L(9.0f));
                }
                cVar.setRightPadding(org.telegram.messenger.i0.L(z14 ? 30.0f : 0.0f));
                cVar.setTranslationX((z14 || !cd.X) ? 0.0f : org.telegram.messenger.i0.L(30.0f));
                ((ViewGroup.MarginLayoutParams) r622.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L((z14 || cd.X) ? 12.0f : 36.0f);
                if (z14 && cd.X) {
                    f7 = org.telegram.messenger.i0.L(30.0f);
                }
                r622.setTranslationX(f7);
            }
        } else {
            str = null;
            j11 = 0;
            this.n = -1;
            if (g9Var22 != null) {
                g9Var22.setImageDrawable(null);
            }
        }
        j12 = j10;
        if (j12 != j11) {
        }
        setContentDescription(a02);
        f7 = 0.0f;
        ?? r6222 = this.e;
        if (j12 != j11) {
        }
        cVar.setRightPadding(org.telegram.messenger.i0.L(z14 ? 30.0f : 0.0f));
        cVar.setTranslationX((z14 || !cd.X) ? 0.0f : org.telegram.messenger.i0.L(30.0f));
        ((ViewGroup.MarginLayoutParams) r6222.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L((z14 || cd.X) ? 12.0f : 36.0f);
        if (z14) {
            f7 = org.telegram.messenger.i0.L(30.0f);
        }
        r6222.setTranslationX(f7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        if (this.F < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (this.F * 255.0f), 31);
            z10 = true;
        } else {
            z10 = false;
        }
        super.dispatchDraw(canvas);
        if (this.a) {
            float L = org.telegram.messenger.i0.L(this.y == 1 ? 73.0f : 55.0f);
            boolean z11 = cd.X;
            org.telegram.ui.ActionBar.p6 p6Var = this.x;
            if (z11) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.W0("paintDivider", p6Var));
            } else {
                canvas.drawLine(L, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.W0("paintDivider", p6Var));
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.F;
    }

    public org.telegram.ui.ActionBar.p6 getResourcesProvider() {
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
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.y == 0 ? 50 : 58), TLObject.FLAG_30));
    }

    public void setUserReaction(TLRPC.MessagePeerReaction messagePeerReaction) {
        TLRPC.User user;
        if (messagePeerReaction == null) {
            return;
        }
        long C1 = jj.C1(messagePeerReaction.peer_id);
        int i10 = this.b;
        TLRPC.Chat chat = null;
        if (C1 > 0) {
            user = vp.r1(i10).Z1(Long.valueOf(C1));
        } else {
            TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-C1));
            user = null;
            chat = L0;
        }
        c(user, chat, messagePeerReaction.reaction, false, messagePeerReaction.date, null, false, messagePeerReaction.dateIsSeen, false);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        pv0 pv0Var = this.w;
        if (pv0Var != null) {
            try {
                org.telegram.ui.Components.d5 d5Var = pv0Var.a;
                if (!(d5Var != null) || d5Var.F == null) {
                    return;
                }
                d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(this.y == 1 ? org.telegram.ui.ActionBar.t6.G6 : org.telegram.ui.ActionBar.t6.z9, this.x)));
                og.c cVar = this.d;
                if (cVar != null) {
                    cVar.invalidate();
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void b(long j10) {
    }
}
