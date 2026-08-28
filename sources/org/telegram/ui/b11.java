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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b11 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ ProxyListActivity d;

    public b11(ProxyListActivity proxyListActivity, Context context) {
        this.d = proxyListActivity;
        this.c = context;
        C(true);
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9;
        int i10;
        int i11;
        int b10 = q1Var.b();
        ProxyListActivity proxyListActivity = this.d;
        i9 = proxyListActivity.useProxyRow;
        if (b10 == i9 || b10 == proxyListActivity.w) {
            return true;
        }
        i10 = proxyListActivity.callsRow;
        if (b10 == i10) {
            return true;
        }
        i11 = proxyListActivity.proxyAddRow;
        if (b10 == i11 || b10 == proxyListActivity.B) {
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
        kVar = ((org.telegram.ui.ActionBar.o2) proxyListActivity).actionBar;
        boolean s10 = kVar.s();
        if (size <= 0) {
            if (s10) {
                kVar2 = ((org.telegram.ui.ActionBar.o2) proxyListActivity).actionBar;
                kVar2.r();
                int i9 = proxyListActivity.r;
                r(i9, proxyListActivity.s - i9, 2);
                return;
            }
            return;
        }
        proxyListActivity.C.a(size, s10);
        if (s10) {
            return;
        }
        kVar3 = ((org.telegram.ui.ActionBar.o2) proxyListActivity).actionBar;
        kVar3.N(null, null);
        int i10 = proxyListActivity.r;
        r(i10, proxyListActivity.s - i10, 2);
    }

    public final void F() {
        ProxyListActivity proxyListActivity = this.d;
        proxyListActivity.D.clear();
        int i9 = proxyListActivity.r;
        r(i9, proxyListActivity.s - i9, 1);
        E();
    }

    public final void G(int i9) {
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.D;
        int i10 = proxyListActivity.r;
        if (i9 < i10 || i9 >= proxyListActivity.s) {
            return;
        }
        SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) proxyListActivity.E.get(i9 - i10);
        if (arrayList.contains(proxyInfo)) {
            arrayList.remove(proxyInfo);
        } else {
            arrayList.add(proxyInfo);
        }
        n(i9, 1);
        E();
    }

    @Override // f2.r0
    public final int h() {
        return this.d.f;
    }

    @Override // f2.r0
    public final long i(int i9) {
        int i10;
        int i11;
        int i12;
        ProxyListActivity proxyListActivity = this.d;
        if (i9 == proxyListActivity.h) {
            return -1L;
        }
        if (i9 == proxyListActivity.v) {
            return -2L;
        }
        i10 = proxyListActivity.proxyAddRow;
        if (i9 == i10) {
            return -3L;
        }
        i11 = proxyListActivity.useProxyRow;
        if (i9 == i11) {
            return -4L;
        }
        i12 = proxyListActivity.callsRow;
        if (i9 == i12) {
            return -5L;
        }
        if (i9 == proxyListActivity.n) {
            return -6L;
        }
        if (i9 == proxyListActivity.B) {
            return -8L;
        }
        if (i9 == proxyListActivity.w) {
            return -9L;
        }
        if (i9 == proxyListActivity.x) {
            return -10L;
        }
        if (i9 == proxyListActivity.y) {
            return -11L;
        }
        if (i9 < proxyListActivity.r || i9 >= proxyListActivity.s) {
            return -7L;
        }
        return ((SharedConfig.ProxyInfo) proxyListActivity.E.get(i9 - r1)).hashCode();
    }

    @Override // f2.r0
    public final int j(int i9) {
        int i10;
        int i11;
        int i12;
        ProxyListActivity proxyListActivity = this.d;
        if (i9 == proxyListActivity.h || i9 == proxyListActivity.v) {
            return 0;
        }
        i10 = proxyListActivity.proxyAddRow;
        if (i9 == i10 || i9 == proxyListActivity.B) {
            return 1;
        }
        i11 = proxyListActivity.useProxyRow;
        if (i9 == i11 || i9 == proxyListActivity.w) {
            return 3;
        }
        i12 = proxyListActivity.callsRow;
        if (i9 == i12) {
            return 3;
        }
        if (i9 == proxyListActivity.n) {
            return 2;
        }
        if (i9 == proxyListActivity.x) {
            return 6;
        }
        return (i9 < proxyListActivity.r || i9 >= proxyListActivity.s) ? 4 : 5;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        int i11;
        int i12;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.D;
        ArrayList arrayList2 = proxyListActivity.E;
        int i13 = q1Var.f;
        View view = q1Var.a;
        switch (i13) {
            case 1:
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
                baVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
                i10 = proxyListActivity.proxyAddRow;
                if (i9 == i10) {
                    baVar.b(LocaleController.getString(R.string.AddProxy), proxyListActivity.B != -1);
                    break;
                } else if (i9 == proxyListActivity.B) {
                    baVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.p7, false));
                    baVar.b(LocaleController.getString(R.string.DeleteAllProxies), false);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i9 == proxyListActivity.n) {
                    m4Var.setText(LocaleController.getString(R.string.ProxyConnections));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                i11 = proxyListActivity.useProxyRow;
                if (i9 == i11) {
                    t8Var.f(LocaleController.getString(R.string.UseProxySettings), proxyListActivity.d, proxyListActivity.w != -1);
                    break;
                } else {
                    i12 = proxyListActivity.callsRow;
                    if (i9 == i12) {
                        t8Var.f(LocaleController.getString(R.string.UseProxyForCalls), proxyListActivity.e, false);
                        break;
                    } else if (i9 == proxyListActivity.w) {
                        t8Var.f(LocaleController.getString(R.string.UseProxyRotation), SharedConfig.proxyRotationEnabled, true);
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                if (i9 == proxyListActivity.A) {
                    b9Var.setText(LocaleController.getString(R.string.UseProxyForCallsInfo));
                    break;
                } else if (i9 == proxyListActivity.y) {
                    b9Var.setText(LocaleController.getString(R.string.ProxyRotationTimeoutInfo));
                    break;
                }
                break;
            case 5:
                c11 c11Var = (c11) view;
                SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList2.get(i9 - proxyListActivity.r);
                c11Var.setProxy(proxyInfo);
                c11Var.setChecked(SharedConfig.currentProxy == proxyInfo);
                boolean contains = arrayList.contains(arrayList2.get(i9 - proxyListActivity.r));
                c11Var.h = contains;
                c11Var.f.a(contains, false);
                c11Var.a(!arrayList.isEmpty(), false);
                break;
            case 6:
                if (i9 == proxyListActivity.x) {
                    org.telegram.ui.Components.bv0 bv0Var = (org.telegram.ui.Components.bv0) view;
                    ArrayList arrayList3 = new ArrayList(ProxyRotationController.ROTATION_TIMEOUTS);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                        strArr[i14] = LocaleController.formatString(R.string.ProxyRotationTimeoutSeconds, arrayList3.get(i14));
                    }
                    bv0Var.setCallback(new fk0(8));
                    bv0Var.b(SharedConfig.proxyRotationTimeout, null, strArr);
                    break;
                }
                break;
        }
    }

    @Override // f2.r0
    public final void w(f2.q1 q1Var, int i9, List list) {
        int i10;
        int i11;
        boolean contains;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.D;
        int i12 = q1Var.f;
        View view = q1Var.a;
        if (i12 == 5 && !list.isEmpty()) {
            c11 c11Var = (c11) view;
            if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.E.get(i9 - proxyListActivity.r))) != c11Var.h) {
                c11Var.h = contains;
                c11Var.f.a(contains, true);
            }
            if (list.contains(2)) {
                c11Var.a(!arrayList.isEmpty(), true);
                return;
            }
            return;
        }
        if (q1Var.f != 3 || !list.contains(0)) {
            v(q1Var, i9);
            return;
        }
        org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
        i10 = proxyListActivity.useProxyRow;
        if (i9 == i10) {
            t8Var.setChecked(proxyListActivity.d);
            return;
        }
        i11 = proxyListActivity.callsRow;
        if (i9 == i11) {
            t8Var.setChecked(proxyListActivity.e);
        } else if (i9 == proxyListActivity.w) {
            t8Var.setChecked(SharedConfig.proxyRotationEnabled);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View z6Var;
        Context context = this.c;
        if (i9 == 0) {
            z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
        } else if (i9 == 1) {
            z6Var = new org.telegram.ui.Cells.ba(context);
            z6Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        } else if (i9 == 2) {
            z6Var = new org.telegram.ui.Cells.m4(context);
            z6Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        } else if (i9 == 3) {
            z6Var = new org.telegram.ui.Cells.t8(context);
            z6Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        } else if (i9 == 4) {
            z6Var = new org.telegram.ui.Cells.b9(context);
        } else if (i9 != 6) {
            z6Var = new c11(this.d, context);
            z6Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        } else {
            z6Var = new org.telegram.ui.Components.bv0(context, null);
            z6Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        }
        return j3.r0.s(z6Var, z6Var, -1, -2);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        int i9;
        int i10;
        if (q1Var.f == 3) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) q1Var.a;
            int b10 = q1Var.b();
            ProxyListActivity proxyListActivity = this.d;
            i9 = proxyListActivity.useProxyRow;
            if (b10 == i9) {
                t8Var.setChecked(proxyListActivity.d);
                return;
            }
            i10 = proxyListActivity.callsRow;
            if (b10 == i10) {
                t8Var.setChecked(proxyListActivity.e);
            } else if (b10 == proxyListActivity.w) {
                t8Var.setChecked(SharedConfig.proxyRotationEnabled);
            }
        }
    }
}
