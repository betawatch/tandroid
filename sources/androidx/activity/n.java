package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class n extends Dialog implements androidx.lifecycle.t, t4.e {
    public androidx.lifecycle.v a;
    public final o b;
    public final x c;

    public n(Context context, int i10) {
        super(context, i10);
        this.b = new o(this);
        this.c = new x(new a3.d(this, 6));
    }

    public static void a(n nVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.i.e(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        kotlin.jvm.internal.i.b(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.i.d(decorView, "window!!.decorView");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.i.b(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.i.d(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.i.b(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.i.d(decorView3, "window!!.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // t4.e
    public final m.p g() {
        return (m.p) this.b.d;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.o m() {
        androidx.lifecycle.v vVar = this.a;
        if (vVar != null) {
            return vVar;
        }
        androidx.lifecycle.v vVar2 = new androidx.lifecycle.v(this);
        this.a = vVar2;
        return vVar2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.c.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.i.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            x xVar = this.c;
            xVar.getClass();
            xVar.e = onBackInvokedDispatcher;
            xVar.c(xVar.g);
        }
        this.b.c(bundle);
        androidx.lifecycle.v vVar = this.a;
        if (vVar == null) {
            vVar = new androidx.lifecycle.v(this);
            this.a = vVar;
        }
        vVar.e(androidx.lifecycle.m.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.i.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.b.d(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        androidx.lifecycle.v vVar = this.a;
        if (vVar == null) {
            vVar = new androidx.lifecycle.v(this);
            this.a = vVar;
        }
        vVar.e(androidx.lifecycle.m.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        androidx.lifecycle.v vVar = this.a;
        if (vVar == null) {
            vVar = new androidx.lifecycle.v(this);
            this.a = vVar;
        }
        vVar.e(androidx.lifecycle.m.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        b();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        kotlin.jvm.internal.i.e(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.i.e(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
