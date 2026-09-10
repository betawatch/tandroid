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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class l21 extends org.telegram.ui.Components.ul0 {
    public final Context c;
    public final /* synthetic */ ProxyListActivity d;

    public l21(ProxyListActivity proxyListActivity, Context context) {
        this.d = proxyListActivity;
        this.c = context;
        C(true);
    }

    @Override // org.telegram.ui.Components.ul0
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
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        ProxyListActivity proxyListActivity = this.d;
        int size = proxyListActivity.H.size();
        lVar = ((org.telegram.ui.ActionBar.p2) proxyListActivity).actionBar;
        boolean s10 = lVar.s();
        if (size <= 0) {
            if (s10) {
                lVar2 = ((org.telegram.ui.ActionBar.p2) proxyListActivity).actionBar;
                lVar2.r();
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
        lVar3 = ((org.telegram.ui.ActionBar.p2) proxyListActivity).actionBar;
        lVar3.O(null, null);
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
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
                gaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                i11 = proxyListActivity.proxyAddRow;
                if (i10 == i11) {
                    gaVar.b(LocaleController.getString(R.string.AddProxy), proxyListActivity.F != -1);
                    break;
                } else if (i10 == proxyListActivity.F) {
                    gaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                    gaVar.b(LocaleController.getString(R.string.DeleteAllProxies), false);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == proxyListActivity.n) {
                    m4Var.setText(LocaleController.getString(R.string.ProxyConnections));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                i12 = proxyListActivity.useProxyRow;
                if (i10 == i12) {
                    x8Var.f(LocaleController.getString(R.string.UseProxySettings), proxyListActivity.d, proxyListActivity.w != -1);
                    break;
                } else {
                    i13 = proxyListActivity.callsRow;
                    if (i10 == i13) {
                        x8Var.f(LocaleController.getString(R.string.UseProxyForCalls), proxyListActivity.e, false);
                        break;
                    } else if (i10 == proxyListActivity.w) {
                        x8Var.f(LocaleController.getString(R.string.UseProxyRotation), SharedConfig.proxyRotationEnabled, true);
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                if (i10 == proxyListActivity.E) {
                    f9Var.setText(LocaleController.getString(R.string.UseProxyForCallsInfo));
                    break;
                } else if (i10 == proxyListActivity.y) {
                    f9Var.setText(LocaleController.getString(R.string.ProxyRotationTimeoutInfo));
                    break;
                }
                break;
            case 5:
                m21 m21Var = (m21) view;
                SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList2.get(i10 - proxyListActivity.r);
                m21Var.setProxy(proxyInfo);
                m21Var.setChecked(SharedConfig.currentProxy == proxyInfo);
                boolean contains = arrayList.contains(arrayList2.get(i10 - proxyListActivity.r));
                m21Var.h = contains;
                m21Var.f.a(contains, false);
                m21Var.a(!arrayList.isEmpty(), false);
                break;
            case 6:
                if (i10 == proxyListActivity.x) {
                    org.telegram.ui.Components.ew0 ew0Var = (org.telegram.ui.Components.ew0) view;
                    ArrayList arrayList3 = new ArrayList(ProxyRotationController.ROTATION_TIMEOUTS);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        strArr[i15] = LocaleController.formatString(R.string.ProxyRotationTimeoutSeconds, arrayList3.get(i15));
                    }
                    ew0Var.setCallback(new js0(4));
                    ew0Var.b(SharedConfig.proxyRotationTimeout, null, strArr);
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
            m21 m21Var = (m21) view;
            if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.I.get(i10 - proxyListActivity.r))) != m21Var.h) {
                m21Var.h = contains;
                m21Var.f.a(contains, true);
            }
            if (list.contains(2)) {
                m21Var.a(!arrayList.isEmpty(), true);
                return;
            }
            return;
        }
        if (c1Var.f != 3 || !list.contains(0)) {
            v(c1Var, i10);
            return;
        }
        org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
        i11 = proxyListActivity.useProxyRow;
        if (i10 == i11) {
            x8Var.setChecked(proxyListActivity.d);
            return;
        }
        i12 = proxyListActivity.callsRow;
        if (i10 == i12) {
            x8Var.setChecked(proxyListActivity.e);
        } else if (i10 == proxyListActivity.w) {
            x8Var.setChecked(SharedConfig.proxyRotationEnabled);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View c7Var;
        Context context = this.c;
        if (i10 == 0) {
            c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
        } else if (i10 == 1) {
            c7Var = new org.telegram.ui.Cells.ga(context);
            c7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        } else if (i10 == 2) {
            c7Var = new org.telegram.ui.Cells.m4(context);
            c7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        } else if (i10 == 3) {
            c7Var = new org.telegram.ui.Cells.x8(context);
            c7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        } else if (i10 == 4) {
            c7Var = new org.telegram.ui.Cells.f9(context);
        } else if (i10 != 6) {
            c7Var = new m21(this.d, context);
            c7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        } else {
            c7Var = new org.telegram.ui.Components.ew0(context, null);
            c7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        }
        return com.google.android.gms.internal.vision.e2.j(c7Var, c7Var, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        int i10;
        int i11;
        if (c1Var.f == 3) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) c1Var.a;
            int b10 = c1Var.b();
            ProxyListActivity proxyListActivity = this.d;
            i10 = proxyListActivity.useProxyRow;
            if (b10 == i10) {
                x8Var.setChecked(proxyListActivity.d);
                return;
            }
            i11 = proxyListActivity.callsRow;
            if (b10 == i11) {
                x8Var.setChecked(proxyListActivity.e);
            } else if (b10 == proxyListActivity.w) {
                x8Var.setChecked(SharedConfig.proxyRotationEnabled);
            }
        }
    }
}
