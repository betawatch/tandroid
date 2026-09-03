package androidx.mediarouter.app;

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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i extends g.s {
    public LinearLayout B;
    public Button C;
    public ProgressBar D;
    public ListView E;
    public f F;
    public final h G;
    public boolean H;
    public long I;
    public final d J;
    public final c2.d0 f;
    public final e h;
    public c2.w n;
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
    public i(Context context) {
        super(r3, r1 == 0 ? j7.z.e(r3) : r1);
        int i10 = 0;
        ContextThemeWrapper a2 = j7.z.a(context, false);
        int g10 = j7.z.g(a2, R.attr.mediaRouteTheme);
        this.n = c2.w.c;
        this.J = new d(this, i10);
        this.f = c2.d0.d(getContext());
        this.h = new e(this, i10);
        this.G = new h(this, i10);
    }

    @Override // g.s, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            getContext().unregisterReceiver(this.G);
        } catch (IllegalArgumentException unused) {
        }
        super.dismiss();
    }

    public final void e(List list) {
        this.I = SystemClock.uptimeMillis();
        this.r.clear();
        this.r.addAll(list);
        this.F.notifyDataSetChanged();
        d dVar = this.J;
        dVar.removeMessages(3);
        dVar.removeMessages(2);
        if (!list.isEmpty()) {
            i(1);
        } else {
            i(0);
            dVar.sendMessageDelayed(dVar.obtainMessage(2), 5000L);
        }
    }

    public final void f() {
        if (this.H) {
            this.f.getClass();
            c2.d0.b();
            ArrayList arrayList = new ArrayList(c2.d0.c().j);
            int size = arrayList.size();
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    break;
                }
                c2.b0 b0Var = (c2.b0) arrayList.get(i10);
                if (b0Var.d() || !b0Var.g || !b0Var.h(this.n)) {
                    arrayList.remove(i10);
                }
                size = i10;
            }
            Collections.sort(arrayList, g.b);
            if (SystemClock.uptimeMillis() - this.I >= 300) {
                e(arrayList);
                return;
            }
            d dVar = this.J;
            dVar.removeMessages(1);
            dVar.sendMessageAtTime(dVar.obtainMessage(1, arrayList), this.I + 300);
        }
    }

    public final void h(c2.w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.n.equals(wVar)) {
            return;
        }
        this.n = wVar;
        if (this.H) {
            c2.d0 d0Var = this.f;
            e eVar = this.h;
            d0Var.h(eVar);
            d0Var.a(wVar, eVar, 1);
        }
        f();
    }

    public final void i(int i10) {
        if (i10 == 0) {
            setTitle(R.string.mr_chooser_title);
            this.E.setVisibility(8);
            this.v.setVisibility(0);
            this.D.setVisibility(0);
            this.B.setVisibility(8);
            this.C.setVisibility(8);
            this.y.setVisibility(8);
            this.w.setVisibility(8);
            return;
        }
        if (i10 == 1) {
            setTitle(R.string.mr_chooser_title);
            this.E.setVisibility(0);
            this.v.setVisibility(8);
            this.D.setVisibility(8);
            this.B.setVisibility(8);
            this.C.setVisibility(8);
            this.y.setVisibility(8);
            this.w.setVisibility(8);
            return;
        }
        if (i10 == 2) {
            setTitle(R.string.mr_chooser_title);
            this.E.setVisibility(8);
            this.v.setVisibility(8);
            this.D.setVisibility(0);
            this.B.setVisibility(8);
            this.C.setVisibility(8);
            this.y.setVisibility(4);
            this.w.setVisibility(0);
            return;
        }
        if (i10 != 3) {
            return;
        }
        setTitle(R.string.mr_chooser_zero_routes_found_title);
        this.E.setVisibility(8);
        this.v.setVisibility(8);
        this.D.setVisibility(8);
        this.B.setVisibility(0);
        this.C.setVisibility(0);
        this.y.setVisibility(0);
        this.w.setVisibility(0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H = true;
        this.f.a(this.n, this.h, 1);
        f();
        d dVar = this.J;
        dVar.removeMessages(2);
        dVar.removeMessages(3);
        dVar.removeMessages(1);
        dVar.sendMessageDelayed(dVar.obtainMessage(2), 5000L);
    }

    @Override // g.s, androidx.activity.n, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String string;
        boolean z4;
        super.onCreate(bundle);
        setContentView(R.layout.mr_chooser_dialog);
        this.r = new ArrayList();
        this.F = new f(getContext(), this.r);
        this.s = (TextView) findViewById(R.id.mr_chooser_title);
        this.v = (TextView) findViewById(R.id.mr_chooser_searching);
        this.w = (RelativeLayout) findViewById(R.id.mr_chooser_wifi_warning_container);
        this.x = (TextView) findViewById(R.id.mr_chooser_wifi_warning_description);
        this.y = (TextView) findViewById(R.id.mr_chooser_wifi_learn_more);
        this.B = (LinearLayout) findViewById(R.id.mr_chooser_ok_button_container);
        this.C = (Button) findViewById(R.id.mr_chooser_ok_button);
        this.D = (ProgressBar) findViewById(R.id.mr_chooser_search_progress_bar);
        Context context = getContext();
        int i10 = 0;
        if (j7.x.a == null) {
            if (!j7.x.c(context)) {
                PackageManager packageManager = context.getPackageManager();
                if (j7.x.e == null) {
                    j7.x.e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                }
                if (!j7.x.e.booleanValue() && !j7.x.a(context) && !j7.x.d(context)) {
                    z4 = true;
                    j7.x.a = Boolean.valueOf(z4);
                }
            }
            z4 = false;
            j7.x.a = Boolean.valueOf(z4);
        }
        if (!j7.x.a.booleanValue()) {
            if (j7.x.c == null) {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                j7.x.c = Boolean.valueOf((Build.VERSION.SDK_INT < 30 || sensorManager == null || sensorManager.getDefaultSensor(36) == null) ? false : true);
            }
            if (!j7.x.c.booleanValue()) {
                if (j7.x.c(context) || j7.x.b(context.getResources())) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tablet);
                } else if (j7.x.d(context)) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tv);
                } else {
                    PackageManager packageManager2 = context.getPackageManager();
                    if (j7.x.e == null) {
                        j7.x.e = Boolean.valueOf(packageManager2.hasSystemFeature("android.hardware.type.watch"));
                    }
                    string = j7.x.e.booleanValue() ? context.getString(R.string.mr_chooser_wifi_warning_description_watch) : j7.x.a(context) ? context.getString(R.string.mr_chooser_wifi_warning_description_car) : context.getString(R.string.mr_chooser_wifi_warning_description_unknown);
                }
                this.x.setText(string);
                this.y.setMovementMethod(LinkMovementMethod.getInstance());
                this.C.setOnClickListener(new c(this, i10));
                ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
                this.E = listView;
                listView.setAdapter((ListAdapter) this.F);
                this.E.setOnItemClickListener(this.F);
                this.E.setEmptyView(findViewById(android.R.id.empty));
                getWindow().setLayout(j7.y.a(getContext()), -2);
                getContext().registerReceiver(this.G, new IntentFilter("android.intent.action.SCREEN_OFF"));
            }
        }
        string = context.getString(R.string.mr_chooser_wifi_warning_description_phone);
        this.x.setText(string);
        this.y.setMovementMethod(LinkMovementMethod.getInstance());
        this.C.setOnClickListener(new c(this, i10));
        ListView listView2 = (ListView) findViewById(R.id.mr_chooser_list);
        this.E = listView2;
        listView2.setAdapter((ListAdapter) this.F);
        this.E.setOnItemClickListener(this.F);
        this.E.setEmptyView(findViewById(android.R.id.empty));
        getWindow().setLayout(j7.y.a(getContext()), -2);
        getContext().registerReceiver(this.G, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.H = false;
        this.f.h(this.h);
        d dVar = this.J;
        dVar.removeMessages(1);
        dVar.removeMessages(2);
        dVar.removeMessages(3);
        super.onDetachedFromWindow();
    }

    @Override // g.s, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.s.setText(charSequence);
    }

    @Override // g.s, android.app.Dialog
    public final void setTitle(int i10) {
        this.s.setText(i10);
    }
}
