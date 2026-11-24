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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hf1 extends d {
    public gf1 a;
    public gf1 b;
    public r7 c;
    public ylb d;

    public final void Z() {
        String str;
        TLRPC.User f = z8c.h(this.currentAccount).f();
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
            TLRPC.User W1 = oc7.r1(this.currentAccount).W1(Long.valueOf(z8c.h(this.currentAccount).e()));
            if (W1 != null) {
                W1.first_name = updateprofile.first_name;
                W1.last_name = updateprofile.last_name;
            }
            z8c.h(this.currentAccount).u(true);
            nm7.f(this.currentAccount).k(nm7.j0, new Object[0]);
            nm7.f(this.currentAccount).k(2, 1);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(updateprofile, new nf2((byte) 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        ylb ylbVar = this.d;
        anb.l(this.actionBar, 3, cmb.e8, ylbVar);
        final byte b = 1;
        anb.l(this.actionBar, 1, cmb.u8, ylbVar);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(jb6.M0(2131751201, null));
        this.actionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 18));
        this.c = this.actionBar.t().h(1, R.drawable.ic_ab_done, gm.L(56.0f), jb6.M0(2131751291, null));
        TLRPC.User W1 = oc7.r1(this.currentAccount).W1(Long.valueOf(z8c.h(this.currentAccount).e()));
        if (W1 == null) {
            W1 = z8c.h(this.currentAccount).f();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new p8((byte) 22));
        final byte b2 = 0;
        gf1 gf1Var = new gf1(this, context, (byte) 0);
        this.a = gf1Var;
        gf1Var.setTextSize(1, 18.0f);
        gf1 gf1Var2 = this.a;
        int i = cmb.G6;
        anb.D(gf1Var2, i, ylbVar);
        gf1 gf1Var3 = this.a;
        int i2 = cmb.F6;
        anb.X(gf1Var3, i2, ylbVar);
        this.a.setBackgroundDrawable(null);
        gf1 gf1Var4 = this.a;
        int i3 = cmb.j6;
        int i4 = cmb.k6;
        int i5 = cmb.o7;
        anb.F(gf1Var4, i3, i4, i5, ylbVar);
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setSingleLine(true);
        this.a.setGravity(jb6.a0 ? 5 : 3);
        this.a.setInputType(49152);
        this.a.setImeOptions(5);
        this.a.setHint(jb6.M0(2131750626, null));
        anb.v(this.a, i2, ylbVar);
        this.a.setCursorSize(gm.L(20.0f));
        this.a.setCursorWidth(1.5f);
        linearLayout.addView(this.a, qoe.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: ff1
            public final /* synthetic */ hf1 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
                byte b3 = b2;
                hf1 hf1Var = this.b;
                switch (b3) {
                    case 0:
                        if (i6 == 5) {
                            hf1Var.b.requestFocus();
                            gf1 gf1Var5 = hf1Var.b;
                            gf1Var5.setSelection(gf1Var5.length());
                            break;
                        }
                        break;
                    default:
                        if (i6 == 6) {
                            hf1Var.c.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        gf1 gf1Var5 = new gf1(this, context, (byte) 1);
        this.b = gf1Var5;
        gf1Var5.setTextSize(1, 18.0f);
        anb.D(this.b, i, ylbVar);
        anb.X(this.b, i2, ylbVar);
        this.b.setBackgroundDrawable(null);
        anb.F(this.b, i3, i4, i5, ylbVar);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setSingleLine(true);
        this.b.setGravity(jb6.a0 ? 5 : 3);
        this.b.setInputType(49152);
        this.b.setImeOptions(6);
        this.b.setHint(jb6.M0(2131748789, null));
        anb.v(this.b, i2, ylbVar);
        this.b.setCursorSize(gm.L(20.0f));
        this.b.setCursorWidth(1.5f);
        linearLayout.addView(this.b, qoe.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: ff1
            public final /* synthetic */ hf1 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
                byte b3 = b;
                hf1 hf1Var = this.b;
                switch (b3) {
                    case 0:
                        if (i6 == 5) {
                            hf1Var.b.requestFocus();
                            gf1 gf1Var52 = hf1Var.b;
                            gf1Var52.setSelection(gf1Var52.length());
                            break;
                        }
                        break;
                    default:
                        if (i6 == 6) {
                            hf1Var.c.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        if (W1 != null) {
            this.a.setText(W1.first_name);
            gf1 gf1Var6 = this.a;
            gf1Var6.setSelection(gf1Var6.length());
            this.b.setText(W1.last_name);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ylb getResourceProvider() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        gf1 gf1Var = this.a;
        int i = cmb.j6;
        arrayList.add(new cnb(gf1Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        gf1 gf1Var2 = this.a;
        int i2 = cmb.k6;
        arrayList.add(new cnb(gf1Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.b, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.b, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        if (oc7.d1().getBoolean("view_animations", true)) {
            return;
        }
        this.a.requestFocus();
        gm.E3(this.a);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            gm.d3(new yt0(this, (byte) 22), 100L);
        }
    }
}
