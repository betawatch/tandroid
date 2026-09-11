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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class d0 extends g.u {
    public final long E;
    public long F;
    public final c G;
    public final p4.x f;
    public final d h;
    public final Context n;
    public p4.r r;
    public ArrayList s;
    public c0 v;
    public RecyclerView w;
    public boolean x;
    public p4.v y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d0(Context context) {
        super(r3, r0 == 0 ? v7.d0.e(r3) : r0);
        ContextThemeWrapper a2 = v7.d0.a(context, false);
        int g10 = v7.d0.g(a2, R.attr.mediaRouteTheme);
        this.r = p4.r.c;
        this.G = new c(this, 1);
        Context context2 = getContext();
        this.f = p4.x.d(context2);
        this.h = new d(this, 2);
        this.n = context2;
        this.E = context2.getResources().getInteger(R.integer.mr_update_routes_delay_ms);
    }

    public final void e() {
        if (this.y == null && this.x) {
            this.f.getClass();
            p4.x.b();
            ArrayList arrayList = new ArrayList(p4.x.c().j);
            int size = arrayList.size();
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    break;
                }
                p4.v vVar = (p4.v) arrayList.get(i10);
                if (vVar.d() || !vVar.g || !vVar.h(this.r)) {
                    arrayList.remove(i10);
                }
                size = i10;
            }
            Collections.sort(arrayList, f.c);
            long uptimeMillis = SystemClock.uptimeMillis() - this.F;
            long j3 = this.E;
            if (uptimeMillis < j3) {
                c cVar = this.G;
                cVar.removeMessages(1);
                cVar.sendMessageAtTime(cVar.obtainMessage(1, arrayList), this.F + j3);
            } else {
                this.F = SystemClock.uptimeMillis();
                this.s.clear();
                this.s.addAll(arrayList);
                this.v.D();
            }
        }
    }

    public final void f(p4.r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.r.equals(rVar)) {
            return;
        }
        this.r = rVar;
        if (this.x) {
            p4.x xVar = this.f;
            d dVar = this.h;
            xVar.h(dVar);
            xVar.a(rVar, dVar, 1);
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

    @Override // g.u, androidx.activity.n, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_picker_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.n;
        decorView.setBackgroundColor(f0.e.c(context, v7.d0.h(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        this.s = new ArrayList();
        ((ImageButton) findViewById(R.id.mr_picker_close_button)).setOnClickListener(new x(this, 0));
        this.v = new c0(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_picker_list);
        this.w = recyclerView;
        recyclerView.setAdapter(this.v);
        this.w.setLayoutManager(new s4.c0());
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : v7.c0.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.x = false;
        this.f.h(this.h);
        this.G.removeMessages(1);
    }
}
