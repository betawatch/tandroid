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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class h21 extends org.telegram.ui.Components.kl0 {
    public final Context c;
    public final /* synthetic */ ProxyListActivity d;

    public h21(ProxyListActivity proxyListActivity, Context context) {
        this.d = proxyListActivity;
        this.c = context;
        C(true);
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int i11;
        int i12;
        int b10 = c1Var.b();
        ProxyListActivity proxyListActivity = this.d;
        i10 = proxyListActivity.useProxyRow;
        if (b10 == i10 || b10 == proxyListActivity.w) {
            return true;
        }
        i11 = proxyListActivity.callsRow;
        if (b10 == i11) {
            return true;
        }
        i12 = proxyListActivity.proxyAddRow;
        if (b10 == i12 || b10 == proxyListActivity.F) {
            return true;
        }
        return b10 >= proxyListActivity.r && b10 < proxyListActivity.s;
    }

    public final void E() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        ProxyListActivity proxyListActivity = this.d;
        int size = proxyListActivity.H.size();
        kVar = ((org.telegram.ui.ActionBar.n2) proxyListActivity).actionBar;
        boolean s10 = kVar.s();
        if (size <= 0) {
            if (s10) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) proxyListActivity).actionBar;
                kVar2.r();
                int i10 = proxyListActivity.r;
                r(i10, proxyListActivity.s - i10, 2);
                return;
            }
            return;
        }
        proxyListActivity.G.a(size, s10);
        if (s10) {
            return;
        }
        kVar3 = ((org.telegram.ui.ActionBar.n2) proxyListActivity).actionBar;
        kVar3.O(null, null);
        int i11 = proxyListActivity.r;
        r(i11, proxyListActivity.s - i11, 2);
    }

    public final void F() {
        ProxyListActivity proxyListActivity = this.d;
        proxyListActivity.H.clear();
        int i10 = proxyListActivity.r;
        r(i10, proxyListActivity.s - i10, 1);
        E();
    }

    public final void G(int i10) {
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.H;
        int i11 = proxyListActivity.r;
        if (i10 < i11 || i10 >= proxyListActivity.s) {
            return;
        }
        SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) proxyListActivity.I.get(i10 - i11);
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
        return this.d.f;
    }

    @Override // s4.h0
    public final long i(int i10) {
        int i11;
        int i12;
        int i13;
        ProxyListActivity proxyListActivity = this.d;
        if (i10 == proxyListActivity.h) {
            return -1L;
        }
        if (i10 == proxyListActivity.v) {
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
        i13 = proxyListActivity.callsRow;
        if (i10 == i13) {
            return -5L;
        }
        if (i10 == proxyListActivity.n) {
            return -6L;
        }
        if (i10 == proxyListActivity.F) {
            return -8L;
        }
        if (i10 == proxyListActivity.w) {
            return -9L;
        }
        if (i10 == proxyListActivity.x) {
            return -10L;
        }
        if (i10 == proxyListActivity.y) {
            return -11L;
        }
        if (i10 < proxyListActivity.r || i10 >= proxyListActivity.s) {
            return -7L;
        }
        return ((SharedConfig.ProxyInfo) proxyListActivity.I.get(i10 - r1)).hashCode();
    }

    @Override // s4.h0
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        ProxyListActivity proxyListActivity = this.d;
        if (i10 == proxyListActivity.h || i10 == proxyListActivity.v) {
            return 0;
        }
        i11 = proxyListActivity.proxyAddRow;
        if (i10 == i11 || i10 == proxyListActivity.F) {
            return 1;
        }
        i12 = proxyListActivity.useProxyRow;
        if (i10 == i12 || i10 == proxyListActivity.w) {
            return 3;
        }
        i13 = proxyListActivity.callsRow;
        if (i10 == i13) {
            return 3;
        }
        if (i10 == proxyListActivity.n) {
            return 2;
        }
        if (i10 == proxyListActivity.x) {
            return 6;
        }
        return (i10 < proxyListActivity.r || i10 >= proxyListActivity.s) ? 4 : 5;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        int i13;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.H;
        ArrayList arrayList2 = proxyListActivity.I;
        int i14 = c1Var.f;
        View view = c1Var.a;
        switch (i14) {
            case 1:
                org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
                eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                i11 = proxyListActivity.proxyAddRow;
                if (i10 == i11) {
                    eaVar.b(LocaleController.getString(R.string.AddProxy), proxyListActivity.F != -1);
                    break;
                } else if (i10 == proxyListActivity.F) {
                    eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                    eaVar.b(LocaleController.getString(R.string.DeleteAllProxies), false);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 == proxyListActivity.n) {
                    l4Var.setText(LocaleController.getString(R.string.ProxyConnections));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                i12 = proxyListActivity.useProxyRow;
                if (i10 == i12) {
                    w8Var.f(LocaleController.getString(R.string.UseProxySettings), proxyListActivity.d, proxyListActivity.w != -1);
                    break;
                } else {
                    i13 = proxyListActivity.callsRow;
                    if (i10 == i13) {
                        w8Var.f(LocaleController.getString(R.string.UseProxyForCalls), proxyListActivity.e, false);
                        break;
                    } else if (i10 == proxyListActivity.w) {
                        w8Var.f(LocaleController.getString(R.string.UseProxyRotation), SharedConfig.proxyRotationEnabled, true);
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                if (i10 == proxyListActivity.E) {
                    e9Var.setText(LocaleController.getString(R.string.UseProxyForCallsInfo));
                    break;
                } else if (i10 == proxyListActivity.y) {
                    e9Var.setText(LocaleController.getString(R.string.ProxyRotationTimeoutInfo));
                    break;
                }
                break;
            case 5:
                i21 i21Var = (i21) view;
                SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList2.get(i10 - proxyListActivity.r);
                i21Var.setProxy(proxyInfo);
                i21Var.setChecked(SharedConfig.currentProxy == proxyInfo);
                boolean contains = arrayList.contains(arrayList2.get(i10 - proxyListActivity.r));
                i21Var.h = contains;
                i21Var.f.a(contains, false);
                i21Var.a(!arrayList.isEmpty(), false);
                break;
            case 6:
                if (i10 == proxyListActivity.x) {
                    org.telegram.ui.Components.sv0 sv0Var = (org.telegram.ui.Components.sv0) view;
                    ArrayList arrayList3 = new ArrayList(ProxyRotationController.ROTATION_TIMEOUTS);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        strArr[i15] = LocaleController.formatString(R.string.ProxyRotationTimeoutSeconds, arrayList3.get(i15));
                    }
                    sv0Var.setCallback(new sw0(3));
                    sv0Var.b(SharedConfig.proxyRotationTimeout, null, strArr);
                    break;
                }
                break;
        }
    }

    @Override // s4.h0
    public final void w(s4.c1 c1Var, int i10, List list) {
        int i11;
        int i12;
        boolean contains;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.H;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 == 5 && !list.isEmpty()) {
            i21 i21Var = (i21) view;
            if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.I.get(i10 - proxyListActivity.r))) != i21Var.h) {
                i21Var.h = contains;
                i21Var.f.a(contains, true);
            }
            if (list.contains(2)) {
                i21Var.a(!arrayList.isEmpty(), true);
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
            return;
        }
        i12 = proxyListActivity.callsRow;
        if (i10 == i12) {
            w8Var.setChecked(proxyListActivity.e);
        } else if (i10 == proxyListActivity.w) {
            w8Var.setChecked(SharedConfig.proxyRotationEnabled);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View a7Var;
        Context context = this.c;
        if (i10 == 0) {
            a7Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
        } else if (i10 == 1) {
            a7Var = new org.telegram.ui.Cells.ea(context);
            a7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        } else if (i10 == 2) {
            a7Var = new org.telegram.ui.Cells.l4(context);
            a7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        } else if (i10 == 3) {
            a7Var = new org.telegram.ui.Cells.w8(context);
            a7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        } else if (i10 == 4) {
            a7Var = new org.telegram.ui.Cells.e9(context);
        } else if (i10 != 6) {
            a7Var = new i21(this.d, context);
            a7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        } else {
            a7Var = new org.telegram.ui.Components.sv0(context, null);
            a7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        }
        return com.google.android.gms.internal.vision.e2.l(a7Var, a7Var, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        int i10;
        int i11;
        if (c1Var.f == 3) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) c1Var.a;
            int b10 = c1Var.b();
            ProxyListActivity proxyListActivity = this.d;
            i10 = proxyListActivity.useProxyRow;
            if (b10 == i10) {
                w8Var.setChecked(proxyListActivity.d);
                return;
            }
            i11 = proxyListActivity.callsRow;
            if (b10 == i11) {
                w8Var.setChecked(proxyListActivity.e);
            } else if (b10 == proxyListActivity.w) {
                w8Var.setChecked(SharedConfig.proxyRotationEnabled);
            }
        }
    }
}
