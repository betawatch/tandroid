package ai;

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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.o80;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class h1 extends FrameLayout implements o80 {
    public final TextView E;
    public final TextView F;
    public final er[] G;
    public final er[] H;
    public int I;
    public ValueAnimator J;
    public m1 K;
    public final Paint L;
    public boolean a;
    public boolean b;
    public final int c;
    public final boolean d;
    public Drawable e;
    public float f;
    public final d1 h;
    public final LinearLayout n;
    public final vh.n r;
    public final vh.n s;
    public CharSequence v;
    public final org.telegram.ui.Components.y9 w;
    public final org.telegram.ui.Components.j9 x;
    public final vh.n y;

    public h1(int i10, Context context, boolean z10) {
        super(context);
        this.a = false;
        this.b = true;
        this.f = 0.5f;
        this.G = new er[1];
        this.H = new er[1];
        this.L = new Paint(1);
        this.c = i10;
        this.d = z10;
        d1 d1Var = new d1(this, context);
        this.h = d1Var;
        d1Var.setOrientation(0);
        addView(d1Var, w7.x5.a(-2.0f, 0.0f, 0.5f, 0.0f, 0.5f, -2, 51));
        this.x = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.w = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        d1Var.addView(y9Var, w7.x5.p(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        d1Var.addView(linearLayout, w7.x5.p(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, w7.x5.n(-2, -2));
        vh.n nVar = new vh.n(context);
        this.r = nVar;
        nVar.setTextColor(-1);
        nVar.setTextSize(1, 14.0f);
        nVar.setGravity(3);
        nVar.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(nVar, w7.x5.p(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        vh.n nVar2 = new vh.n(context);
        this.s = nVar2;
        nVar2.setTextColor(org.telegram.ui.ActionBar.i6.m1(0.55f, -1));
        nVar2.setTextSize(1, 12.0f);
        nVar2.setGravity(5);
        linearLayout2.addView(nVar2, w7.x5.p(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        vh.n nVar3 = new vh.n(context);
        this.y = nVar3;
        nVar3.setTextColor(-1);
        nVar3.setTextSize(1, 14.0f);
        nVar3.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.i6.m1(0.6f, -16777216));
        NotificationCenter.listenEmojiLoading(nVar3);
        linearLayout.addView(nVar3, w7.x5.n(-2, -2));
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        textView.setVisibility(8);
        d1Var.addView(textView, w7.x5.p(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.F = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        d1Var.addView(textView2, w7.x5.p(-2, -2, 0.0f, 85, 0, 3, 10, 0));
    }

    @Override // org.telegram.ui.Components.o80
    public final void a(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // org.telegram.ui.Components.o80
    public final void b(Canvas canvas, float f7) {
        d1 d1Var = this.h;
        if (d1Var.getBackground() == null) {
            int m12 = org.telegram.ui.ActionBar.i6.m1(f7 * 0.5f, -16777216);
            Paint paint = this.L;
            paint.setColor(m12);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(d1Var.getX(), d1Var.getY(), d1Var.getX() + d1Var.getWidth(), d1Var.getY() + d1Var.getHeight());
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
        m1 m1Var = this.K;
        if (m1Var == null || this.e == null) {
            return;
        }
        this.I = m1Var.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.J = ofFloat;
        ofFloat.addUpdateListener(new a(this, 4));
        this.J.addListener(new b(this, 2));
        this.J.setDuration(350L);
        this.J.setInterpolator(hs.h);
        this.J.start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotX(0.0f);
        setPivotY(getMeasuredHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void set(m1 m1Var) {
        ValueAnimator valueAnimator;
        String str;
        int i10;
        boolean z10;
        int i11;
        int i12;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        CharSequence charSequence;
        boolean z11;
        int i13;
        long j3;
        this.K = m1Var;
        d1 d1Var = this.h;
        if ((m1Var == null || this.I != m1Var.a) && (valueAnimator = this.J) != null) {
            valueAnimator.cancel();
            this.J = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f * 255.0f));
                d1Var.invalidate();
            }
        }
        long j10 = m1Var.c;
        org.telegram.ui.Components.y9 y9Var = this.w;
        org.telegram.ui.Components.j9 j9Var = this.x;
        int i14 = this.c;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(m1Var.c));
            j9Var.r(user);
            y9Var.e(user, j9Var);
            str = UserObject.getForcedFirstName(user);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-m1Var.c));
            j9Var.q(chat);
            y9Var.e(chat, j9Var);
            str = chat == null ? "" : chat.title;
        }
        int b10 = g0.b(i14, (int) m1Var.g, 3);
        int b11 = g0.b(i14, (int) m1Var.g, 4);
        int b12 = g0.b(i14, (int) m1Var.g, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z12 = m1Var.b;
        boolean z13 = this.d;
        vh.n nVar = this.y;
        if (z12) {
            i10 = b11;
            if (m1Var.g <= 0) {
                z10 = z13;
                int b13 = g0.b(i14, (int) m1Var.g, 1);
                int b14 = g0.b(i14, (int) m1Var.g, 2);
                tL_textWithEntities = m1Var.f;
                if (tL_textWithEntities == null) {
                    z11 = true;
                    CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false, nVar.getPaint());
                    this.v = formatTextWithEntities;
                    CharSequence superTrim = AndroidUtilities.superTrim(formatTextWithEntities);
                    this.v = superTrim;
                    if (superTrim.length() > b13 && !m1Var.b) {
                        this.v = this.v.subSequence(0, b13);
                    }
                    CharSequence charSequence2 = this.v;
                    if (charSequence2 instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequence2;
                        org.telegram.ui.Components.b6[] b6VarArr = (org.telegram.ui.Components.b6[]) spannable.getSpans(0, charSequence2.length(), org.telegram.ui.Components.b6.class);
                        i13 = i10;
                        Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannable.getSpans(0, this.v.length(), Emoji.EmojiSpan.class);
                        if (b6VarArr.length + emojiSpanArr.length <= b14 || m1Var.b) {
                            charSequence = " ";
                        } else {
                            ArrayList arrayList = new ArrayList();
                            charSequence = " ";
                            int i15 = 0;
                            while (i15 < b6VarArr.length) {
                                org.telegram.ui.Components.b6[] b6VarArr2 = b6VarArr;
                                int i16 = i15;
                                arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(b6VarArr2[i15])), Integer.valueOf(spannable.getSpanEnd(b6VarArr2[i16]))));
                                i15 = i16 + 1;
                                b6VarArr = b6VarArr2;
                            }
                            int i17 = 0;
                            while (i17 < emojiSpanArr.length) {
                                int i18 = i17;
                                arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(emojiSpanArr[i17])), Integer.valueOf(spannable.getSpanEnd(emojiSpanArr[i18]))));
                                i17 = i18 + 1;
                            }
                            Collections.sort(arrayList, new a4.d(5));
                            if (!(this.v instanceof SpannableStringBuilder)) {
                                this.v = new SpannableStringBuilder(this.v);
                            }
                            for (int size = arrayList.size() - 1; size >= b14; size--) {
                                Pair pair = (Pair) arrayList.get(size);
                                ((SpannableStringBuilder) this.v).replace(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), (CharSequence) "");
                            }
                        }
                    } else {
                        charSequence = " ";
                        i13 = i10;
                    }
                    if (!m1Var.b) {
                        this.v = AndroidUtilities.replaceNewLines(this.v);
                    }
                    spannableStringBuilder.append(this.v);
                } else {
                    charSequence = " ";
                    z11 = true;
                    i13 = i10;
                    this.v = "";
                }
                nVar.setText(Emoji.replaceEmoji(spannableStringBuilder, nVar.getPaint().getFontMetricsInt(), false));
                this.e = null;
                this.n.setVisibility((m1Var.b || m1Var.g > 0) ? 8 : 0);
                j3 = m1Var.g;
                TextView textView = this.F;
                TextView textView2 = this.E;
                if (j3 <= 0) {
                    boolean z14 = j3 >= 250 ? z11 : false;
                    this.a = z14;
                    d1Var.setWillNotDraw(!z14);
                    d1Var.invalidate();
                    nVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    int dp = AndroidUtilities.dp(13.0f);
                    int i19 = org.telegram.ui.ActionBar.i6.a;
                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{b10, i13});
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadius(dp);
                    this.e = gradientDrawable;
                    d1Var.setBackground(gradientDrawable);
                    Drawable drawable2 = this.e;
                    float f7 = !z10 ? 0.65f : 1.0f;
                    this.f = f7;
                    drawable2.setAlpha((int) (f7 * 255.0f));
                    if (m1Var.e) {
                        textView.setVisibility(8);
                        textView.setText("");
                        textView2.setVisibility(0);
                        textView2.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.i6.m1(0.25f, b12)));
                        textView2.setText(yh.p7.V0(false, org.telegram.messenger.q.h(m1Var.g, ',', new StringBuilder("⭐️ ")), 0.75f, this.G, AndroidUtilities.dp(0.66f), 1.0f));
                        er erVar = this.G[0];
                        if (erVar != null) {
                            erVar.draw = this.b;
                        }
                    } else {
                        textView.setVisibility(0);
                        textView.setText(yh.p7.V0(false, org.telegram.messenger.q.h(m1Var.g, ',', new StringBuilder("⭐️ ")), 0.75f, this.H, 0.0f, 1.0f));
                        textView2.setVisibility(8);
                        textView2.setText("");
                    }
                } else if (m1Var.b) {
                    this.a = false;
                    d1Var.setWillNotDraw(z11);
                    ShapeDrawable c02 = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(13.0f), -16777216);
                    this.e = c02;
                    d1Var.setBackground(c02);
                    Drawable drawable3 = this.e;
                    this.f = 0.5f;
                    drawable3.setAlpha((int) 127.5f);
                    nVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    spannableStringBuilder2.append((CharSequence) DialogObject.getName(i14, m1Var.c));
                    spannableStringBuilder2.append(charSequence);
                    int length = spannableStringBuilder2.length();
                    spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LiveStoryBadge));
                    spannableStringBuilder2.setSpan(new e1(), length, spannableStringBuilder2.length(), 33);
                    this.r.setText(spannableStringBuilder2);
                    this.s.setText(LocaleController.getString(R.string.LiveStoryAdminRole));
                    textView.setVisibility(8);
                    textView2.setVisibility(8);
                } else {
                    this.a = false;
                    d1Var.setWillNotDraw(true);
                    nVar.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.i6.m1(0.6f, -16777216));
                    this.e = null;
                    d1Var.setBackground(null);
                    textView.setVisibility(8);
                    textView2.setVisibility(8);
                }
                d1Var.invalidate();
            }
        } else {
            i10 = b11;
        }
        if (m1Var.h > 0) {
            spannableStringBuilder.append((CharSequence) ("#" + m1Var.h));
            z10 = z13;
            er erVar2 = new er(0, new c1(getContext(), m1Var.h));
            erVar2.setTranslateY(AndroidUtilities.dp(1.0f));
            spannableStringBuilder.setSpan(erVar2, 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "\u2009");
        } else {
            z10 = z13;
        }
        spannableStringBuilder.append(TextUtils.ellipsize(str, nVar.getPaint(), AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
        if (z10) {
            i11 = 0;
            i12 = 33;
            spannableStringBuilder.setSpan(new f1(), 0, spannableStringBuilder.length(), 33);
        } else {
            i11 = 0;
            i12 = 33;
        }
        spannableStringBuilder.setSpan(new m61(AndroidUtilities.bold()), i11, spannableStringBuilder.length(), i12);
        spannableStringBuilder.append((CharSequence) " ");
        int b132 = g0.b(i14, (int) m1Var.g, 1);
        int b142 = g0.b(i14, (int) m1Var.g, 2);
        tL_textWithEntities = m1Var.f;
        if (tL_textWithEntities == null) {
        }
        nVar.setText(Emoji.replaceEmoji(spannableStringBuilder, nVar.getPaint().getFontMetricsInt(), false));
        this.e = null;
        this.n.setVisibility((m1Var.b || m1Var.g > 0) ? 8 : 0);
        j3 = m1Var.g;
        TextView textView3 = this.F;
        TextView textView22 = this.E;
        if (j3 <= 0) {
        }
        d1Var.invalidate();
    }

    public void setDrawStar(boolean z10) {
        this.b = z10;
        er erVar = this.G[0];
        if (erVar == null || erVar.draw == z10) {
            return;
        }
        erVar.draw = z10;
        this.E.invalidate();
    }
}
