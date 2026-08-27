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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class c11 extends org.telegram.ui.Components.yk0 {
    public final Context c;
    public final /* synthetic */ ProxyListActivity d;

    public c11(ProxyListActivity proxyListActivity, Context context) {
        this.d = proxyListActivity;
        this.c = context;
        C(true);
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int i10;
        int i11;
        int i12;
        int b10 = o1Var.b();
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
        if (b10 == i12 || b10 == proxyListActivity.B) {
            return true;
        }
        return b10 >= proxyListActivity.r && b10 < proxyListActivity.s;
    }

    public final void E() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        ProxyListActivity proxyListActivity = this.d;
        int size = proxyListActivity.D.size();
        kVar = ((org.telegram.ui.ActionBar.n2) proxyListActivity).actionBar;
        boolean t10 = kVar.t();
        if (size <= 0) {
            if (t10) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) proxyListActivity).actionBar;
                kVar2.s();
                int i10 = proxyListActivity.r;
                r(i10, proxyListActivity.s - i10, 2);
                return;
            }
            return;
        }
        proxyListActivity.C.a(size, t10);
        if (t10) {
            return;
        }
        kVar3 = ((org.telegram.ui.ActionBar.n2) proxyListActivity).actionBar;
        kVar3.O(null, null);
        int i11 = proxyListActivity.r;
        r(i11, proxyListActivity.s - i11, 2);
    }

    public final void F() {
        ProxyListActivity proxyListActivity = this.d;
        proxyListActivity.D.clear();
        int i10 = proxyListActivity.r;
        r(i10, proxyListActivity.s - i10, 1);
        E();
    }

    public final void G(int i10) {
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.D;
        int i11 = proxyListActivity.r;
        if (i10 < i11 || i10 >= proxyListActivity.s) {
            return;
        }
        SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) proxyListActivity.E.get(i10 - i11);
        if (arrayList.contains(proxyInfo)) {
            arrayList.remove(proxyInfo);
        } else {
            arrayList.add(proxyInfo);
        }
        n(i10, 1);
        E();
    }

    @Override // f2.q0
    public final int h() {
        return this.d.f;
    }

    @Override // f2.q0
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
        if (i10 == proxyListActivity.B) {
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
        return ((SharedConfig.ProxyInfo) proxyListActivity.E.get(i10 - r1)).hashCode();
    }

    @Override // f2.q0
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        ProxyListActivity proxyListActivity = this.d;
        if (i10 == proxyListActivity.h || i10 == proxyListActivity.v) {
            return 0;
        }
        i11 = proxyListActivity.proxyAddRow;
        if (i10 == i11 || i10 == proxyListActivity.B) {
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

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        int i12;
        int i13;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.D;
        ArrayList arrayList2 = proxyListActivity.E;
        int i14 = o1Var.f;
        View view = o1Var.a;
        switch (i14) {
            case 1:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                x9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
                i11 = proxyListActivity.proxyAddRow;
                if (i10 == i11) {
                    x9Var.b(LocaleController.getString(R.string.AddProxy), proxyListActivity.B != -1);
                    break;
                } else if (i10 == proxyListActivity.B) {
                    x9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.p7, false));
                    x9Var.b(LocaleController.getString(R.string.DeleteAllProxies), false);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                if (i10 == proxyListActivity.n) {
                    j4Var.setText(LocaleController.getString(R.string.ProxyConnections));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                i12 = proxyListActivity.useProxyRow;
                if (i10 == i12) {
                    p8Var.f(LocaleController.getString(R.string.UseProxySettings), proxyListActivity.d, proxyListActivity.w != -1);
                    break;
                } else {
                    i13 = proxyListActivity.callsRow;
                    if (i10 == i13) {
                        p8Var.f(LocaleController.getString(R.string.UseProxyForCalls), proxyListActivity.e, false);
                        break;
                    } else if (i10 == proxyListActivity.w) {
                        p8Var.f(LocaleController.getString(R.string.UseProxyRotation), SharedConfig.proxyRotationEnabled, true);
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                if (i10 == proxyListActivity.A) {
                    x8Var.setText(LocaleController.getString(R.string.UseProxyForCallsInfo));
                    break;
                } else if (i10 == proxyListActivity.y) {
                    x8Var.setText(LocaleController.getString(R.string.ProxyRotationTimeoutInfo));
                    break;
                }
                break;
            case 5:
                d11 d11Var = (d11) view;
                SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList2.get(i10 - proxyListActivity.r);
                d11Var.setProxy(proxyInfo);
                d11Var.setChecked(SharedConfig.currentProxy == proxyInfo);
                boolean contains = arrayList.contains(arrayList2.get(i10 - proxyListActivity.r));
                d11Var.h = contains;
                d11Var.f.a(contains, false);
                d11Var.a(!arrayList.isEmpty(), false);
                break;
            case 6:
                if (i10 == proxyListActivity.x) {
                    org.telegram.ui.Components.dv0 dv0Var = (org.telegram.ui.Components.dv0) view;
                    ArrayList arrayList3 = new ArrayList(ProxyRotationController.ROTATION_TIMEOUTS);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        strArr[i15] = LocaleController.formatString(R.string.ProxyRotationTimeoutSeconds, arrayList3.get(i15));
                    }
                    dv0Var.setCallback(new j70(13));
                    dv0Var.b(SharedConfig.proxyRotationTimeout, null, strArr);
                    break;
                }
                break;
        }
    }

    @Override // f2.q0
    public final void w(f2.o1 o1Var, int i10, List list) {
        int i11;
        int i12;
        boolean contains;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.D;
        int i13 = o1Var.f;
        View view = o1Var.a;
        if (i13 == 5 && !list.isEmpty()) {
            d11 d11Var = (d11) view;
            if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.E.get(i10 - proxyListActivity.r))) != d11Var.h) {
                d11Var.h = contains;
                d11Var.f.a(contains, true);
            }
            if (list.contains(2)) {
                d11Var.a(!arrayList.isEmpty(), true);
                return;
            }
            return;
        }
        if (o1Var.f != 3 || !list.contains(0)) {
            v(o1Var, i10);
            return;
        }
        org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
        i11 = proxyListActivity.useProxyRow;
        if (i10 == i11) {
            p8Var.setChecked(proxyListActivity.d);
            return;
        }
        i12 = proxyListActivity.callsRow;
        if (i10 == i12) {
            p8Var.setChecked(proxyListActivity.e);
        } else if (i10 == proxyListActivity.w) {
            p8Var.setChecked(SharedConfig.proxyRotationEnabled);
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View w6Var;
        Context context = this.c;
        if (i10 == 0) {
            w6Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
        } else if (i10 == 1) {
            w6Var = new org.telegram.ui.Cells.x9(context);
            w6Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        } else if (i10 == 2) {
            w6Var = new org.telegram.ui.Cells.j4(context);
            w6Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        } else if (i10 == 3) {
            w6Var = new org.telegram.ui.Cells.p8(context);
            w6Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        } else if (i10 == 4) {
            w6Var = new org.telegram.ui.Cells.x8(context);
        } else if (i10 != 6) {
            w6Var = new d11(this.d, context);
            w6Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        } else {
            w6Var = new org.telegram.ui.Components.dv0(context, null);
            w6Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        }
        return org.telegram.ui.Cells.pa.l(w6Var, w6Var, -1, -2);
    }

    @Override // f2.q0
    public final void y(f2.o1 o1Var) {
        int i10;
        int i11;
        if (o1Var.f == 3) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) o1Var.a;
            int b10 = o1Var.b();
            ProxyListActivity proxyListActivity = this.d;
            i10 = proxyListActivity.useProxyRow;
            if (b10 == i10) {
                p8Var.setChecked(proxyListActivity.d);
                return;
            }
            i11 = proxyListActivity.callsRow;
            if (b10 == i11) {
                p8Var.setChecked(proxyListActivity.e);
            } else if (b10 == proxyListActivity.w) {
                p8Var.setChecked(SharedConfig.proxyRotationEnabled);
            }
        }
    }
}
