package androidx.mediarouter.app;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class e0 extends g.s {
    public final long B;
    public long C;
    public final d D;
    public final c2.c0 f;
    public final e h;
    public final Context n;
    public c2.v r;
    public ArrayList s;
    public d0 v;
    public RecyclerView w;
    public boolean x;
    public c2.a0 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e0(Context context) {
        super(r3, r0 == 0 ? j7.a0.e(r3) : r0);
        ContextThemeWrapper a2 = j7.a0.a(context, false);
        int g10 = j7.a0.g(a2, R.attr.mediaRouteTheme);
        this.r = c2.v.c;
        this.D = new d(this, 1);
        Context context2 = getContext();
        this.f = c2.c0.d(context2);
        this.h = new e(this, 2);
        this.n = context2;
        this.B = context2.getResources().getInteger(R.integer.mr_update_routes_delay_ms);
    }

    public final void e() {
        if (this.y == null && this.x) {
            this.f.getClass();
            c2.c0.b();
            ArrayList arrayList = new ArrayList(c2.c0.c().j);
            int size = arrayList.size();
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    break;
                }
                c2.a0 a0Var = (c2.a0) arrayList.get(i10);
                if (a0Var.d() || !a0Var.g || !a0Var.h(this.r)) {
                    arrayList.remove(i10);
                }
                size = i10;
            }
            Collections.sort(arrayList, g.c);
            long uptimeMillis = SystemClock.uptimeMillis() - this.C;
            long j10 = this.B;
            if (uptimeMillis < j10) {
                d dVar = this.D;
                dVar.removeMessages(1);
                dVar.sendMessageAtTime(dVar.obtainMessage(1, arrayList), this.C + j10);
            } else {
                this.C = SystemClock.uptimeMillis();
                this.s.clear();
                this.s.addAll(arrayList);
                this.v.D();
            }
        }
    }

    public final void f(c2.v vVar) {
        if (vVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.r.equals(vVar)) {
            return;
        }
        this.r = vVar;
        if (this.x) {
            c2.c0 c0Var = this.f;
            e eVar = this.h;
            c0Var.h(eVar);
            c0Var.a(vVar, eVar, 1);
        }
        e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x = true;
        this.f.a(this.r, this.h, 1);
        e();
    }

    @Override // g.s, androidx.activity.n, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_picker_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.n;
        decorView.setBackgroundColor(f0.e.c(context, j7.a0.h(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        this.s = new ArrayList();
        ((ImageButton) findViewById(R.id.mr_picker_close_button)).setOnClickListener(new y(this, 0));
        this.v = new d0(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_picker_list);
        this.w = recyclerView;
        recyclerView.setAdapter(this.v);
        this.w.setLayoutManager(new f2.j0());
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : j7.z.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.x = false;
        this.f.h(this.h);
        this.D.removeMessages(1);
    }
}
