package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v1 implements wb0, org.telegram.ui.ActionBar.u1, org.telegram.ui.ActionBar.x6, org.telegram.ui.ActionBar.y6, q4, org.telegram.messenger.nc, org.telegram.messenger.m9 {
    public final /* synthetic */ int a;

    public /* synthetic */ v1(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 25:
                MediaController.B().B0(1, i10, z10, false);
                break;
            default:
                MediaController.B().B0(1, i10, z10, false);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.y6
    public void d(int i10, View view) {
        ((org.telegram.ui.ActionBar.b1) view).d(i10, i10);
    }

    @Override // org.telegram.ui.Components.wb0
    public String e(int i10) {
        switch (this.a) {
            case 0:
                if (i10 != 0) {
                    Calendar calendar = Calendar.getInstance();
                    int i11 = calendar.get(1);
                    calendar.add(6, i10);
                    long timeInMillis = calendar.getTimeInMillis();
                    if (calendar.get(1) != i11) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 7:
                if (i10 != 0) {
                    Calendar calendar2 = Calendar.getInstance();
                    int i12 = calendar2.get(1);
                    calendar2.add(6, i10);
                    long timeInMillis2 = calendar2.getTimeInMillis();
                    if (calendar2.get(1) != i12) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 11:
                boolean z10 = org.telegram.messenger.dd.Z;
                String format = String.format("%02d", Integer.valueOf((i10 % 12 != 0 || z10) ? i10 % (z10 ? 24 : 12) : 12));
                if (i10 >= 24) {
                    break;
                }
                break;
            case 13:
                if (i10 != 0) {
                    if (i10 >= 1 && i10 < 16) {
                        break;
                    } else if (i10 != 16) {
                        if (i10 != 17) {
                            if (i10 != 18) {
                                if (i10 != 19) {
                                    if (i10 == 20) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 16:
                switch (i10) {
                }
            case 18:
                switch (i10) {
                }
        }
        return String.format("%02d", Integer.valueOf(i10));
    }

    @Override // org.telegram.ui.ActionBar.x6
    public int f(View view) {
        org.telegram.ui.ActionBar.b1 b1Var = (org.telegram.ui.ActionBar.b1) view;
        if (b1Var.getTextView() != null) {
            return b1Var.getTextView().getCurrentTextColor();
        }
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 3:
                x1Var.dismiss();
                break;
            case 10:
                x1Var.dismiss();
                break;
            case 14:
                Pattern pattern = s4.a;
                break;
            default:
                x1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.messenger.m9
    public Object l(Object obj) {
        return CheckBoxBase.I;
    }

    @Override // org.telegram.messenger.nc
    public void q(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Drawable t10 = imageReceiver.t();
        if (t10 instanceof ci0) {
            ci0 ci0Var = (ci0) t10;
            ci0Var.P(0);
            ci0Var.stop();
            ci0Var.T(false, 0.0f);
        }
    }

    @Override // org.telegram.messenger.nc
    public /* synthetic */ void j(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.nc
    public /* synthetic */ void s(int i10, Drawable drawable) {
    }
}
