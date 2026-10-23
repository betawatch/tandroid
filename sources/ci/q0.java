package ci;

import ai.nd;
import ai.vc;
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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class q0 extends FrameLayout implements i80 {
    public final TextView E;
    public final TextView F;
    public final xq[] G;
    public final xq[] H;
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
    public final vc h;
    public final LinearLayout n;
    public final wh.n r;
    public final wh.n s;
    public CharSequence v;
    public final org.telegram.ui.Components.w9 w;
    public final org.telegram.ui.Components.h9 x;
    public final wh.n y;

    public q0(int i10, Context context, boolean z10) {
        super(context);
        this.a = false;
        this.b = true;
        this.f = 0.5f;
        this.G = new xq[1];
        this.H = new xq[1];
        this.L = new Paint(1);
        this.c = i10;
        this.d = z10;
        vc vcVar = new vc(this, context);
        this.h = vcVar;
        vcVar.setOrientation(0);
        addView(vcVar, w7.z5.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.x = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.w = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        vcVar.addView(w9Var, w7.z5.p(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        vcVar.addView(linearLayout, w7.z5.p(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, w7.z5.n(-2, -2));
        wh.n nVar = new wh.n(context);
        this.r = nVar;
        nVar.setTextColor(-1);
        nVar.setTextSize(1, 14.0f);
        nVar.setGravity(3);
        nVar.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(nVar, w7.z5.p(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        wh.n nVar2 = new wh.n(context);
        this.s = nVar2;
        nVar2.setTextColor(org.telegram.ui.ActionBar.k6.o1(0.55f, -1));
        nVar2.setTextSize(1, 12.0f);
        nVar2.setGravity(5);
        linearLayout2.addView(nVar2, w7.z5.p(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        wh.n nVar3 = new wh.n(context);
        this.y = nVar3;
        nVar3.setTextColor(-1);
        nVar3.setTextSize(1, 14.0f);
        nVar3.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.k6.o1(0.6f, -16777216));
        NotificationCenter.listenEmojiLoading(nVar3);
        linearLayout.addView(nVar3, w7.z5.n(-2, -2));
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        textView.setVisibility(8);
        vcVar.addView(textView, w7.z5.p(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.F = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        vcVar.addView(textView2, w7.z5.p(-2, -2, 0.0f, 85, 0, 3, 10, 0));
    }

    @Override // org.telegram.ui.Components.i80
    public final void a(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    public final void b() {
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
        ofFloat.addUpdateListener(new ah.c0(this, 12));
        this.J.addListener(new ah.b(this, 7));
        this.J.setDuration(350L);
        this.J.setInterpolator(bs.h);
        this.J.start();
    }

    @Override // org.telegram.ui.Components.i80
    public final void c(Canvas canvas, float f7) {
        vc vcVar = this.h;
        if (vcVar.getBackground() == null) {
            int o12 = org.telegram.ui.ActionBar.k6.o1(f7 * 0.5f, -16777216);
            Paint paint = this.L;
            paint.setColor(o12);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(vcVar.getX(), vcVar.getY(), vcVar.getX() + vcVar.getWidth(), vcVar.getY() + vcVar.getHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
        }
        draw(canvas);
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
        vc vcVar = this.h;
        if ((v0Var == null || this.I != v0Var.a) && (valueAnimator = this.J) != null) {
            valueAnimator.cancel();
            this.J = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f * 255.0f));
                vcVar.invalidate();
            }
        }
        long j10 = v0Var.c;
        org.telegram.ui.Components.w9 w9Var = this.w;
        org.telegram.ui.Components.h9 h9Var = this.x;
        int i11 = this.c;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(v0Var.c));
            h9Var.r(user);
            w9Var.e(user, h9Var);
            str = UserObject.getForcedFirstName(user);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-v0Var.c));
            h9Var.q(chat);
            w9Var.e(chat, h9Var);
            str = chat == null ? "" : chat.title;
        }
        int b10 = u.b(i11, (int) v0Var.g, 3);
        int b11 = u.b(i11, (int) v0Var.g, 4);
        int b12 = u.b(i11, (int) v0Var.g, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z12 = v0Var.b;
        boolean z13 = this.d;
        wh.n nVar = this.y;
        if (!z12 || v0Var.g > 0) {
            if (v0Var.h > 0) {
                spannableStringBuilder.append((CharSequence) ("#" + v0Var.h));
                z10 = z13;
                xq xqVar = new xq(0, new m0(getContext(), v0Var.h));
                xqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                spannableStringBuilder.setSpan(xqVar, 0, spannableStringBuilder.length(), 33);
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
            spannableStringBuilder.setSpan(new j61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), i10);
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
                org.telegram.ui.Components.a6[] a6VarArr = (org.telegram.ui.Components.a6[]) spannable.getSpans(0, charSequence2.length(), org.telegram.ui.Components.a6.class);
                z11 = true;
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannable.getSpans(0, this.v.length(), Emoji.EmojiSpan.class);
                if (a6VarArr.length + emojiSpanArr.length > b14 && !v0Var.b) {
                    ArrayList arrayList = new ArrayList();
                    charSequence = " ";
                    int i12 = 0;
                    while (i12 < a6VarArr.length) {
                        org.telegram.ui.Components.a6[] a6VarArr2 = a6VarArr;
                        int i13 = i12;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(a6VarArr2[i12])), Integer.valueOf(spannable.getSpanEnd(a6VarArr2[i13]))));
                        i12 = i13 + 1;
                        a6VarArr = a6VarArr2;
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
            vcVar.setWillNotDraw(!z14);
            vcVar.invalidate();
            nVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int dp = AndroidUtilities.dp(13.0f);
            int i16 = org.telegram.ui.ActionBar.k6.a;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{b10, b11});
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dp);
            this.e = gradientDrawable;
            vcVar.setBackground(gradientDrawable);
            Drawable drawable2 = this.e;
            float f7 = z10 ? 1.0f : 0.65f;
            this.f = f7;
            drawable2.setAlpha((int) (f7 * 255.0f));
            if (v0Var.e) {
                textView.setVisibility(8);
                textView.setText("");
                textView2.setVisibility(0);
                textView2.setBackground(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.k6.o1(0.25f, b12)));
                textView2.setText(nd.V0(false, i2.o1.m(v0Var.g, ',', new StringBuilder("⭐️ ")), 0.75f, this.G, AndroidUtilities.dp(0.66f), 1.0f));
                xq xqVar2 = this.G[0];
                if (xqVar2 != null) {
                    xqVar2.draw = this.b;
                }
            } else {
                textView.setVisibility(0);
                textView.setText(nd.V0(false, i2.o1.m(v0Var.g, ',', new StringBuilder("⭐️ ")), 0.75f, this.H, 0.0f, 1.0f));
                textView2.setVisibility(8);
                textView2.setText("");
            }
        } else if (v0Var.b) {
            this.a = false;
            vcVar.setWillNotDraw(z11);
            ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(13.0f), -16777216);
            this.e = c02;
            vcVar.setBackground(c02);
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
            vcVar.setWillNotDraw(true);
            nVar.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.k6.o1(0.6f, -16777216));
            this.e = null;
            vcVar.setBackground(null);
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
        vcVar.invalidate();
    }

    public void setDrawStar(boolean z10) {
        this.b = z10;
        xq xqVar = this.G[0];
        if (xqVar == null || xqVar.draw == z10) {
            return;
        }
        xqVar.draw = z10;
        this.E.invalidate();
    }
}
