package androidx.mediarouter.app;

import ag.w0;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g extends g.t {
    public LinearLayout A;
    public Button B;
    public ProgressBar C;
    public ListView D;
    public d E;
    public final f F;
    public boolean G;
    public long H;
    public final c I;
    public final c2.b0 f;
    public final h0 h;
    public c2.u n;
    public ArrayList r;
    public TextView s;
    public TextView v;
    public RelativeLayout w;
    public TextView x;
    public TextView y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(Context context) {
        super(r2, r0 == 0 ? g7.b0.e(r2) : r0);
        ContextThemeWrapper a2 = g7.b0.a(context, false);
        int g10 = g7.b0.g(a2, R.attr.mediaRouteTheme);
        this.n = c2.u.c;
        this.I = new c(this, 0);
        this.f = c2.b0.d(getContext());
        this.h = new h0(this, 1);
        this.F = new f(this, 0);
    }

    @Override // g.t, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            getContext().unregisterReceiver(this.F);
        } catch (IllegalArgumentException unused) {
        }
        super.dismiss();
    }

    public final void e(List list) {
        this.H = SystemClock.uptimeMillis();
        this.r.clear();
        this.r.addAll(list);
        this.E.notifyDataSetChanged();
        c cVar = this.I;
        cVar.removeMessages(3);
        cVar.removeMessages(2);
        if (!list.isEmpty()) {
            i(1);
        } else {
            i(0);
            cVar.sendMessageDelayed(cVar.obtainMessage(2), 5000L);
        }
    }

    public final void f() {
        if (this.G) {
            this.f.getClass();
            c2.b0.b();
            ArrayList arrayList = new ArrayList(c2.b0.c().j);
            int size = arrayList.size();
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    break;
                }
                c2.z zVar = (c2.z) arrayList.get(i10);
                if (zVar.d() || !zVar.g || !zVar.h(this.n)) {
                    arrayList.remove(i10);
                }
                size = i10;
            }
            Collections.sort(arrayList, e.b);
            if (SystemClock.uptimeMillis() - this.H >= 300) {
                e(arrayList);
                return;
            }
            c cVar = this.I;
            cVar.removeMessages(1);
            cVar.sendMessageAtTime(cVar.obtainMessage(1, arrayList), this.H + 300);
        }
    }

    public final void h(c2.u uVar) {
        if (uVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.n.equals(uVar)) {
            return;
        }
        this.n = uVar;
        if (this.G) {
            c2.b0 b0Var = this.f;
            h0 h0Var = this.h;
            b0Var.h(h0Var);
            b0Var.a(uVar, h0Var, 1);
        }
        f();
    }

    public final void i(int i10) {
        if (i10 == 0) {
            setTitle(R.string.mr_chooser_title);
            this.D.setVisibility(8);
            this.v.setVisibility(0);
            this.C.setVisibility(0);
            this.A.setVisibility(8);
            this.B.setVisibility(8);
            this.y.setVisibility(8);
            this.w.setVisibility(8);
            return;
        }
        if (i10 == 1) {
            setTitle(R.string.mr_chooser_title);
            this.D.setVisibility(0);
            this.v.setVisibility(8);
            this.C.setVisibility(8);
            this.A.setVisibility(8);
            this.B.setVisibility(8);
            this.y.setVisibility(8);
            this.w.setVisibility(8);
            return;
        }
        if (i10 == 2) {
            setTitle(R.string.mr_chooser_title);
            this.D.setVisibility(8);
            this.v.setVisibility(8);
            this.C.setVisibility(0);
            this.A.setVisibility(8);
            this.B.setVisibility(8);
            this.y.setVisibility(4);
            this.w.setVisibility(0);
            return;
        }
        if (i10 != 3) {
            return;
        }
        setTitle(R.string.mr_chooser_zero_routes_found_title);
        this.D.setVisibility(8);
        this.v.setVisibility(8);
        this.C.setVisibility(8);
        this.A.setVisibility(0);
        this.B.setVisibility(0);
        this.y.setVisibility(0);
        this.w.setVisibility(0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = true;
        this.f.a(this.n, this.h, 1);
        f();
        c cVar = this.I;
        cVar.removeMessages(2);
        cVar.removeMessages(3);
        cVar.removeMessages(1);
        cVar.sendMessageDelayed(cVar.obtainMessage(2), 5000L);
    }

    @Override // g.t, androidx.activity.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String string;
        boolean z10;
        super.onCreate(bundle);
        setContentView(R.layout.mr_chooser_dialog);
        this.r = new ArrayList();
        this.E = new d(getContext(), this.r);
        this.s = (TextView) findViewById(R.id.mr_chooser_title);
        this.v = (TextView) findViewById(R.id.mr_chooser_searching);
        this.w = (RelativeLayout) findViewById(R.id.mr_chooser_wifi_warning_container);
        this.x = (TextView) findViewById(R.id.mr_chooser_wifi_warning_description);
        this.y = (TextView) findViewById(R.id.mr_chooser_wifi_learn_more);
        this.A = (LinearLayout) findViewById(R.id.mr_chooser_ok_button_container);
        this.B = (Button) findViewById(R.id.mr_chooser_ok_button);
        this.C = (ProgressBar) findViewById(R.id.mr_chooser_search_progress_bar);
        Context context = getContext();
        boolean z11 = false;
        if (g7.z.a == null) {
            if (!g7.z.c(context)) {
                PackageManager packageManager = context.getPackageManager();
                if (g7.z.e == null) {
                    g7.z.e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                }
                if (!g7.z.e.booleanValue() && !g7.z.a(context) && !g7.z.d(context)) {
                    z10 = true;
                    g7.z.a = Boolean.valueOf(z10);
                }
            }
            z10 = false;
            g7.z.a = Boolean.valueOf(z10);
        }
        if (!g7.z.a.booleanValue()) {
            if (g7.z.c == null) {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (Build.VERSION.SDK_INT >= 30 && sensorManager != null && sensorManager.getDefaultSensor(36) != null) {
                    z11 = true;
                }
                g7.z.c = Boolean.valueOf(z11);
            }
            if (!g7.z.c.booleanValue()) {
                if (g7.z.c(context) || g7.z.b(context.getResources())) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tablet);
                } else if (g7.z.d(context)) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tv);
                } else {
                    PackageManager packageManager2 = context.getPackageManager();
                    if (g7.z.e == null) {
                        g7.z.e = Boolean.valueOf(packageManager2.hasSystemFeature("android.hardware.type.watch"));
                    }
                    string = g7.z.e.booleanValue() ? context.getString(R.string.mr_chooser_wifi_warning_description_watch) : g7.z.a(context) ? context.getString(R.string.mr_chooser_wifi_warning_description_car) : context.getString(R.string.mr_chooser_wifi_warning_description_unknown);
                }
                this.x.setText(string);
                this.y.setMovementMethod(LinkMovementMethod.getInstance());
                this.B.setOnClickListener(new w0(this, 2));
                ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
                this.D = listView;
                listView.setAdapter((ListAdapter) this.E);
                this.D.setOnItemClickListener(this.E);
                this.D.setEmptyView(findViewById(android.R.id.empty));
                getWindow().setLayout(g7.a0.a(getContext()), -2);
                getContext().registerReceiver(this.F, new IntentFilter("android.intent.action.SCREEN_OFF"));
            }
        }
        string = context.getString(R.string.mr_chooser_wifi_warning_description_phone);
        this.x.setText(string);
        this.y.setMovementMethod(LinkMovementMethod.getInstance());
        this.B.setOnClickListener(new w0(this, 2));
        ListView listView2 = (ListView) findViewById(R.id.mr_chooser_list);
        this.D = listView2;
        listView2.setAdapter((ListAdapter) this.E);
        this.D.setOnItemClickListener(this.E);
        this.D.setEmptyView(findViewById(android.R.id.empty));
        getWindow().setLayout(g7.a0.a(getContext()), -2);
        getContext().registerReceiver(this.F, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.G = false;
        this.f.h(this.h);
        c cVar = this.I;
        cVar.removeMessages(1);
        cVar.removeMessages(2);
        cVar.removeMessages(3);
        super.onDetachedFromWindow();
    }

    @Override // g.t, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.s.setText(charSequence);
    }

    @Override // g.t, android.app.Dialog
    public final void setTitle(int i10) {
        this.s.setText(i10);
    }
}
