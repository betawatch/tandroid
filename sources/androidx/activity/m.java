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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class m extends Dialog implements androidx.lifecycle.t, g2.f {
    public androidx.lifecycle.v a;
    public final n b;
    public final w c;

    public m(Context context, int i10) {
        super(context, i10);
        this.b = new n(this);
        this.c = new w(new a4.g(this, 8));
    }

    public static void a(m mVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.j.e(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        kotlin.jvm.internal.j.b(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window!!.decorView");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.j.b(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.j.d(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.j.b(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.j.d(decorView3, "window!!.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // g2.f
    public final g2.e g() {
        return (g2.e) this.b.c;
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
            kotlin.jvm.internal.j.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            w wVar = this.c;
            wVar.getClass();
            wVar.e = onBackInvokedDispatcher;
            wVar.c(wVar.g);
        }
        this.b.b(bundle);
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
        kotlin.jvm.internal.j.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.b.c(onSaveInstanceState);
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
        kotlin.jvm.internal.j.e(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.j.e(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
