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
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ls;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.pu0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class l6 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final pa0 I;
    public static final pa0 J;
    public static final pa0 K;
    public static final pa0 L;
    public long E;
    public final j6 F;
    public float G;
    public ValueAnimator H;
    public boolean a;
    public final int b;
    public final k6 c;
    public final fi.w3 d;
    public final org.telegram.ui.ActionBar.j5 e;
    public final org.telegram.ui.Components.i9 f;
    public final org.telegram.ui.Components.i9 h;
    public int n;
    public final org.telegram.ui.Components.t8 r;
    public final View s;
    public final pu0 w;
    public final org.telegram.ui.ActionBar.e6 x;
    public final int y;

    static {
        int i7 = org.telegram.ui.ActionBar.j6.y6;
        I = new pa0(R.drawable.msg_mini_checks, i7);
        pa0 pa0Var = new pa0(R.drawable.msg_reactions, i7);
        pa0Var.g = 16;
        pa0Var.h = 16;
        pa0Var.i = 5.66f;
        J = pa0Var;
        int i10 = org.telegram.ui.ActionBar.j6.Yk;
        K = new pa0(R.drawable.mini_repost_story, i10);
        L = new pa0(R.drawable.mini_forward_story, i10);
    }

    public l6(int i7, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context);
        this.r = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.G = 1.0f;
        this.y = i7;
        this.b = i10;
        this.x = e6Var;
        this.F = new j6(this, e6Var);
        setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(50.0f)));
        int i11 = i7 == 1 ? 48 : 34;
        k6 k6Var = new k6(this, context, i7);
        this.c = k6Var;
        float f10 = i11;
        k6Var.setRoundRadius(org.telegram.messenger.g0.L(f10));
        addView(k6Var, c8.ja.i(f10, f10, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i7 == 1) {
            setClipChildren(false);
        }
        fi.w3 w3Var = new fi.w3(context, 2);
        this.d = w3Var;
        ns.i(w3Var);
        w3Var.setTextSize(16);
        org.telegram.ui.ActionBar.q6.X(w3Var, org.telegram.ui.ActionBar.j6.E8, e6Var);
        w3Var.setEllipsizeByGradient(true);
        w3Var.setImportantForAccessibility(2);
        w3Var.setRightPadding(org.telegram.messenger.g0.L(30.0f));
        w3Var.setTranslationX(hd.a0 ? org.telegram.messenger.g0.L(30.0f) : 0.0f);
        w3Var.setRightDrawableOutside(true);
        float f11 = i7 == 1 ? 7.66f : 5.33f;
        float f12 = i7 == 1 ? 73.0f : 55.0f;
        addView(w3Var, c8.ja.i(-1.0f, -2.0f, 55, f12, f11, 12.0f, 0.0f));
        pu0 pu0Var = new pu0(this);
        this.w = pu0Var;
        w3Var.setDrawablePadding(org.telegram.messenger.g0.L(3.0f));
        w3Var.i(pu0Var.a);
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.e = j5Var;
        j5Var.setTextSize(13);
        org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.y6, e6Var);
        j5Var.setEllipsizeByGradient(true);
        j5Var.setImportantForAccessibility(2);
        j5Var.setTranslationX(hd.a0 ? org.telegram.messenger.g0.L(30.0f) : 0.0f);
        addView(j5Var, c8.ja.i(-1.0f, -2.0f, 55, f12, i7 == 1 ? 24.0f : 19.0f, 20.0f, 0.0f));
        if (z11) {
            org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
            this.f = i9Var;
            addView(i9Var, c8.ja.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            org.telegram.ui.Components.i9 i9Var2 = new org.telegram.ui.Components.i9(context);
            this.h = i9Var2;
            addView(i9Var2, c8.ja.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z10) {
            View view = new View(context);
            this.s = view;
            view.setBackground(org.telegram.ui.ActionBar.j6.N0(false));
            addView(view, c8.ja.c(-1.0f, -1));
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
        this.H.addListener(new org.telegram.ui.ActionBar.t0(this, f10, 2));
        this.H.setInterpolator(er.h);
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
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View, org.telegram.ui.ActionBar.j5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TLRPC.User user, TLRPC.Chat chat, TLRPC.Reaction reaction, boolean z10, long j3, TL_stories.StoryItem storyItem, boolean z11, boolean z12, boolean z13) {
        String a02;
        boolean z14;
        boolean z15;
        String str;
        long j10;
        long j11;
        float f10;
        TL_stories.StoryFwdHeader storyFwdHeader;
        TLRPC.Document document;
        TLRPC.Photo photo;
        org.telegram.ui.Components.t8 t8Var;
        TLRPC.User user2 = user == null ? chat : user;
        if (user2 == null) {
            return;
        }
        int i7 = this.y == 1 ? org.telegram.ui.ActionBar.j6.G6 : org.telegram.ui.ActionBar.j6.z9;
        org.telegram.ui.ActionBar.e6 e6Var = this.x;
        this.w.b(user, chat, org.telegram.ui.ActionBar.j6.w0(i7, e6Var), false);
        org.telegram.ui.Components.t8 t8Var2 = this.r;
        t8Var2.p(user2);
        fi.w3 w3Var = this.d;
        if (user != null) {
            this.E = user.id;
            w3Var.k(q10.p(user));
        } else {
            this.E = -chat.id;
            w3Var.k(chat.title);
        }
        if (user == null) {
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            if (chatPhoto != null) {
                ?? r12 = chatPhoto.strippedBitmap;
                t8Var = r12;
            }
            int i10 = this.b;
            this.c.j(gc.m(i10, 1, user2), "50_50", t8Var2, user2);
            org.telegram.ui.Components.i9 i9Var = this.f;
            if (!z10) {
            }
            org.telegram.ui.Components.i9 i9Var2 = this.h;
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
            w3Var.setRightPadding(org.telegram.messenger.g0.L(z14 ? 30.0f : 0.0f));
            w3Var.setTranslationX((z14 || !hd.a0) ? 0.0f : org.telegram.messenger.g0.L(30.0f));
            ((ViewGroup.MarginLayoutParams) r62.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L((z14 || hd.a0) ? 12.0f : 36.0f);
            if (z14) {
            }
            r62.setTranslationX(f10);
        }
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null) {
            ?? r13 = userProfilePhoto.strippedBitmap;
            t8Var = r13;
        }
        int i102 = this.b;
        this.c.j(gc.m(i102, 1, user2), "50_50", t8Var2, user2);
        org.telegram.ui.Components.i9 i9Var3 = this.f;
        if (!z10) {
            if (i9Var3 != null) {
                i9Var3.setAnimatedEmojiDrawable(null);
            }
            Drawable mutate = getContext().getDrawable(R.drawable.media_like_active).mutate();
            i9Var3.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
            i9Var3.setImageDrawable(mutate);
            a02 = hd.a0("AccDescrLike", null, 2131754851, new Object[0]);
            z14 = true;
        } else if (reaction != null) {
            ch.p0 d = ch.p0.d(reaction);
            if (d.f != null) {
                if (i9Var3 != null) {
                    i9Var3.setAnimatedEmojiDrawable(null);
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) si.b0(i102).r.get(d.f);
                if (i9Var3 != null) {
                    if (tL_availableReaction != null) {
                        i9Var3.k(gc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", org.telegram.messenger.t5.d(tL_availableReaction.static_icon.thumbs, org.telegram.ui.ActionBar.j6.a7, 1.0f, false), tL_availableReaction);
                        z15 = true;
                    } else {
                        i9Var3.setImageDrawable(null);
                        z15 = false;
                    }
                    i9Var3.setColorFilter(null);
                } else {
                    z15 = false;
                }
            } else {
                org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(0, i102, d.g);
                g5Var.setColorFilter(org.telegram.ui.ActionBar.j6.o0(e6Var));
                if (i9Var3 != null) {
                    i9Var3.setAnimatedEmojiDrawable(g5Var);
                }
                z15 = true;
            }
            CharSequence text = w3Var.getText();
            Object obj = d.f;
            if (obj == null) {
                obj = reaction;
            }
            z14 = z15;
            a02 = hd.a0("AccDescrReactedWith", null, 2131754791, text, obj);
        } else {
            if (i9Var3 != null) {
                i9Var3.setAnimatedEmojiDrawable(null);
                i9Var3.setImageDrawable(null);
            }
            a02 = hd.a0("AccDescrPersonHasSeen", null, 2131754812, w3Var.getText());
            z14 = false;
        }
        org.telegram.ui.Components.i9 i9Var22 = this.h;
        if (storyItem == null) {
            this.n = storyItem.id;
            if (i9Var22 != null) {
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia == null || (photo = messageMedia.photo) == null) {
                    str = null;
                    j10 = 0;
                    if (messageMedia != null && (document = messageMedia.document) != null) {
                        i9Var22.l(gc.c(org.telegram.messenger.w7.w(document.thumbs, 35, false, null, true), storyItem.media.document), "22_35", null, null, -1, storyItem);
                    }
                } else {
                    str = null;
                    j10 = 0;
                    i9Var22.l(gc.i(org.telegram.messenger.w7.w(photo.sizes, 35, false, null, true), storyItem.media.photo), "22_35", null, null, -1, storyItem);
                }
                i9Var22.setRoundRadius(org.telegram.messenger.g0.L(3.33f));
            } else {
                str = null;
                j10 = 0;
            }
            if (j3 <= j10) {
                j11 = storyItem.date;
                if (j11 != j10) {
                    StringBuilder m10 = r.b.m(a02, " ");
                    m10.append(hd.O(j11));
                    a02 = m10.toString();
                }
                setContentDescription(a02);
                f10 = 0.0f;
                ?? r622 = this.e;
                if (j11 != j10) {
                    r622.setVisibility(0);
                    pa0 pa0Var = storyItem != null ? z11 ? L : K : z12 ? I : J;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(pa0Var.a(getContext(), e6Var));
                    spannableStringBuilder.append((CharSequence) hd.O(j11));
                    if (!z11 && storyItem != null) {
                        if (!TextUtils.isEmpty(storyItem.caption)) {
                            spannableStringBuilder.append((CharSequence) "\u2004");
                            spannableStringBuilder.append((CharSequence) ".");
                            ls lsVar = new ls();
                            lsVar.c = 2.33333f;
                            lsVar.b = org.telegram.messenger.g0.L(5.0f);
                            spannableStringBuilder.setSpan(lsVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.append((CharSequence) "\u2004");
                            int length = spannableStringBuilder.length();
                            spannableStringBuilder.append((CharSequence) hd.M0(2131744490, str));
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length, spannableStringBuilder.length(), 33);
                            r622.l(spannableStringBuilder, false);
                            r622.setTranslationY(z12 ? org.telegram.messenger.g0.L(-1.0f) : 0.0f);
                            w3Var.setTranslationY(0.0f);
                            if (z13) {
                                w3Var.setTranslationY(org.telegram.messenger.g0.L(9.0f));
                                w3Var.animate().translationY(0.0f);
                                r622.setAlpha(0.0f);
                                r622.animate().alpha(1.0f);
                            }
                        }
                    }
                    if (!z11 && storyItem != null && (storyFwdHeader = storyItem.fwd_from) != null && storyFwdHeader.modified) {
                        spannableStringBuilder.append((CharSequence) "\u2004");
                        spannableStringBuilder.append((CharSequence) ".");
                        ls lsVar2 = new ls();
                        lsVar2.c = 2.33333f;
                        lsVar2.b = org.telegram.messenger.g0.L(5.0f);
                        spannableStringBuilder.setSpan(lsVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) "\u2004");
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) "edited");
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length2, spannableStringBuilder.length(), 33);
                    }
                    r622.l(spannableStringBuilder, false);
                    r622.setTranslationY(z12 ? org.telegram.messenger.g0.L(-1.0f) : 0.0f);
                    w3Var.setTranslationY(0.0f);
                    if (z13) {
                    }
                } else {
                    r622.setVisibility(8);
                    w3Var.setTranslationY(org.telegram.messenger.g0.L(9.0f));
                }
                w3Var.setRightPadding(org.telegram.messenger.g0.L(z14 ? 30.0f : 0.0f));
                w3Var.setTranslationX((z14 || !hd.a0) ? 0.0f : org.telegram.messenger.g0.L(30.0f));
                ((ViewGroup.MarginLayoutParams) r622.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L((z14 || hd.a0) ? 12.0f : 36.0f);
                if (z14 && hd.a0) {
                    f10 = org.telegram.messenger.g0.L(30.0f);
                }
                r622.setTranslationX(f10);
            }
        } else {
            str = null;
            j10 = 0;
            this.n = -1;
            if (i9Var22 != null) {
                i9Var22.setImageDrawable(null);
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
        w3Var.setRightPadding(org.telegram.messenger.g0.L(z14 ? 30.0f : 0.0f));
        w3Var.setTranslationX((z14 || !hd.a0) ? 0.0f : org.telegram.messenger.g0.L(30.0f));
        ((ViewGroup.MarginLayoutParams) r6222.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L((z14 || hd.a0) ? 12.0f : 36.0f);
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
            boolean z11 = hd.a0;
            org.telegram.ui.ActionBar.e6 e6Var = this.x;
            if (z11) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L2, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.W0("paintDivider", e6Var));
            } else {
                canvas.drawLine(L2, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.W0("paintDivider", e6Var));
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.y == 0 ? 50 : 58), TLObject.FLAG_30));
    }

    public void setUserReaction(TLRPC.MessagePeerReaction messagePeerReaction) {
        TLRPC.User user;
        if (messagePeerReaction == null) {
            return;
        }
        long B1 = gj.B1(messagePeerReaction.peer_id);
        int i7 = this.b;
        TLRPC.Chat chat = null;
        if (B1 > 0) {
            user = np.s1(i7).a2(Long.valueOf(B1));
        } else {
            TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(-B1));
            user = null;
            chat = M0;
        }
        c(user, chat, messagePeerReaction.reaction, false, messagePeerReaction.date, null, false, messagePeerReaction.dateIsSeen, false);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        pu0 pu0Var = this.w;
        if (pu0Var != null) {
            try {
                org.telegram.ui.Components.e5 e5Var = pu0Var.a;
                if (!(e5Var != null) || e5Var.G == null) {
                    return;
                }
                e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(this.y == 1 ? org.telegram.ui.ActionBar.j6.G6 : org.telegram.ui.ActionBar.j6.z9, this.x)));
                fi.w3 w3Var = this.d;
                if (w3Var != null) {
                    w3Var.invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void b(long j3) {
    }
}
