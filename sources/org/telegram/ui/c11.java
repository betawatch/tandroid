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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c11 extends org.telegram.ui.Components.il0 {
    public final Context c;
    public final /* synthetic */ ProxyListActivity d;

    public c11(ProxyListActivity proxyListActivity, Context context) {
        this.d = proxyListActivity;
        this.c = context;
        C(true);
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10;
        int i11;
        int i12;
        int b10 = n1Var.b();
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
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        ProxyListActivity proxyListActivity = this.d;
        int size = proxyListActivity.D.size();
        lVar = ((org.telegram.ui.ActionBar.o2) proxyListActivity).actionBar;
        boolean s10 = lVar.s();
        if (size <= 0) {
            if (s10) {
                lVar2 = ((org.telegram.ui.ActionBar.o2) proxyListActivity).actionBar;
                lVar2.r();
                int i10 = proxyListActivity.r;
                r(i10, proxyListActivity.s - i10, 2);
                return;
            }
            return;
        }
        proxyListActivity.C.a(size, s10);
        if (s10) {
            return;
        }
        lVar3 = ((org.telegram.ui.ActionBar.o2) proxyListActivity).actionBar;
        lVar3.O(null, null);
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

    @Override // f2.p0
    public final int h() {
        return this.d.f;
    }

    @Override // f2.p0
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

    @Override // f2.p0
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

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        int i12;
        int i13;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.D;
        ArrayList arrayList2 = proxyListActivity.E;
        int i14 = n1Var.f;
        View view = n1Var.a;
        switch (i14) {
            case 1:
                org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) view;
                y9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
                i11 = proxyListActivity.proxyAddRow;
                if (i10 == i11) {
                    y9Var.b(LocaleController.getString(R.string.AddProxy), proxyListActivity.B != -1);
                    break;
                } else if (i10 == proxyListActivity.B) {
                    y9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.p7, false));
                    y9Var.b(LocaleController.getString(R.string.DeleteAllProxies), false);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                if (i10 == proxyListActivity.n) {
                    k4Var.setText(LocaleController.getString(R.string.ProxyConnections));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                i12 = proxyListActivity.useProxyRow;
                if (i10 == i12) {
                    q8Var.f(LocaleController.getString(R.string.UseProxySettings), proxyListActivity.d, proxyListActivity.w != -1);
                    break;
                } else {
                    i13 = proxyListActivity.callsRow;
                    if (i10 == i13) {
                        q8Var.f(LocaleController.getString(R.string.UseProxyForCalls), proxyListActivity.e, false);
                        break;
                    } else if (i10 == proxyListActivity.w) {
                        q8Var.f(LocaleController.getString(R.string.UseProxyRotation), SharedConfig.proxyRotationEnabled, true);
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (i10 == proxyListActivity.A) {
                    y8Var.setText(LocaleController.getString(R.string.UseProxyForCallsInfo));
                    break;
                } else if (i10 == proxyListActivity.y) {
                    y8Var.setText(LocaleController.getString(R.string.ProxyRotationTimeoutInfo));
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
                    org.telegram.ui.Components.lv0 lv0Var = (org.telegram.ui.Components.lv0) view;
                    ArrayList arrayList3 = new ArrayList(ProxyRotationController.ROTATION_TIMEOUTS);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        strArr[i15] = LocaleController.formatString(R.string.ProxyRotationTimeoutSeconds, arrayList3.get(i15));
                    }
                    lv0Var.setCallback(new xx0(2));
                    lv0Var.b(SharedConfig.proxyRotationTimeout, null, strArr);
                    break;
                }
                break;
        }
    }

    @Override // f2.p0
    public final void w(f2.n1 n1Var, int i10, List list) {
        int i11;
        int i12;
        boolean contains;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.D;
        int i13 = n1Var.f;
        View view = n1Var.a;
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
        if (n1Var.f != 3 || !list.contains(0)) {
            v(n1Var, i10);
            return;
        }
        org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
        i11 = proxyListActivity.useProxyRow;
        if (i10 == i11) {
            q8Var.setChecked(proxyListActivity.d);
            return;
        }
        i12 = proxyListActivity.callsRow;
        if (i10 == i12) {
            q8Var.setChecked(proxyListActivity.e);
        } else if (i10 == proxyListActivity.w) {
            q8Var.setChecked(SharedConfig.proxyRotationEnabled);
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View x6Var;
        Context context = this.c;
        if (i10 == 0) {
            x6Var = new org.telegram.ui.Cells.x6(context, (b) null);
        } else if (i10 == 1) {
            x6Var = new org.telegram.ui.Cells.y9(context);
            x6Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        } else if (i10 == 2) {
            x6Var = new org.telegram.ui.Cells.k4(context);
            x6Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        } else if (i10 == 3) {
            x6Var = new org.telegram.ui.Cells.q8(context);
            x6Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        } else if (i10 == 4) {
            x6Var = new org.telegram.ui.Cells.y8(context);
        } else if (i10 != 6) {
            x6Var = new d11(this.d, context);
            x6Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        } else {
            x6Var = new org.telegram.ui.Components.lv0(context, null);
            x6Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        }
        return th.m(x6Var, x6Var, -1, -2);
    }

    @Override // f2.p0
    public final void y(f2.n1 n1Var) {
        int i10;
        int i11;
        if (n1Var.f == 3) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) n1Var.a;
            int b10 = n1Var.b();
            ProxyListActivity proxyListActivity = this.d;
            i10 = proxyListActivity.useProxyRow;
            if (b10 == i10) {
                q8Var.setChecked(proxyListActivity.d);
                return;
            }
            i11 = proxyListActivity.callsRow;
            if (b10 == i11) {
                q8Var.setChecked(proxyListActivity.e);
            } else if (b10 == proxyListActivity.w) {
                q8Var.setChecked(SharedConfig.proxyRotationEnabled);
            }
        }
    }
}
