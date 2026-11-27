// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class e39 extends FrameLayout implements snb {
    public static final w57 I;
    public static final w57 J;
    public static final w57 K;
    public static final w57 L;
    public long E;
    public final a82 F;
    public float G;
    public ValueAnimator H;
    public boolean a;
    public final int b;
    public final d39 c;
    public final ff0 d;
    public final ema e;
    public final de0 f;
    public final de0 h;
    public int n;
    public final rb0 r;
    public final View s;
    public final c2b w;
    public final vnb x;
    public final boolean y;

    static {
        int i = aob.y6;
        I = new w57(R.drawable.msg_mini_checks, i);
        w57 w57Var = new w57(R.drawable.msg_reactions, i);
        w57Var.g = 16;
        w57Var.h = 16;
        w57Var.i = 5.66f;
        J = w57Var;
        int i2 = aob.Yk;
        K = new w57(R.drawable.mini_repost_story, i2);
        L = new w57(R.drawable.mini_forward_story, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e39(int i, int i2, vnb vnbVar, Context context, boolean z, boolean z2) {
        super(context);
        float f;
        float f2;
        this.r = new rb0((vnb) null);
        this.G = 1.0f;
        this.y = i;
        this.b = i2;
        this.x = vnbVar;
        this.F = new a82(this, vnbVar);
        setLayoutParams(new r79(-1, hl.L(50.0f)));
        int i3 = i == 1 ? 48 : 34;
        d39 d39Var = new d39(this, context, i);
        this.c = d39Var;
        float f3 = i3;
        d39Var.setRoundRadius(hl.L(f3));
        addView(d39Var, tre.i(f3, f3, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i == 1) {
            setClipChildren(false);
        }
        ff0 ff0Var = new ff0(context, (byte) 4);
        this.d = ff0Var;
        jn7.i(ff0Var);
        ff0Var.setTextSize(16);
        yob.W(ff0Var, aob.E8, vnbVar);
        ff0Var.setEllipsizeByGradient(true);
        ff0Var.setImportantForAccessibility(2);
        ff0Var.setRightPadding(hl.L(30.0f));
        ff0Var.setTranslationX(ob6.a0 ? hl.L(30.0f) : 0.0f);
        ff0Var.setRightDrawableOutside(true);
        if (i == 1) {
            f = 7.66f;
            f2 = 73.0f;
        } else {
            f = 5.33f;
            f2 = 55.0f;
        }
        float f4 = f2;
        addView(ff0Var, tre.i(-1.0f, -2.0f, 55, f4, f, 12.0f, 0.0f));
        c2b c2bVar = new c2b(this);
        this.w = c2bVar;
        ff0Var.setDrawablePadding(hl.L(3.0f));
        ff0Var.i(c2bVar.a);
        ema emaVar = new ema(context);
        this.e = emaVar;
        emaVar.setTextSize(13);
        yob.W(emaVar, aob.y6, vnbVar);
        emaVar.setEllipsizeByGradient(true);
        emaVar.setImportantForAccessibility(2);
        emaVar.setTranslationX(ob6.a0 ? hl.L(30.0f) : 0.0f);
        addView(emaVar, tre.i(-1.0f, -2.0f, 55, f4, i == 1 ? 24.0f : 19.0f, 20.0f, 0.0f));
        if (z2) {
            de0 de0Var = new de0(context);
            this.f = de0Var;
            addView(de0Var, tre.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            de0 de0Var2 = new de0(context);
            this.h = de0Var2;
            addView(de0Var2, tre.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z) {
            View view = new View(context);
            this.s = view;
            view.setBackground(aob.L0(false));
            addView(view, tre.c(-1.0f, -1));
        }
    }

    public final void a(boolean z, float f) {
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.H = null;
        }
        if (!z) {
            this.G = f;
            invalidate();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, f);
        this.H = ofFloat;
        ofFloat.addUpdateListener(new pv7(this, (byte) 26));
        this.H.addListener(new u7(this, f, (byte) 6));
        this.H.setInterpolator(k43.h);
        this.H.setDuration(420L);
        this.H.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0053, code lost:
    
        if (r1 != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r1 != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0199  */
    /* JADX WARN: Type inference failed for: r19v0, types: [android.view.View, e39] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.graphics.drawable.BitmapDrawable] */
    /* JADX WARN: Type inference failed for: r1v47, types: [android.graphics.drawable.BitmapDrawable] */
    /* JADX WARN: Type inference failed for: r21v0, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View, ema] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TLRPC.User user, TLRPC.Chat chat, TLRPC.Reaction reaction, boolean z, long j, TL_stories.StoryItem storyItem, boolean z2, boolean z3, boolean z4) {
        String a0;
        boolean z5;
        boolean z6;
        String str;
        long j2;
        long j3;
        float f;
        float f2;
        TL_stories.StoryFwdHeader storyFwdHeader;
        rb0 rb0Var;
        TLRPC.User user2 = user == null ? chat : user;
        if (user2 == null) {
            return;
        }
        int i = this.y ? aob.G6 : aob.z9;
        vnb vnbVar = this.x;
        this.w.b(user, chat, aob.v0(i, vnbVar), false);
        rb0 rb0Var2 = this.r;
        rb0Var2.o(user2);
        ff0 ff0Var = this.d;
        if (user == null) {
            this.E = -chat.id;
            ff0Var.k(chat.title);
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            if (chatPhoto != null) {
                ?? r1 = chatPhoto.strippedBitmap;
                rb0Var = r1;
            }
            int i2 = this.b;
            this.c.m(jn5.m(i2, 1, user2), "50_50", rb0Var2, user2);
            de0 de0Var = this.f;
            if (!z) {
            }
            de0 de0Var2 = this.h;
            if (storyItem == null) {
            }
            j3 = j;
            if (j3 != j2) {
            }
            setContentDescription(a0);
            f = 0.0f;
            ?? r6 = this.e;
            if (j3 != j2) {
            }
            ff0Var.setRightPadding(hl.L(z5 ? 30.0f : 0.0f));
            ff0Var.setTranslationX((z5 || !ob6.a0) ? 0.0f : hl.L(30.0f));
            ((ViewGroup.MarginLayoutParams) r6.getLayoutParams()).rightMargin = hl.L((z5 || ob6.a0) ? 12.0f : 36.0f);
            if (z5) {
            }
            r6.setTranslationX(f);
        }
        this.E = user.id;
        ff0Var.k(lbc.r(user));
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null) {
            ?? r12 = userProfilePhoto.strippedBitmap;
            rb0Var = r12;
        }
        int i22 = this.b;
        this.c.m(jn5.m(i22, 1, user2), "50_50", rb0Var2, user2);
        de0 de0Var3 = this.f;
        if (!z) {
            if (de0Var3 != null) {
                de0Var3.setAnimatedEmojiDrawable(null);
            }
            Drawable mutate = getContext().getDrawable(R.drawable.media_like_active).mutate();
            de0Var3.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
            de0Var3.setImageDrawable(mutate);
            a0 = ob6.a0("AccDescrLike", null, 2131754846, new Object[0]);
            z5 = true;
        } else if (reaction != null) {
            w49 d = w49.d(reaction);
            if (d.f != null) {
                if (de0Var3 != null) {
                    de0Var3.setAnimatedEmojiDrawable(null);
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(i22).r.get(d.f);
                if (de0Var3 != null) {
                    if (tL_availableReaction != null) {
                        de0Var3.n(jn5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", lp3.d(tL_availableReaction.static_icon.thumbs, aob.a7, 1.0f, false), tL_availableReaction);
                        z6 = true;
                    } else {
                        de0Var3.setImageDrawable(null);
                        z6 = false;
                    }
                    de0Var3.setColorFilter(null);
                } else {
                    z6 = false;
                }
            } else {
                wl wlVar = new wl(0, i22, d.g);
                wlVar.setColorFilter(aob.n0(vnbVar));
                if (de0Var3 != null) {
                    de0Var3.setAnimatedEmojiDrawable(wlVar);
                }
                z6 = true;
            }
            CharSequence text = ff0Var.getText();
            Object obj = d.f;
            if (obj == null) {
                obj = reaction;
            }
            z5 = z6;
            a0 = ob6.a0("AccDescrReactedWith", null, 2131754786, text, obj);
        } else {
            if (de0Var3 != null) {
                de0Var3.setAnimatedEmojiDrawable(null);
                de0Var3.setImageDrawable(null);
            }
            a0 = ob6.a0("AccDescrPersonHasSeen", null, 2131754807, ff0Var.getText());
            z5 = false;
        }
        de0 de0Var22 = this.h;
        if (storyItem == null) {
            this.n = storyItem.id;
            if (de0Var22 != null) {
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia != null) {
                    TLRPC.Photo photo = messageMedia.photo;
                    if (photo != null) {
                        str = null;
                        j2 = 0;
                        de0Var22.h(jn5.i(xb4.w(photo.sizes, 35, false, null, true), storyItem.media.photo), "22_35", null, null, -1, storyItem);
                    } else {
                        str = null;
                        j2 = 0;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            de0Var22.h(jn5.c(xb4.w(document.thumbs, 35, false, null, true), storyItem.media.document), "22_35", null, null, -1, storyItem);
                        }
                    }
                } else {
                    str = null;
                    j2 = 0;
                }
                de0Var22.setRoundRadius(hl.L(3.33f));
            } else {
                str = null;
                j2 = 0;
            }
            if (j <= j2) {
                j3 = storyItem.date;
                if (j3 != j2) {
                    StringBuilder l = c00.l(a0, " ");
                    l.append(ob6.O(j3));
                    a0 = l.toString();
                }
                setContentDescription(a0);
                f = 0.0f;
                ?? r62 = this.e;
                if (j3 != j2) {
                    r62.setVisibility(0);
                    w57 w57Var = storyItem != null ? z2 ? L : K : z3 ? I : J;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(w57Var.a(getContext(), vnbVar));
                    spannableStringBuilder.append((CharSequence) ob6.O(j3));
                    if (z2 || storyItem == null) {
                        f2 = 9.0f;
                    } else {
                        f2 = 9.0f;
                        if (!TextUtils.isEmpty(storyItem.caption)) {
                            spannableStringBuilder.append((CharSequence) "\u2004");
                            spannableStringBuilder.append((CharSequence) ".");
                            np3 np3Var = new np3();
                            np3Var.c = 2.33333f;
                            np3Var.b = hl.L(5.0f);
                            spannableStringBuilder.setSpan(np3Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.append((CharSequence) "\u2004");
                            int length = spannableStringBuilder.length();
                            spannableStringBuilder.append((CharSequence) ob6.M0(2131744144, str));
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length, spannableStringBuilder.length(), 33);
                            r62.l(spannableStringBuilder, false);
                            r62.setTranslationY(z3 ? hl.L(-1.0f) : 0.0f);
                            ff0Var.setTranslationY(0.0f);
                            if (z4) {
                                ff0Var.setTranslationY(hl.L(f2));
                                ff0Var.animate().translationY(0.0f);
                                r62.setAlpha(0.0f);
                                r62.animate().alpha(1.0f);
                            }
                        }
                    }
                    if (!z2 && storyItem != null && (storyFwdHeader = storyItem.fwd_from) != null && storyFwdHeader.modified) {
                        spannableStringBuilder.append((CharSequence) "\u2004");
                        spannableStringBuilder.append((CharSequence) ".");
                        np3 np3Var2 = new np3();
                        np3Var2.c = 2.33333f;
                        np3Var2.b = hl.L(5.0f);
                        spannableStringBuilder.setSpan(np3Var2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) "\u2004");
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) "edited");
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length2, spannableStringBuilder.length(), 33);
                    }
                    r62.l(spannableStringBuilder, false);
                    r62.setTranslationY(z3 ? hl.L(-1.0f) : 0.0f);
                    ff0Var.setTranslationY(0.0f);
                    if (z4) {
                    }
                } else {
                    r62.setVisibility(8);
                    ff0Var.setTranslationY(hl.L(9.0f));
                }
                ff0Var.setRightPadding(hl.L(z5 ? 30.0f : 0.0f));
                ff0Var.setTranslationX((z5 || !ob6.a0) ? 0.0f : hl.L(30.0f));
                ((ViewGroup.MarginLayoutParams) r62.getLayoutParams()).rightMargin = hl.L((z5 || ob6.a0) ? 12.0f : 36.0f);
                if (z5 && ob6.a0) {
                    f = hl.L(30.0f);
                }
                r62.setTranslationX(f);
            }
        } else {
            str = null;
            j2 = 0;
            this.n = -1;
            if (de0Var22 != null) {
                de0Var22.setImageDrawable(null);
            }
        }
        j3 = j;
        if (j3 != j2) {
        }
        setContentDescription(a0);
        f = 0.0f;
        ?? r622 = this.e;
        if (j3 != j2) {
        }
        ff0Var.setRightPadding(hl.L(z5 ? 30.0f : 0.0f));
        ff0Var.setTranslationX((z5 || !ob6.a0) ? 0.0f : hl.L(30.0f));
        ((ViewGroup.MarginLayoutParams) r622.getLayoutParams()).rightMargin = hl.L((z5 || ob6.a0) ? 12.0f : 36.0f);
        if (z5) {
            f = hl.L(30.0f);
        }
        r622.setTranslationX(f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        if (this.G < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (this.G * 255.0f), 31);
            z = true;
        } else {
            z = false;
        }
        super.dispatchDraw(canvas);
        if (this.a) {
            float L2 = hl.L(this.y ? 73.0f : 55.0f);
            boolean z2 = ob6.a0;
            vnb vnbVar = this.x;
            if (z2) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L2, getMeasuredHeight() - 1, aob.U0("paintDivider", vnbVar));
            } else {
                canvas.drawLine(L2, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, aob.U0("paintDivider", vnbVar));
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.G;
    }

    public vnb getResourcesProvider() {
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
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(!this.y ? 50 : 58), TLObject.FLAG_30));
    }

    public void setUserReaction(TLRPC.MessagePeerReaction messagePeerReaction) {
        TLRPC.Chat M0;
        TLRPC.User user;
        if (messagePeerReaction == null) {
            return;
        }
        long B1 = r47.B1(messagePeerReaction.peer_id);
        int i = this.b;
        if (B1 > 0) {
            user = uc7.s1(i).X1(Long.valueOf(B1));
            M0 = null;
        } else {
            M0 = uc7.s1(i).M0(Long.valueOf(-B1));
            user = null;
        }
        c(user, M0, messagePeerReaction.reaction, false, messagePeerReaction.date, null, false, messagePeerReaction.dateIsSeen, false);
    }

    @Override // snb
    public final void updateColors() {
        c2b c2bVar = this.w;
        if (c2bVar != null) {
            try {
                ul ulVar = c2bVar.a;
                if (!(ulVar != null) || ulVar.G == null) {
                    return;
                }
                ulVar.k(Integer.valueOf(aob.v0(this.y ? aob.G6 : aob.z9, this.x)));
                ff0 ff0Var = this.d;
                if (ff0Var != null) {
                    ff0Var.invalidate();
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(long j) {
    }
}
