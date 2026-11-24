// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class l07 extends FrameLayout {
    public final pc0 a;
    public final bf0 b;
    public final lka c;
    public final lka d;
    public TLRPC.TL_chatInviteImporter e;
    public boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public l07(Context context, final k07 k07Var, boolean z) {
        super(context);
        int i;
        float f;
        this.a = new pc0((ylb) null);
        bf0 bf0Var = new bf0(getContext());
        this.b = bf0Var;
        lka lkaVar = new lka(getContext());
        this.c = lkaVar;
        lka lkaVar2 = new lka(getContext());
        this.d = lkaVar2;
        bf0Var.setRoundRadius(gm.L(23.0f));
        addView(bf0Var, qoe.d(46, 46.0f, jb6.a0 ? 5 : 3, 12.0f, 8.0f, 12.0f, 0.0f));
        lkaVar.setGravity(jb6.a0 ? 5 : 3);
        final byte b = 1;
        lkaVar.setMaxLines(1);
        anb.W(lkaVar, cmb.F6, null);
        lkaVar.setTextSize(17);
        lkaVar.setTypeface(gm.o());
        boolean z2 = jb6.a0;
        addView(lkaVar, qoe.d(-1, -2.0f, 48, z2 ? 12.0f : 74.0f, 12.0f, z2 ? 74.0f : 12.0f, 0.0f));
        lkaVar2.setGravity(jb6.a0 ? 5 : 3);
        lkaVar2.setMaxLines(1);
        anb.W(lkaVar2, cmb.x6, null);
        lkaVar2.setTextSize(14);
        boolean z3 = jb6.a0;
        addView(lkaVar2, qoe.d(-1, -2.0f, 48, z3 ? 12.0f : 74.0f, 36.0f, z3 ? 74.0f : 12.0f, 0.0f));
        int L = gm.L(17.0f);
        TextView textView = new TextView(getContext());
        Object[] objArr = 0;
        textView.setBackground(ulb.f(cmb.Ei, 16.0f));
        textView.setGravity((jb6.a0 ? 5 : 3) | 16);
        textView.setMaxLines(1);
        textView.setPadding(L, 0, L, 0);
        textView.setText(jb6.M0(z ? 2131754375 : 2131754370, null));
        anb.X(textView, cmb.Ii, null);
        textView.setTextSize(14.0f);
        textView.setTypeface(gm.o());
        final Object[] objArr2 = objArr == true ? 1 : 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: j07
            public final /* synthetic */ l07 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = objArr2;
                k07 k07Var2 = k07Var;
                l07 l07Var = this.b;
                switch (b2) {
                    case 0:
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = l07Var.e;
                        if (tL_chatInviteImporter != null) {
                            ((x07) k07Var2).d(tL_chatInviteImporter, true);
                            break;
                        }
                        break;
                    default:
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = l07Var.e;
                        if (tL_chatInviteImporter2 != null) {
                            ((x07) k07Var2).d(tL_chatInviteImporter2, false);
                            break;
                        }
                        break;
                }
            }
        });
        boolean z4 = jb6.a0;
        if (z4) {
            i = 5;
            f = 0.0f;
        } else {
            i = 3;
            f = 73.0f;
        }
        addView(textView, qoe.d(-2, 32.0f, i, f, 62.0f, z4 ? 73.0f : 0.0f, 0.0f));
        float measureText = textView.getPaint().measureText(textView.getText().toString()) + (L << 1);
        TextView textView2 = new TextView(getContext());
        int L2 = gm.L(16.0f);
        textView2.setBackground(cmb.i0(L2, L2, L2, L2, 0, cmb.w0(null, cmb.h6, false), -16777216));
        textView2.setGravity((jb6.a0 ? 5 : 3) | 16);
        textView2.setMaxLines(1);
        textView2.setPadding(L, 0, L, 0);
        textView2.setText(jb6.M0(2131751306, null));
        anb.X(textView2, cmb.m6, null);
        textView2.setTextSize(14.0f);
        textView2.setTypeface(gm.o());
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: j07
            public final /* synthetic */ l07 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                k07 k07Var2 = k07Var;
                l07 l07Var = this.b;
                switch (b2) {
                    case 0:
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = l07Var.e;
                        if (tL_chatInviteImporter != null) {
                            ((x07) k07Var2).d(tL_chatInviteImporter, true);
                            break;
                        }
                        break;
                    default:
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = l07Var.e;
                        if (tL_chatInviteImporter2 != null) {
                            ((x07) k07Var2).d(tL_chatInviteImporter2, false);
                            break;
                        }
                        break;
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, gm.L(32.0f), jb6.a0 ? 5 : 3);
        layoutParams.topMargin = gm.L(62.0f);
        layoutParams.leftMargin = jb6.a0 ? 0 : (int) (gm.L(79.0f) + measureText);
        layoutParams.rightMargin = jb6.a0 ? (int) (measureText + gm.L(79.0f)) : 0;
        addView(textView2, layoutParams);
    }

    public bf0 getAvatarImageView() {
        return this.b;
    }

    public TLRPC.TL_chatInviteImporter getImporter() {
        return this.e;
    }

    public String getStatus() {
        return this.d.getText().toString();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f) {
            canvas.drawLine(jb6.a0 ? 0.0f : gm.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(72.0f) : 0), getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(107.0f), TLObject.FLAG_30));
    }
}
