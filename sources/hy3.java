// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class hy3 extends FrameLayout {
    public final p66 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final ok8 e;
    public final s7 f;
    public final boolean h;
    public final qu0 n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public float w;
    public ValueAnimator x;
    public final /* synthetic */ ly3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy3(ly3 ly3Var, Context context, boolean z) {
        super(context);
        float f;
        float f2;
        float f3;
        this.y = ly3Var;
        this.n = new qu0(this, (byte) 4);
        final byte b = 0;
        this.s = false;
        this.w = 0.0f;
        this.h = z;
        final byte b2 = 1;
        if (z) {
            f = 32.0f;
        } else {
            Pattern pattern = ly3.P1;
            float f4 = 8.0f;
            if (yac.h(ly3Var.a).p()) {
                f2 = 28.0f;
                f3 = 16.0f;
            } else {
                f3 = 16.0f;
                f2 = 28.0f;
                ok8 ok8Var = new ok8(hl.L(4.0f), ly3Var.J0, context, false);
                this.e = ok8Var;
                ok8Var.b(ob6.M0(2131743531, null), new View.OnClickListener(this) { // from class: fy3
                    public final /* synthetic */ hy3 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b;
                        hy3 hy3Var = this.b;
                        switch (b3) {
                            case 0:
                                ly3 ly3Var2 = hy3Var.y;
                                ly3Var2.K1 = SystemClock.elapsedRealtime();
                                ly3Var2.I0();
                                break;
                            case 1:
                                ly3.F0(hy3Var.n, hy3Var.r, true, null, null);
                                hy3Var.a(true, true);
                                break;
                            case 2:
                                qu0 qu0Var = hy3Var.n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = hy3Var.r;
                                lw3 lw3Var = new lw3(hy3Var, (byte) 3);
                                Pattern pattern2 = ly3.P1;
                                if (qu0Var != null && tL_messages_stickerSet != null && qu0Var.getFragmentView() != null) {
                                    ls6.d0(qu0Var.getCurrentAccount()).i2(qu0Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, qu0Var, null, true, true, lw3Var, true);
                                }
                                hy3Var.a(false, true);
                                break;
                            default:
                                hy3Var.f.U(null, null);
                                break;
                        }
                    }
                }, false);
                ok8Var.setIcon(R.raw.unlock_icon);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ok8Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = hl.L(1.0f);
                marginLayoutParams.topMargin = hl.L(1.0f);
                int L = hl.L(20.0f);
                marginLayoutParams.height = L;
                marginLayoutParams.width = L;
                ((ViewGroup.MarginLayoutParams) ok8Var.getTextView().getLayoutParams()).leftMargin = hl.L(3.0f);
                ok8Var.getChildAt(0).setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                addView(ok8Var, tre.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                ok8Var.measure(-2147383649, View.MeasureSpec.makeMeasureSpec(hl.L(28.0f), TLObject.FLAG_30));
                f4 = (hl.L(16.0f) + ok8Var.getMeasuredWidth()) / hl.p;
            }
            float f5 = f4;
            TextView textView = new TextView(context);
            this.c = textView;
            textView.setTypeface(hl.o());
            yob.X(textView, aob.Ji, ly3Var.J0);
            int i = aob.Fi;
            hf0 e = rnb.e(aob.v0(i, ly3Var.J0), 14.0f);
            uob M = yob.M(i);
            uob e2 = yob.e(i);
            vnb vnbVar = ly3Var.J0;
            textView.setBackground(e);
            yob.j(textView, e, M, e2, vnbVar);
            textView.setText(ob6.M0(2131754479, null));
            textView.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: fy3
                public final /* synthetic */ hy3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b3 = b2;
                    hy3 hy3Var = this.b;
                    switch (b3) {
                        case 0:
                            ly3 ly3Var2 = hy3Var.y;
                            ly3Var2.K1 = SystemClock.elapsedRealtime();
                            ly3Var2.I0();
                            break;
                        case 1:
                            ly3.F0(hy3Var.n, hy3Var.r, true, null, null);
                            hy3Var.a(true, true);
                            break;
                        case 2:
                            qu0 qu0Var = hy3Var.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = hy3Var.r;
                            lw3 lw3Var = new lw3(hy3Var, (byte) 3);
                            Pattern pattern2 = ly3.P1;
                            if (qu0Var != null && tL_messages_stickerSet != null && qu0Var.getFragmentView() != null) {
                                ls6.d0(qu0Var.getCurrentAccount()).i2(qu0Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, qu0Var, null, true, true, lw3Var, true);
                            }
                            hy3Var.a(false, true);
                            break;
                        default:
                            hy3Var.f.U(null, null);
                            break;
                    }
                }
            });
            addView(textView, tre.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(-2147383649, View.MeasureSpec.makeMeasureSpec(hl.L(f2), TLObject.FLAG_30));
            float max = Math.max(f5, (hl.L(f3) + textView.getMeasuredWidth()) / hl.p);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(hl.o());
            yob.X(textView2, i, ly3Var.J0);
            hf0 Y = aob.Y(aob.v0(i, ly3Var.J0) & 268435455, 4, 4);
            uob g = yob.g(i, 15);
            vnb vnbVar2 = ly3Var.J0;
            textView2.setBackground(Y);
            yob.j(textView2, Y, null, g, vnbVar2);
            textView2.setText(ob6.M0(2131744512, null));
            textView2.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
            textView2.setGravity(17);
            final byte b3 = 2;
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: fy3
                public final /* synthetic */ hy3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b3;
                    hy3 hy3Var = this.b;
                    switch (b32) {
                        case 0:
                            ly3 ly3Var2 = hy3Var.y;
                            ly3Var2.K1 = SystemClock.elapsedRealtime();
                            ly3Var2.I0();
                            break;
                        case 1:
                            ly3.F0(hy3Var.n, hy3Var.r, true, null, null);
                            hy3Var.a(true, true);
                            break;
                        case 2:
                            qu0 qu0Var = hy3Var.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = hy3Var.r;
                            lw3 lw3Var = new lw3(hy3Var, (byte) 3);
                            Pattern pattern2 = ly3.P1;
                            if (qu0Var != null && tL_messages_stickerSet != null && qu0Var.getFragmentView() != null) {
                                ls6.d0(qu0Var.getCurrentAccount()).i2(qu0Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, qu0Var, null, true, true, lw3Var, true);
                            }
                            hy3Var.a(false, true);
                            break;
                        default:
                            hy3Var.f.U(null, null);
                            break;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, tre.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(-2147383649, View.MeasureSpec.makeMeasureSpec(hl.L(f2), TLObject.FLAG_30));
            f = Math.max(max, (hl.L(f3) + textView2.getMeasuredWidth()) / hl.p);
        }
        float f6 = f;
        Pattern pattern2 = ly3.P1;
        p66 p66Var = new p66(context, ly3Var.J0);
        this.a = p66Var;
        p66Var.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        p66Var.setTypeface(hl.o());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        p66Var.setEllipsize(truncateAt);
        p66Var.setSingleLine(true);
        p66Var.setLines(1);
        yob.G(p66Var, aob.J6, ly3Var.J0);
        yob.X(p66Var, aob.j5, ly3Var.J0);
        if (!z) {
            p66Var.setTextSize(1, 17.0f);
            addView(p66Var, tre.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f6, 0.0f));
            TextView textView3 = new TextView(context);
            this.b = textView3;
            textView3.setTextSize(1, 13.0f);
            yob.X(textView3, aob.q5, ly3Var.J0);
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, tre.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f6, 0.0f));
            return;
        }
        p66Var.setTextSize(1, 20.0f);
        addView(p66Var, tre.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f6, 0.0f));
        s7 s7Var = new s7(context, null, 0, aob.v0(aob.Aj, ly3Var.J0), false, ly3Var.J0);
        this.f = s7Var;
        s7Var.setLongClickEnabled(false);
        s7Var.setSubMenuOpenSide(2);
        s7Var.setIcon(R.drawable.ic_ab_other);
        int i2 = aob.Ej;
        hf0 f0 = aob.f0(aob.v0(i2, ly3Var.J0), 1, -1);
        uob M2 = yob.M(i2);
        vnb vnbVar3 = ly3Var.J0;
        s7Var.setBackground(f0);
        yob.j(s7Var, f0, null, M2, vnbVar3);
        addView(s7Var, tre.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (ly3Var.u0 / hl.p), 0.0f));
        s7Var.e(1, R.drawable.msg_share, ob6.M0(2131744503, null));
        s7Var.e(2, R.drawable.msg_link, ob6.M0(2131751727, null));
        final byte b4 = 3;
        s7Var.setOnClickListener(new View.OnClickListener(this) { // from class: fy3
            public final /* synthetic */ hy3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b4;
                hy3 hy3Var = this.b;
                switch (b32) {
                    case 0:
                        ly3 ly3Var2 = hy3Var.y;
                        ly3Var2.K1 = SystemClock.elapsedRealtime();
                        ly3Var2.I0();
                        break;
                    case 1:
                        ly3.F0(hy3Var.n, hy3Var.r, true, null, null);
                        hy3Var.a(true, true);
                        break;
                    case 2:
                        qu0 qu0Var = hy3Var.n;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = hy3Var.r;
                        lw3 lw3Var = new lw3(hy3Var, (byte) 3);
                        Pattern pattern22 = ly3.P1;
                        if (qu0Var != null && tL_messages_stickerSet != null && qu0Var.getFragmentView() != null) {
                            ls6.d0(qu0Var.getCurrentAccount()).i2(qu0Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, qu0Var, null, true, true, lw3Var, true);
                        }
                        hy3Var.a(false, true);
                        break;
                    default:
                        hy3Var.f.U(null, null);
                        break;
                }
            }
        });
        s7Var.setDelegate(new lu3(ly3Var, (byte) 2));
        s7Var.setContentDescription(ob6.M0(2131754834, null));
    }

    public final void a(boolean z, boolean z2) {
        TextView textView;
        if (this.s != z) {
            this.s = z;
            ValueAnimator valueAnimator = this.x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.x = null;
            }
            TextView textView2 = this.c;
            if (textView2 == null || (textView = this.d) == null) {
                return;
            }
            textView2.setClickable(!z);
            textView.setClickable(z);
            if (z2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, z ? 1.0f : 0.0f);
                this.x = ofFloat;
                ofFloat.addUpdateListener(new az1(this, (byte) 21));
                this.x.setInterpolator(k43.h);
                this.x.setDuration(250L);
                this.x.start();
                return;
            }
            this.w = z ? 1.0f : 0.0f;
            textView2.setScaleX(z ? 0.0f : 1.0f);
            textView2.setScaleY(z ? 0.0f : 1.0f);
            textView2.setAlpha(z ? 0.0f : 1.0f);
            textView.setScaleX(z ? 1.0f : 0.0f);
            textView.setScaleY(z ? 1.0f : 0.0f);
            textView.setAlpha(z ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(this.h ? 42.0f : 56.0f), TLObject.FLAG_30));
    }
}
