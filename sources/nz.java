// default package

import android.app.Activity;
import android.content.Context;
import android.text.InputFilter;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nz extends bya {
    public final /* synthetic */ tz n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz(tz tzVar, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.n0 = tzVar;
    }

    @Override // bya
    public final boolean d(float f) {
        byte b = 0;
        if (getProgress() <= 0.99d && f <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        tz tzVar = this.n0;
        Context context = tzVar.getContext();
        Activity W = gm.W(context);
        d Q = LaunchActivity.Q();
        if (W != null) {
            W.getCurrentFocus();
        }
        View[] viewArr = new View[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, tzVar.J0, context);
        String M0 = jb6.M0(2131750276, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.a0(null, null, 2131750275, Integer.valueOf(tzVar.g2.d.gifts_per_round));
        pz pzVar = new pz(context, tzVar.J0, b10.d(context, R.drawable.star_small_inner));
        pzVar.setTextSize(1, 18.0f);
        anb.X(pzVar, cmb.i5, tzVar.J0);
        anb.l(pzVar, 34, cmb.Ni, tzVar.J0);
        pzVar.setHintText(jb6.M0(2131750274, null));
        pzVar.setFocusable(true);
        byte b2 = 2;
        pzVar.setInputType(2);
        pzVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        anb.F(pzVar, cmb.j6, cmb.k6, cmb.o7, tzVar.J0);
        pzVar.setImeOptions(268435462);
        pzVar.setBackgroundDrawable(null);
        pzVar.l1 = gm.L(24.0f);
        pzVar.setPadding(gm.L(24.0f), gm.L(6.0f), 0, gm.L(6.0f));
        pzVar.addTextChangedListener(new qz(tzVar, viewArr, b));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(pzVar, qoe.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.b();
        alertDialog$Builder.n(linearLayout);
        heVar.a = gm.L(300.0f);
        alertDialog$Builder.j(jb6.M0(2131750278, null), new o(tzVar, pzVar, (byte) 15));
        alertDialog$Builder.g(jb6.M0(2131752542, null), new zg((byte) 29));
        he[] heVarArr = {heVar};
        if (Q != null) {
            gm.U2(W, Q.getClassGuid());
        }
        heVarArr[0].setOnDismissListener(new ah(pzVar, Q, W, b2));
        heVarArr[0].setOnShowListener(new jh(pzVar, (byte) 1));
        heVarArr[0].show();
        View c = heVarArr[0].c(-1);
        viewArr[0] = c;
        c.setAlpha(0.6f);
        heVarArr[0].k0 = false;
        pzVar.setSelection(pzVar.getText().length());
        return true;
    }

    @Override // bya, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - gm.L(48.0f)) {
            return false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // bya
    public final void e(int i) {
        this.n0.a1(i);
    }

    @Override // bya
    public final void setValue(int i) {
        super.setValue(i);
        this.n0.a1(i);
    }
}
