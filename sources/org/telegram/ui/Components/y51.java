package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ga1;
import org.telegram.ui.th1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class y51 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y51(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == -1) {
                    ((b61) this.b).finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.u0) this.b).b(false, false);
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((th1) this.b).a(false, false);
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((org.telegram.ui.yt) this.b).finishFragment();
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((DataSettingsActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((org.telegram.ui.xu) this.b).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((org.telegram.ui.kv) this.b).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i10 == -1) {
                    ((org.telegram.ui.hz) this.b).finishFragment();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.yz yzVar = (org.telegram.ui.yz) this.b;
                if (i10 == -1) {
                    if (yzVar.W(true)) {
                        yzVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    if (Math.abs(yzVar.Q - 1.0f) < 0.1f) {
                        yzVar.c0();
                        break;
                    } else if (Math.abs(yzVar.Q - 0.5f) < 0.1f) {
                        for (int i11 = 0; i11 < yzVar.a.getChildCount(); i11++) {
                            View childAt = yzVar.a.getChildAt(i11);
                            yzVar.a.getClass();
                            if (RecyclerView.R(childAt) == yzVar.I && (childAt instanceof z00)) {
                                int i12 = -yzVar.s;
                                yzVar.s = i12;
                                AndroidUtilities.shakeViewSpring(childAt, i12);
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            case 10:
                org.telegram.ui.b10 b10Var = (org.telegram.ui.b10) this.b;
                if (i10 == -1) {
                    if (b10Var.h0(true)) {
                        b10Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    b10Var.q0();
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((FiltersSetupActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((org.telegram.ui.l20) this.b).finishFragment();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.y60 y60Var = (org.telegram.ui.y60) this.b;
                if (i10 == -1) {
                    if (y60Var.f0(true)) {
                        y60Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    y60Var.o0();
                    break;
                }
                break;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.e70) this.b).finishFragment();
                    break;
                }
                break;
            case 15:
                if (i10 == -1) {
                    ((org.telegram.ui.g70) this.b).finishFragment();
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((org.telegram.ui.m70) this.b).finishFragment();
                    break;
                }
                break;
            case 17:
                if (i10 == -1) {
                    ((org.telegram.ui.o70) this.b).finishFragment();
                    break;
                }
                break;
            case 18:
                if (i10 == -1) {
                    ((org.telegram.ui.c80) this.b).finishFragment();
                    break;
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((LanguageSelectActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 20:
                org.telegram.ui.nb0 nb0Var = (org.telegram.ui.nb0) this.b;
                if (i10 == -1) {
                    nb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(nb0Var.C);
                    break;
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((org.telegram.ui.ec0) this.b).finishFragment();
                    break;
                }
                break;
            case 22:
                org.telegram.ui.ng0 ng0Var = (org.telegram.ui.ng0) this.b;
                if (i10 == 1) {
                    ng0Var.p1();
                    break;
                } else if (i10 == -1 && ng0Var.onBackPressed(true)) {
                    ng0Var.finishFragment();
                    break;
                }
                break;
            case 23:
                if (i10 == -1) {
                    ((org.telegram.ui.pg0) this.b).finishFragment();
                    break;
                }
                break;
            case 24:
                if (i10 == -1) {
                    ((org.telegram.ui.ph0) this.b).finishFragment();
                    break;
                }
                break;
            case 25:
                if (i10 == -1) {
                    ((org.telegram.ui.qh0) this.b).finishFragment();
                    break;
                }
                break;
            case 26:
                org.telegram.ui.aj0 aj0Var = (org.telegram.ui.aj0) this.b;
                if (i10 == -1) {
                    aj0Var.finishFragment();
                    break;
                } else if (i10 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", aj0Var.b);
                    aj0Var.presentFragment(new ga1(bundle));
                    break;
                }
                break;
            case 27:
                if (i10 == -1) {
                    ((NotificationsCustomSettingsActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((NotificationsSettingsActivity) this.b).finishFragment();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((PasscodeActivity) this.b).finishFragment();
                    break;
                }
                break;
        }
    }
}
