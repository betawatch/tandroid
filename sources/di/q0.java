package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.dd;
import bi.mc;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.zq;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class q0 extends FrameLayout implements k80 {
    public final TextView E;
    public final TextView F;
    public final zq[] G;
    public final zq[] H;
    public int I;
    public ValueAnimator J;
    public v0 K;
    public final Paint L;
    public boolean a;
    public boolean b;
    public final int c;
    public final boolean d;
    public Drawable e;
    public float f;
    public final mc h;
    public final LinearLayout n;
    public final xh.n r;
    public final xh.n s;
    public CharSequence v;
    public final org.telegram.ui.Components.y9 w;
    public final org.telegram.ui.Components.j9 x;
    public final xh.n y;

    public q0(int i10, Context context, boolean z10) {
        super(context);
        this.a = false;
        this.b = true;
        this.f = 0.5f;
        this.G = new zq[1];
        this.H = new zq[1];
        this.L = new Paint(1);
        this.c = i10;
        this.d = z10;
        mc mcVar = new mc(this, context);
        this.h = mcVar;
        mcVar.setOrientation(0);
        addView(mcVar, kb1.h(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.x = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.w = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        mcVar.addView(y9Var, kb1.t(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        mcVar.addView(linearLayout, kb1.t(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, kb1.r(-2, -2));
        xh.n nVar = new xh.n(context);
        this.r = nVar;
        nVar.setTextColor(-1);
        nVar.setTextSize(1, 14.0f);
        nVar.setGravity(3);
        nVar.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(nVar, kb1.t(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        xh.n nVar2 = new xh.n(context);
        this.s = nVar2;
        nVar2.setTextColor(org.telegram.ui.ActionBar.y6.o1(0.55f, -1));
        nVar2.setTextSize(1, 12.0f);
        nVar2.setGravity(5);
        linearLayout2.addView(nVar2, kb1.t(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        xh.n nVar3 = new xh.n(context);
        this.y = nVar3;
        nVar3.setTextColor(-1);
        nVar3.setTextSize(1, 14.0f);
        nVar3.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.y6.o1(0.6f, -16777216));
        NotificationCenter.listenEmojiLoading(nVar3);
        linearLayout.addView(nVar3, kb1.r(-2, -2));
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        textView.setVisibility(8);
        mcVar.addView(textView, kb1.t(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.F = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        mcVar.addView(textView2, kb1.t(-2, -2, 0.0f, 85, 0, 3, 10, 0));
    }

    @Override // org.telegram.ui.Components.k80
    public final void a(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // org.telegram.ui.Components.k80
    public final void b(Canvas canvas, float f7) {
        mc mcVar = this.h;
        if (mcVar.getBackground() == null) {
            int o12 = org.telegram.ui.ActionBar.y6.o1(f7 * 0.5f, -16777216);
            Paint paint = this.L;
            paint.setColor(o12);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(mcVar.getX(), mcVar.getY(), mcVar.getX() + mcVar.getWidth(), mcVar.getY() + mcVar.getHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
        }
        draw(canvas);
    }

    public final void c() {
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f * 255.0f));
                this.h.invalidate();
            }
        }
        v0 v0Var = this.K;
        if (v0Var == null || this.e == null) {
            return;
        }
        this.I = v0Var.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.J = ofFloat;
        ofFloat.addUpdateListener(new ai.g0(this, 14));
        this.J.addListener(new bh.b(this, 8));
        this.J.setDuration(350L);
        this.J.setInterpolator(ds.h);
        this.J.start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotX(0.0f);
        setPivotY(getMeasuredHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0229  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void set(v0 v0Var) {
        ValueAnimator valueAnimator;
        String str;
        boolean z10;
        int i10;
        boolean z11;
        CharSequence charSequence;
        this.K = v0Var;
        mc mcVar = this.h;
        if ((v0Var == null || this.I != v0Var.a) && (valueAnimator = this.J) != null) {
            valueAnimator.cancel();
            this.J = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f * 255.0f));
                mcVar.invalidate();
            }
        }
        long j10 = v0Var.c;
        org.telegram.ui.Components.y9 y9Var = this.w;
        org.telegram.ui.Components.j9 j9Var = this.x;
        int i11 = this.c;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(v0Var.c));
            j9Var.r(user);
            y9Var.f(user, j9Var);
            str = UserObject.getForcedFirstName(user);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-v0Var.c));
            j9Var.q(chat);
            y9Var.f(chat, j9Var);
            str = chat == null ? "" : chat.title;
        }
        int b10 = u.b(i11, (int) v0Var.g, 3);
        int b11 = u.b(i11, (int) v0Var.g, 4);
        int b12 = u.b(i11, (int) v0Var.g, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z12 = v0Var.b;
        boolean z13 = this.d;
        xh.n nVar = this.y;
        if (!z12 || v0Var.g > 0) {
            if (v0Var.h > 0) {
                spannableStringBuilder.append((CharSequence) ("#" + v0Var.h));
                z10 = z13;
                zq zqVar = new zq(0, new m0(getContext(), v0Var.h));
                zqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                spannableStringBuilder.setSpan(zqVar, 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "\u2009");
            } else {
                z10 = z13;
            }
            spannableStringBuilder.append(TextUtils.ellipsize(str, nVar.getPaint(), AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
            if (z10) {
                i10 = 33;
                spannableStringBuilder.setSpan(new o0(), 0, spannableStringBuilder.length(), 33);
            } else {
                i10 = 33;
            }
            spannableStringBuilder.setSpan(new r61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), i10);
            spannableStringBuilder.append((CharSequence) " ");
        } else {
            z10 = z13;
        }
        int b13 = u.b(i11, (int) v0Var.g, 1);
        int b14 = u.b(i11, (int) v0Var.g, 2);
        TLRPC.TL_textWithEntities tL_textWithEntities = v0Var.f;
        if (tL_textWithEntities != null) {
            CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false, nVar.getPaint());
            this.v = formatTextWithEntities;
            CharSequence superTrim = AndroidUtilities.superTrim(formatTextWithEntities);
            this.v = superTrim;
            if (superTrim.length() > b13 && !v0Var.b) {
                this.v = this.v.subSequence(0, b13);
            }
            CharSequence charSequence2 = this.v;
            if (charSequence2 instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence2;
                org.telegram.ui.Components.c6[] c6VarArr = (org.telegram.ui.Components.c6[]) spannable.getSpans(0, charSequence2.length(), org.telegram.ui.Components.c6.class);
                z11 = true;
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannable.getSpans(0, this.v.length(), Emoji.EmojiSpan.class);
                if (c6VarArr.length + emojiSpanArr.length > b14 && !v0Var.b) {
                    ArrayList arrayList = new ArrayList();
                    charSequence = " ";
                    int i12 = 0;
                    while (i12 < c6VarArr.length) {
                        org.telegram.ui.Components.c6[] c6VarArr2 = c6VarArr;
                        int i13 = i12;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(c6VarArr2[i12])), Integer.valueOf(spannable.getSpanEnd(c6VarArr2[i13]))));
                        i12 = i13 + 1;
                        c6VarArr = c6VarArr2;
                    }
                    int i14 = 0;
                    while (i14 < emojiSpanArr.length) {
                        int i15 = i14;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(emojiSpanArr[i14])), Integer.valueOf(spannable.getSpanEnd(emojiSpanArr[i15]))));
                        i14 = i15 + 1;
                    }
                    Collections.sort(arrayList, new a4.d(13));
                    if (!(this.v instanceof SpannableStringBuilder)) {
                        this.v = new SpannableStringBuilder(this.v);
                    }
                    for (int size = arrayList.size() - 1; size >= b14; size--) {
                        Pair pair = (Pair) arrayList.get(size);
                        ((SpannableStringBuilder) this.v).replace(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), (CharSequence) "");
                    }
                    if (!v0Var.b) {
                        this.v = AndroidUtilities.replaceNewLines(this.v);
                    }
                    spannableStringBuilder.append(this.v);
                }
            } else {
                z11 = true;
            }
            charSequence = " ";
            if (!v0Var.b) {
            }
            spannableStringBuilder.append(this.v);
        } else {
            z11 = true;
            charSequence = " ";
            this.v = "";
        }
        nVar.setText(Emoji.replaceEmoji(spannableStringBuilder, nVar.getPaint().getFontMetricsInt(), false));
        this.e = null;
        this.n.setVisibility((!v0Var.b || v0Var.g > 0) ? 8 : 0);
        long j11 = v0Var.g;
        TextView textView = this.F;
        TextView textView2 = this.E;
        if (j11 > 0) {
            boolean z14 = j11 >= 250 ? z11 : false;
            this.a = z14;
            mcVar.setWillNotDraw(!z14);
            mcVar.invalidate();
            nVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int dp = AndroidUtilities.dp(13.0f);
            int i16 = org.telegram.ui.ActionBar.y6.a;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{b10, b11});
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dp);
            this.e = gradientDrawable;
            mcVar.setBackground(gradientDrawable);
            Drawable drawable2 = this.e;
            float f7 = z10 ? 1.0f : 0.65f;
            this.f = f7;
            drawable2.setAlpha((int) (f7 * 255.0f));
            if (v0Var.e) {
                textView.setVisibility(8);
                textView.setText("");
                textView2.setVisibility(0);
                textView2.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.y6.o1(0.25f, b12)));
                textView2.setText(dd.T0(false, org.telegram.messenger.t.i(v0Var.g, ',', new StringBuilder("⭐️ ")), 0.75f, this.G, AndroidUtilities.dp(0.66f), 1.0f));
                zq zqVar2 = this.G[0];
                if (zqVar2 != null) {
                    zqVar2.draw = this.b;
                }
            } else {
                textView.setVisibility(0);
                textView.setText(dd.T0(false, org.telegram.messenger.t.i(v0Var.g, ',', new StringBuilder("⭐️ ")), 0.75f, this.H, 0.0f, 1.0f));
                textView2.setVisibility(8);
                textView2.setText("");
            }
        } else if (v0Var.b) {
            this.a = false;
            mcVar.setWillNotDraw(z11);
            ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(13.0f), -16777216);
            this.e = c02;
            mcVar.setBackground(c02);
            Drawable drawable3 = this.e;
            this.f = 0.5f;
            drawable3.setAlpha((int) 127.5f);
            nVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) DialogObject.getName(i11, v0Var.c));
            spannableStringBuilder2.append(charSequence);
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LiveStoryBadge));
            spannableStringBuilder2.setSpan(new n0(), length, spannableStringBuilder2.length(), 33);
            this.r.setText(spannableStringBuilder2);
            this.s.setText(LocaleController.getString(R.string.LiveStoryAdminRole));
            textView.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            this.a = false;
            mcVar.setWillNotDraw(true);
            nVar.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.y6.o1(0.6f, -16777216));
            this.e = null;
            mcVar.setBackground(null);
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
        mcVar.invalidate();
    }

    public void setDrawStar(boolean z10) {
        this.b = z10;
        zq zqVar = this.G[0];
        if (zqVar == null || zqVar.draw == z10) {
            return;
        }
        zqVar.draw = z10;
        this.E.invalidate();
    }
}
