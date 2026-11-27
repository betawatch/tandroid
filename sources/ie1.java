// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ie1 extends e {
    public he1 a;
    public he1 b;
    public s7 c;
    public vnb d;

    public final void Y() {
        String str;
        TLRPC.User f = yac.h(this.currentAccount).f();
        if (f == null || this.b.getText() == null || this.a.getText() == null) {
            return;
        }
        String obj = this.a.getText().toString();
        String obj2 = this.b.getText().toString();
        String str2 = f.first_name;
        if (str2 == null || !str2.equals(obj) || (str = f.last_name) == null || !str.equals(obj2)) {
            TL_account.updateProfile updateprofile = new TL_account.updateProfile();
            updateprofile.flags = 3;
            updateprofile.first_name = obj;
            f.first_name = obj;
            updateprofile.last_name = obj2;
            f.last_name = obj2;
            TLRPC.User X1 = uc7.s1(this.currentAccount).X1(Long.valueOf(yac.h(this.currentAccount).e()));
            if (X1 != null) {
                X1.first_name = updateprofile.first_name;
                X1.last_name = updateprofile.last_name;
            }
            yac.h(this.currentAccount).u(true);
            jn7.f(this.currentAccount).k(jn7.j0, new Object[0]);
            jn7.f(this.currentAccount).k(2, 1);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(updateprofile, new xe2((byte) 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.s8));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        vnb vnbVar = this.d;
        yob.l(this.actionBar, 3, aob.f8, vnbVar);
        final byte b = 1;
        yob.l(this.actionBar, 1, aob.v8, vnbVar);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(ob6.M0(2131751229, null));
        this.actionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 18));
        this.c = this.actionBar.u().h(1, R.drawable.ic_ab_done, hl.L(56.0f), ob6.M0(2131751319, null));
        TLRPC.User X1 = uc7.s1(this.currentAccount).X1(Long.valueOf(yac.h(this.currentAccount).e()));
        if (X1 == null) {
            X1 = yac.h(this.currentAccount).f();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new q8((byte) 22));
        final byte b2 = 0;
        he1 he1Var = new he1(this, context, (byte) 0);
        this.a = he1Var;
        he1Var.setTextSize(1, 18.0f);
        he1 he1Var2 = this.a;
        int i = aob.H6;
        yob.D(he1Var2, i, vnbVar);
        he1 he1Var3 = this.a;
        int i2 = aob.G6;
        yob.X(he1Var3, i2, vnbVar);
        this.a.setBackgroundDrawable(null);
        he1 he1Var4 = this.a;
        int i3 = aob.k6;
        int i4 = aob.l6;
        int i5 = aob.p7;
        yob.F(he1Var4, i3, i4, i5, vnbVar);
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setSingleLine(true);
        this.a.setGravity(ob6.a0 ? 5 : 3);
        this.a.setInputType(49152);
        this.a.setImeOptions(5);
        this.a.setHint(ob6.M0(2131750654, null));
        yob.v(this.a, i2, vnbVar);
        this.a.setCursorSize(hl.L(20.0f));
        this.a.setCursorWidth(1.5f);
        linearLayout.addView(this.a, tre.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: ge1
            public final /* synthetic */ ie1 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
                byte b3 = b2;
                ie1 ie1Var = this.b;
                switch (b3) {
                    case 0:
                        if (i6 == 5) {
                            ie1Var.b.requestFocus();
                            he1 he1Var5 = ie1Var.b;
                            he1Var5.setSelection(he1Var5.length());
                            break;
                        }
                        break;
                    default:
                        if (i6 == 6) {
                            ie1Var.c.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        he1 he1Var5 = new he1(this, context, (byte) 1);
        this.b = he1Var5;
        he1Var5.setTextSize(1, 18.0f);
        yob.D(this.b, i, vnbVar);
        yob.X(this.b, i2, vnbVar);
        this.b.setBackgroundDrawable(null);
        yob.F(this.b, i3, i4, i5, vnbVar);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setSingleLine(true);
        this.b.setGravity(ob6.a0 ? 5 : 3);
        this.b.setInputType(49152);
        this.b.setImeOptions(6);
        this.b.setHint(ob6.M0(2131748786, null));
        yob.v(this.b, i2, vnbVar);
        this.b.setCursorSize(hl.L(20.0f));
        this.b.setCursorWidth(1.5f);
        linearLayout.addView(this.b, tre.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: ge1
            public final /* synthetic */ ie1 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
                byte b3 = b;
                ie1 ie1Var = this.b;
                switch (b3) {
                    case 0:
                        if (i6 == 5) {
                            ie1Var.b.requestFocus();
                            he1 he1Var52 = ie1Var.b;
                            he1Var52.setSelection(he1Var52.length());
                            break;
                        }
                        break;
                    default:
                        if (i6 == 6) {
                            ie1Var.c.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        if (X1 != null) {
            this.a.setText(X1.first_name);
            he1 he1Var6 = this.a;
            he1Var6.setSelection(he1Var6.length());
            this.b.setText(X1.last_name);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final vnb getResourceProvider() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        he1 he1Var = this.a;
        int i = aob.k6;
        arrayList.add(new apb(he1Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        he1 he1Var2 = this.a;
        int i2 = aob.l6;
        arrayList.add(new apb(he1Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.b, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.b, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        if (uc7.e1().getBoolean("view_animations", true)) {
            return;
        }
        this.a.requestFocus();
        hl.E3(this.a);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            hl.d3(new fv0(this, (byte) 22), 100L);
        }
    }
}
