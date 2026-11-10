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
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class m6 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
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
    public final di.e4 d;
    public final org.telegram.ui.ActionBar.m5 e;
    public final org.telegram.ui.Components.k9 f;
    public final org.telegram.ui.Components.k9 h;
    public int n;
    public final org.telegram.ui.Components.v8 r;
    public final View s;
    public final ou0 w;
    public final org.telegram.ui.ActionBar.h6 x;
    public final int y;

    static {
        int i7 = org.telegram.ui.ActionBar.m6.y6;
        H = new oa0(R.drawable.msg_mini_checks, i7);
        oa0 oa0Var = new oa0(R.drawable.msg_reactions, i7);
        oa0Var.g = 16;
        oa0Var.h = 16;
        oa0Var.i = 5.66f;
        I = oa0Var;
        int i10 = org.telegram.ui.ActionBar.m6.Vk;
        J = new oa0(R.drawable.mini_repost_story, i10);
        K = new oa0(R.drawable.mini_forward_story, i10);
    }

    public m6(int i7, int i10, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9, boolean z10) {
        super(context);
        this.r = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        this.F = 1.0f;
        this.y = i7;
        this.b = i10;
        this.x = h6Var;
        this.E = new k6(this, h6Var);
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
        di.e4 e4Var = new di.e4(context, 2);
        this.d = e4Var;
        qs.i(e4Var);
        e4Var.setTextSize(16);
        org.telegram.ui.ActionBar.t6.X(e4Var, org.telegram.ui.ActionBar.m6.E8, h6Var);
        e4Var.setEllipsizeByGradient(true);
        e4Var.setImportantForAccessibility(2);
        e4Var.setRightPadding(org.telegram.messenger.g0.L(30.0f));
        e4Var.setTranslationX(id.a0 ? org.telegram.messenger.g0.L(30.0f) : 0.0f);
        e4Var.setRightDrawableOutside(true);
        float f11 = i7 == 1 ? 7.66f : 5.33f;
        float f12 = i7 == 1 ? 73.0f : 55.0f;
        addView(e4Var, c8.ha.i(-1.0f, -2.0f, 55, f12, f11, 12.0f, 0.0f));
        ou0 ou0Var = new ou0(this);
        this.w = ou0Var;
        e4Var.setDrawablePadding(org.telegram.messenger.g0.L(3.0f));
        e4Var.i(ou0Var.a);
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.e = m5Var;
        m5Var.setTextSize(13);
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.y6, h6Var);
        m5Var.setEllipsizeByGradient(true);
        m5Var.setImportantForAccessibility(2);
        m5Var.setTranslationX(id.a0 ? org.telegram.messenger.g0.L(30.0f) : 0.0f);
        addView(m5Var, c8.ha.i(-1.0f, -2.0f, 55, f12, i7 == 1 ? 24.0f : 19.0f, 20.0f, 0.0f));
        if (z10) {
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
            this.f = k9Var;
            addView(k9Var, c8.ha.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            org.telegram.ui.Components.k9 k9Var2 = new org.telegram.ui.Components.k9(context);
            this.h = k9Var2;
            addView(k9Var2, c8.ha.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z9) {
            View view = new View(context);
            this.s = view;
            view.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
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
        this.G.setInterpolator(wq.h);
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
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View, org.telegram.ui.ActionBar.m5] */
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
        org.telegram.ui.Components.v8 v8Var;
        TLRPC.User user2 = user == null ? chat : user;
        if (user2 == null) {
            return;
        }
        int i7 = this.y == 1 ? org.telegram.ui.ActionBar.m6.G6 : org.telegram.ui.ActionBar.m6.z9;
        org.telegram.ui.ActionBar.h6 h6Var = this.x;
        this.w.b(user, chat, org.telegram.ui.ActionBar.m6.w0(i7, h6Var), false);
        org.telegram.ui.Components.v8 v8Var2 = this.r;
        v8Var2.p(user2);
        di.e4 e4Var = this.d;
        if (user != null) {
            this.D = user.id;
            e4Var.k(t10.p(user));
        } else {
            this.D = -chat.id;
            e4Var.k(chat.title);
        }
        if (user == null) {
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            if (chatPhoto != null) {
                ?? r12 = chatPhoto.strippedBitmap;
                v8Var = r12;
            }
            int i10 = this.b;
            this.c.j(hc.m(i10, 1, user2), "50_50", v8Var2, user2);
            org.telegram.ui.Components.k9 k9Var = this.f;
            if (!z9) {
            }
            org.telegram.ui.Components.k9 k9Var2 = this.h;
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
            e4Var.setRightPadding(org.telegram.messenger.g0.L(z13 ? 30.0f : 0.0f));
            e4Var.setTranslationX((z13 || !id.a0) ? 0.0f : org.telegram.messenger.g0.L(30.0f));
            ((ViewGroup.MarginLayoutParams) r62.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L((z13 || id.a0) ? 12.0f : 36.0f);
            if (z13) {
            }
            r62.setTranslationX(f10);
        }
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null) {
            ?? r13 = userProfilePhoto.strippedBitmap;
            v8Var = r13;
        }
        int i102 = this.b;
        this.c.j(hc.m(i102, 1, user2), "50_50", v8Var2, user2);
        org.telegram.ui.Components.k9 k9Var3 = this.f;
        if (!z9) {
            if (k9Var3 != null) {
                k9Var3.setAnimatedEmojiDrawable(null);
            }
            Drawable mutate = getContext().getDrawable(R.drawable.media_like_active).mutate();
            k9Var3.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
            k9Var3.setImageDrawable(mutate);
            a02 = id.a0("AccDescrLike", null, 2131754851, new Object[0]);
            z13 = true;
        } else if (reaction != null) {
            ch.o0 d = ch.o0.d(reaction);
            if (d.f != null) {
                if (k9Var3 != null) {
                    k9Var3.setAnimatedEmojiDrawable(null);
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(i102).r.get(d.f);
                if (k9Var3 != null) {
                    if (tL_availableReaction != null) {
                        k9Var3.k(hc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", org.telegram.messenger.t5.d(tL_availableReaction.static_icon.thumbs, org.telegram.ui.ActionBar.m6.a7, 1.0f, false), tL_availableReaction);
                        z14 = true;
                    } else {
                        k9Var3.setImageDrawable(null);
                        z14 = false;
                    }
                    k9Var3.setColorFilter(null);
                } else {
                    z14 = false;
                }
            } else {
                org.telegram.ui.Components.h5 h5Var = new org.telegram.ui.Components.h5(0, i102, d.g);
                h5Var.setColorFilter(org.telegram.ui.ActionBar.m6.o0(h6Var));
                if (k9Var3 != null) {
                    k9Var3.setAnimatedEmojiDrawable(h5Var);
                }
                z14 = true;
            }
            CharSequence text = e4Var.getText();
            Object obj = d.f;
            if (obj == null) {
                obj = reaction;
            }
            z13 = z14;
            a02 = id.a0("AccDescrReactedWith", null, 2131754791, text, obj);
        } else {
            if (k9Var3 != null) {
                k9Var3.setAnimatedEmojiDrawable(null);
                k9Var3.setImageDrawable(null);
            }
            a02 = id.a0("AccDescrPersonHasSeen", null, 2131754812, e4Var.getText());
            z13 = false;
        }
        org.telegram.ui.Components.k9 k9Var22 = this.h;
        if (storyItem == null) {
            this.n = storyItem.id;
            if (k9Var22 != null) {
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia == null || (photo = messageMedia.photo) == null) {
                    str = null;
                    j10 = 0;
                    if (messageMedia != null && (document = messageMedia.document) != null) {
                        k9Var22.l(hc.c(org.telegram.messenger.w7.w(document.thumbs, 35, false, null, true), storyItem.media.document), "22_35", null, null, -1, storyItem);
                    }
                } else {
                    str = null;
                    j10 = 0;
                    k9Var22.l(hc.i(org.telegram.messenger.w7.w(photo.sizes, 35, false, null, true), storyItem.media.photo), "22_35", null, null, -1, storyItem);
                }
                k9Var22.setRoundRadius(org.telegram.messenger.g0.L(3.33f));
            } else {
                str = null;
                j10 = 0;
            }
            if (j3 <= j10) {
                j11 = storyItem.date;
                if (j11 != j10) {
                    StringBuilder j12 = rf.b.j(a02, " ");
                    j12.append(id.O(j11));
                    a02 = j12.toString();
                }
                setContentDescription(a02);
                f10 = 0.0f;
                ?? r622 = this.e;
                if (j11 != j10) {
                    r622.setVisibility(0);
                    oa0 oa0Var = storyItem != null ? z10 ? K : J : z11 ? H : I;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(oa0Var.a(getContext(), h6Var));
                    spannableStringBuilder.append((CharSequence) id.O(j11));
                    if (!z10 && storyItem != null) {
                        if (!TextUtils.isEmpty(storyItem.caption)) {
                            spannableStringBuilder.append((CharSequence) "\u2004");
                            spannableStringBuilder.append((CharSequence) ".");
                            es esVar = new es();
                            esVar.c = 2.33333f;
                            esVar.b = org.telegram.messenger.g0.L(5.0f);
                            spannableStringBuilder.setSpan(esVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.append((CharSequence) "\u2004");
                            int length = spannableStringBuilder.length();
                            spannableStringBuilder.append((CharSequence) id.M0(2131744490, str));
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length, spannableStringBuilder.length(), 33);
                            r622.l(spannableStringBuilder, false);
                            r622.setTranslationY(z11 ? org.telegram.messenger.g0.L(-1.0f) : 0.0f);
                            e4Var.setTranslationY(0.0f);
                            if (z12) {
                                e4Var.setTranslationY(org.telegram.messenger.g0.L(9.0f));
                                e4Var.animate().translationY(0.0f);
                                r622.setAlpha(0.0f);
                                r622.animate().alpha(1.0f);
                            }
                        }
                    }
                    if (!z10 && storyItem != null && (storyFwdHeader = storyItem.fwd_from) != null && storyFwdHeader.modified) {
                        spannableStringBuilder.append((CharSequence) "\u2004");
                        spannableStringBuilder.append((CharSequence) ".");
                        es esVar2 = new es();
                        esVar2.c = 2.33333f;
                        esVar2.b = org.telegram.messenger.g0.L(5.0f);
                        spannableStringBuilder.setSpan(esVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) "\u2004");
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) "edited");
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length2, spannableStringBuilder.length(), 33);
                    }
                    r622.l(spannableStringBuilder, false);
                    r622.setTranslationY(z11 ? org.telegram.messenger.g0.L(-1.0f) : 0.0f);
                    e4Var.setTranslationY(0.0f);
                    if (z12) {
                    }
                } else {
                    r622.setVisibility(8);
                    e4Var.setTranslationY(org.telegram.messenger.g0.L(9.0f));
                }
                e4Var.setRightPadding(org.telegram.messenger.g0.L(z13 ? 30.0f : 0.0f));
                e4Var.setTranslationX((z13 || !id.a0) ? 0.0f : org.telegram.messenger.g0.L(30.0f));
                ((ViewGroup.MarginLayoutParams) r622.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L((z13 || id.a0) ? 12.0f : 36.0f);
                if (z13 && id.a0) {
                    f10 = org.telegram.messenger.g0.L(30.0f);
                }
                r622.setTranslationX(f10);
            }
        } else {
            str = null;
            j10 = 0;
            this.n = -1;
            if (k9Var22 != null) {
                k9Var22.setImageDrawable(null);
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
        e4Var.setRightPadding(org.telegram.messenger.g0.L(z13 ? 30.0f : 0.0f));
        e4Var.setTranslationX((z13 || !id.a0) ? 0.0f : org.telegram.messenger.g0.L(30.0f));
        ((ViewGroup.MarginLayoutParams) r6222.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L((z13 || id.a0) ? 12.0f : 36.0f);
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
            boolean z10 = id.a0;
            org.telegram.ui.ActionBar.h6 h6Var = this.x;
            if (z10) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.W0("paintDivider", h6Var));
            } else {
                canvas.drawLine(L, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.W0("paintDivider", h6Var));
            }
        }
        if (z9) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.F;
    }

    public org.telegram.ui.ActionBar.h6 getResourcesProvider() {
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
        long B1 = ij.B1(messagePeerReaction.peer_id);
        int i7 = this.b;
        TLRPC.Chat chat = null;
        if (B1 > 0) {
            user = qp.s1(i7).a2(Long.valueOf(B1));
        } else {
            TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-B1));
            user = null;
            chat = M0;
        }
        c(user, chat, messagePeerReaction.reaction, false, messagePeerReaction.date, null, false, messagePeerReaction.dateIsSeen, false);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        ou0 ou0Var = this.w;
        if (ou0Var != null) {
            try {
                org.telegram.ui.Components.f5 f5Var = ou0Var.a;
                if (!(f5Var != null) || f5Var.F == null) {
                    return;
                }
                f5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(this.y == 1 ? org.telegram.ui.ActionBar.m6.G6 : org.telegram.ui.ActionBar.m6.z9, this.x)));
                di.e4 e4Var = this.d;
                if (e4Var != null) {
                    e4Var.invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void b(long j3) {
    }
}
