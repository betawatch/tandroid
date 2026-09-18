package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ProxyRotationController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class e21 extends org.telegram.ui.Components.vl0 {
    public final Context c;
    public final /* synthetic */ ProxyListActivity d;

    public e21(ProxyListActivity proxyListActivity, Context context) {
        this.d = proxyListActivity;
        this.c = context;
        C(true);
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int i11;
        int b10 = c1Var.b();
        ProxyListActivity proxyListActivity = this.d;
        i10 = proxyListActivity.useProxyRow;
        if (b10 == i10 || b10 == proxyListActivity.v) {
            return true;
        }
        i11 = proxyListActivity.proxyAddRow;
        if (b10 == i11 || b10 == proxyListActivity.y) {
            return true;
        }
        return b10 >= proxyListActivity.n && b10 < proxyListActivity.r;
    }

    public final void E() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        ProxyListActivity proxyListActivity = this.d;
        int size = proxyListActivity.F.size();
        kVar = ((org.telegram.ui.ActionBar.n2) proxyListActivity).actionBar;
        boolean s10 = kVar.s();
        if (size <= 0) {
            if (s10) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) proxyListActivity).actionBar;
                kVar2.r();
                int i10 = proxyListActivity.n;
                r(i10, proxyListActivity.r - i10, 2);
                return;
            }
            return;
        }
        proxyListActivity.E.a(size, s10);
        if (s10) {
            return;
        }
        kVar3 = ((org.telegram.ui.ActionBar.n2) proxyListActivity).actionBar;
        kVar3.O(null, null);
        int i11 = proxyListActivity.n;
        r(i11, proxyListActivity.r - i11, 2);
    }

    public final void F() {
        ProxyListActivity proxyListActivity = this.d;
        proxyListActivity.F.clear();
        int i10 = proxyListActivity.n;
        r(i10, proxyListActivity.r - i10, 1);
        E();
    }

    public final void G(int i10) {
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.F;
        int i11 = proxyListActivity.n;
        if (i10 < i11 || i10 >= proxyListActivity.r) {
            return;
        }
        SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) proxyListActivity.G.get(i10 - i11);
        if (arrayList.contains(proxyInfo)) {
            arrayList.remove(proxyInfo);
        } else {
            arrayList.add(proxyInfo);
        }
        n(i10, 1);
        E();
    }

    @Override // s4.h0
    public final int h() {
        return this.d.e;
    }

    @Override // s4.h0
    public final long i(int i10) {
        int i11;
        int i12;
        ProxyListActivity proxyListActivity = this.d;
        if (i10 == proxyListActivity.f) {
            return -1L;
        }
        if (i10 == proxyListActivity.s) {
            return -2L;
        }
        i11 = proxyListActivity.proxyAddRow;
        if (i10 == i11) {
            return -3L;
        }
        i12 = proxyListActivity.useProxyRow;
        if (i10 == i12) {
            return -4L;
        }
        if (i10 == proxyListActivity.h) {
            return -6L;
        }
        if (i10 == proxyListActivity.y) {
            return -8L;
        }
        if (i10 == proxyListActivity.v) {
            return -9L;
        }
        if (i10 == proxyListActivity.w) {
            return -10L;
        }
        if (i10 == proxyListActivity.x) {
            return -11L;
        }
        if (i10 < proxyListActivity.n || i10 >= proxyListActivity.r) {
            return -7L;
        }
        return ((SharedConfig.ProxyInfo) proxyListActivity.G.get(i10 - r1)).hashCode();
    }

    @Override // s4.h0
    public final int j(int i10) {
        int i11;
        int i12;
        ProxyListActivity proxyListActivity = this.d;
        if (i10 == proxyListActivity.f || i10 == proxyListActivity.s) {
            return 0;
        }
        i11 = proxyListActivity.proxyAddRow;
        if (i10 == i11 || i10 == proxyListActivity.y) {
            return 1;
        }
        i12 = proxyListActivity.useProxyRow;
        if (i10 == i12 || i10 == proxyListActivity.v) {
            return 3;
        }
        if (i10 == proxyListActivity.h) {
            return 2;
        }
        if (i10 == proxyListActivity.w) {
            return 6;
        }
        return (i10 < proxyListActivity.n || i10 >= proxyListActivity.r) ? 4 : 5;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.F;
        ArrayList arrayList2 = proxyListActivity.G;
        int i13 = c1Var.f;
        View view = c1Var.a;
        switch (i13) {
            case 1:
                org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
                eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                i11 = proxyListActivity.proxyAddRow;
                if (i10 == i11) {
                    eaVar.b(LocaleController.getString(R.string.AddProxy), proxyListActivity.y != -1);
                    break;
                } else if (i10 == proxyListActivity.y) {
                    eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                    eaVar.b(LocaleController.getString(R.string.DeleteAllProxies), false);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == proxyListActivity.h) {
                    m4Var.setText(LocaleController.getString(R.string.ProxyConnections));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                i12 = proxyListActivity.useProxyRow;
                if (i10 == i12) {
                    w8Var.f(LocaleController.getString(R.string.UseProxySettings), proxyListActivity.d, proxyListActivity.v != -1);
                    break;
                } else if (i10 == proxyListActivity.v) {
                    w8Var.f(LocaleController.getString(R.string.UseProxyRotation), SharedConfig.proxyRotationEnabled, true);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                if (i10 == proxyListActivity.x) {
                    e9Var.setText(LocaleController.getString(R.string.ProxyRotationTimeoutInfo));
                    break;
                }
                break;
            case 5:
                f21 f21Var = (f21) view;
                SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList2.get(i10 - proxyListActivity.n);
                f21Var.setProxy(proxyInfo);
                f21Var.setChecked(SharedConfig.currentProxy == proxyInfo);
                boolean contains = arrayList.contains(arrayList2.get(i10 - proxyListActivity.n));
                f21Var.h = contains;
                f21Var.f.a(contains, false);
                f21Var.a(!arrayList.isEmpty(), false);
                break;
            case 6:
                if (i10 == proxyListActivity.w) {
                    org.telegram.ui.Components.fw0 fw0Var = (org.telegram.ui.Components.fw0) view;
                    ArrayList arrayList3 = new ArrayList(ProxyRotationController.ROTATION_TIMEOUTS);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                        strArr[i14] = LocaleController.formatString(R.string.ProxyRotationTimeoutSeconds, arrayList3.get(i14));
                    }
                    fw0Var.setCallback(new wk0(8));
                    fw0Var.b(SharedConfig.proxyRotationTimeout, null, strArr);
                    break;
                }
                break;
        }
    }

    @Override // s4.h0
    public final void w(s4.c1 c1Var, int i10, List list) {
        int i11;
        boolean contains;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.F;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 5 && !list.isEmpty()) {
            f21 f21Var = (f21) view;
            if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.G.get(i10 - proxyListActivity.n))) != f21Var.h) {
                f21Var.h = contains;
                f21Var.f.a(contains, true);
            }
            if (list.contains(2)) {
                f21Var.a(!arrayList.isEmpty(), true);
                return;
            }
            return;
        }
        if (c1Var.f != 3 || !list.contains(0)) {
            v(c1Var, i10);
            return;
        }
        org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
        i11 = proxyListActivity.useProxyRow;
        if (i10 == i11) {
            w8Var.setChecked(proxyListActivity.d);
        } else if (i10 == proxyListActivity.v) {
            w8Var.setChecked(SharedConfig.proxyRotationEnabled);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View b7Var;
        Context context = this.c;
        if (i10 == 0) {
            b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
        } else if (i10 == 1) {
            b7Var = new org.telegram.ui.Cells.ea(context);
            b7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        } else if (i10 == 2) {
            b7Var = new org.telegram.ui.Cells.m4(context);
            b7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        } else if (i10 == 3) {
            b7Var = new org.telegram.ui.Cells.w8(context);
            b7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        } else if (i10 == 4) {
            b7Var = new org.telegram.ui.Cells.e9(context);
        } else if (i10 != 6) {
            b7Var = new f21(this.d, context);
            b7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        } else {
            b7Var = new org.telegram.ui.Components.fw0(context, null);
            b7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        }
        return com.google.android.gms.internal.vision.e2.k(b7Var, b7Var, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        int i10;
        if (c1Var.f == 3) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) c1Var.a;
            int b10 = c1Var.b();
            ProxyListActivity proxyListActivity = this.d;
            i10 = proxyListActivity.useProxyRow;
            if (b10 == i10) {
                w8Var.setChecked(proxyListActivity.d);
            } else if (b10 == proxyListActivity.v) {
                w8Var.setChecked(SharedConfig.proxyRotationEnabled);
            }
        }
    }
}
