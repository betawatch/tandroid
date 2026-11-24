// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ly6 extends FrameLayout {
    public final pb0 a;
    public final be0 b;
    public final jia c;
    public final jia d;
    public TLRPC.TL_chatInviteImporter e;
    public boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public ly6(Context context, final ky6 ky6Var, boolean z) {
        super(context);
        int i;
        float f;
        this.a = new pb0((wjb) null);
        be0 be0Var = new be0(getContext());
        this.b = be0Var;
        jia jiaVar = new jia(getContext());
        this.c = jiaVar;
        jia jiaVar2 = new jia(getContext());
        this.d = jiaVar2;
        be0Var.setRoundRadius(gl.L(23.0f));
        addView(be0Var, nme.d(46, 46.0f, k96.a0 ? 5 : 3, 12.0f, 8.0f, 12.0f, 0.0f));
        jiaVar.setGravity(k96.a0 ? 5 : 3);
        final byte b = 1;
        jiaVar.setMaxLines(1);
        zkb.W(jiaVar, bkb.F6, null);
        jiaVar.setTextSize(17);
        jiaVar.setTypeface(gl.o());
        boolean z2 = k96.a0;
        addView(jiaVar, nme.d(-1, -2.0f, 48, z2 ? 12.0f : 74.0f, 12.0f, z2 ? 74.0f : 12.0f, 0.0f));
        jiaVar2.setGravity(k96.a0 ? 5 : 3);
        jiaVar2.setMaxLines(1);
        zkb.W(jiaVar2, bkb.x6, null);
        jiaVar2.setTextSize(14);
        boolean z3 = k96.a0;
        addView(jiaVar2, nme.d(-1, -2.0f, 48, z3 ? 12.0f : 74.0f, 36.0f, z3 ? 74.0f : 12.0f, 0.0f));
        int L = gl.L(17.0f);
        TextView textView = new TextView(getContext());
        Object[] objArr = 0;
        textView.setBackground(sjb.f(bkb.Ei, 16.0f));
        textView.setGravity((k96.a0 ? 5 : 3) | 16);
        textView.setMaxLines(1);
        textView.setPadding(L, 0, L, 0);
        textView.setText(k96.M0(z ? 2131754375 : 2131754370, null));
        zkb.X(textView, bkb.Ii, null);
        textView.setTextSize(14.0f);
        textView.setTypeface(gl.o());
        final Object[] objArr2 = objArr == true ? 1 : 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: jy6
            public final /* synthetic */ ly6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = objArr2;
                ky6 ky6Var2 = ky6Var;
                ly6 ly6Var = this.b;
                switch (b2) {
                    case 0:
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = ly6Var.e;
                        if (tL_chatInviteImporter != null) {
                            ((xy6) ky6Var2).d(tL_chatInviteImporter, true);
                            break;
                        }
                        break;
                    default:
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = ly6Var.e;
                        if (tL_chatInviteImporter2 != null) {
                            ((xy6) ky6Var2).d(tL_chatInviteImporter2, false);
                            break;
                        }
                        break;
                }
            }
        });
        boolean z4 = k96.a0;
        if (z4) {
            i = 5;
            f = 0.0f;
        } else {
            i = 3;
            f = 73.0f;
        }
        addView(textView, nme.d(-2, 32.0f, i, f, 62.0f, z4 ? 73.0f : 0.0f, 0.0f));
        float measureText = textView.getPaint().measureText(textView.getText().toString()) + (L << 1);
        TextView textView2 = new TextView(getContext());
        int L2 = gl.L(16.0f);
        textView2.setBackground(bkb.i0(L2, L2, L2, L2, 0, bkb.w0(null, bkb.h6, false), -16777216));
        textView2.setGravity((k96.a0 ? 5 : 3) | 16);
        textView2.setMaxLines(1);
        textView2.setPadding(L, 0, L, 0);
        textView2.setText(k96.M0(2131751357, null));
        zkb.X(textView2, bkb.m6, null);
        textView2.setTextSize(14.0f);
        textView2.setTypeface(gl.o());
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: jy6
            public final /* synthetic */ ly6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                ky6 ky6Var2 = ky6Var;
                ly6 ly6Var = this.b;
                switch (b2) {
                    case 0:
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = ly6Var.e;
                        if (tL_chatInviteImporter != null) {
                            ((xy6) ky6Var2).d(tL_chatInviteImporter, true);
                            break;
                        }
                        break;
                    default:
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = ly6Var.e;
                        if (tL_chatInviteImporter2 != null) {
                            ((xy6) ky6Var2).d(tL_chatInviteImporter2, false);
                            break;
                        }
                        break;
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, gl.L(32.0f), k96.a0 ? 5 : 3);
        layoutParams.topMargin = gl.L(62.0f);
        layoutParams.leftMargin = k96.a0 ? 0 : (int) (gl.L(79.0f) + measureText);
        layoutParams.rightMargin = k96.a0 ? (int) (measureText + gl.L(79.0f)) : 0;
        addView(textView2, layoutParams);
    }

    public be0 getAvatarImageView() {
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
            canvas.drawLine(k96.a0 ? 0.0f : gl.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(72.0f) : 0), getMeasuredHeight() - 1, bkb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(107.0f), TLObject.FLAG_30));
    }
}
