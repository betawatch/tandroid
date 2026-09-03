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
import org.telegram.ui.bi1;
import org.telegram.ui.na1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                    ((org.telegram.ui.Components.voip.v0) this.b).b(false, false);
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((bi1) this.b).a(false, false);
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((org.telegram.ui.zt) this.b).finishFragment();
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
                    ((org.telegram.ui.yu) this.b).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((org.telegram.ui.lv) this.b).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i10 == -1) {
                    ((org.telegram.ui.iz) this.b).finishFragment();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.zz zzVar = (org.telegram.ui.zz) this.b;
                if (i10 == -1) {
                    if (zzVar.W(true)) {
                        zzVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    if (Math.abs(zzVar.Q - 1.0f) < 0.1f) {
                        zzVar.c0();
                        break;
                    } else if (Math.abs(zzVar.Q - 0.5f) < 0.1f) {
                        for (int i11 = 0; i11 < zzVar.a.getChildCount(); i11++) {
                            View childAt = zzVar.a.getChildAt(i11);
                            zzVar.a.getClass();
                            if (RecyclerView.R(childAt) == zzVar.I && (childAt instanceof a10)) {
                                int i12 = -zzVar.s;
                                zzVar.s = i12;
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
                    ((org.telegram.ui.m20) this.b).finishFragment();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.z60 z60Var = (org.telegram.ui.z60) this.b;
                if (i10 == -1) {
                    if (z60Var.f0(true)) {
                        z60Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    z60Var.o0();
                    break;
                }
                break;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.f70) this.b).finishFragment();
                    break;
                }
                break;
            case 15:
                if (i10 == -1) {
                    ((org.telegram.ui.h70) this.b).finishFragment();
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((org.telegram.ui.n70) this.b).finishFragment();
                    break;
                }
                break;
            case 17:
                if (i10 == -1) {
                    ((org.telegram.ui.p70) this.b).finishFragment();
                    break;
                }
                break;
            case 18:
                if (i10 == -1) {
                    ((org.telegram.ui.d80) this.b).finishFragment();
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
                org.telegram.ui.ob0 ob0Var = (org.telegram.ui.ob0) this.b;
                if (i10 == -1) {
                    ob0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(ob0Var.C);
                    break;
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((org.telegram.ui.fc0) this.b).finishFragment();
                    break;
                }
                break;
            case 22:
                org.telegram.ui.og0 og0Var = (org.telegram.ui.og0) this.b;
                if (i10 == 1) {
                    og0Var.p1();
                    break;
                } else if (i10 == -1 && og0Var.onBackPressed(true)) {
                    og0Var.finishFragment();
                    break;
                }
                break;
            case 23:
                if (i10 == -1) {
                    ((org.telegram.ui.qg0) this.b).finishFragment();
                    break;
                }
                break;
            case 24:
                if (i10 == -1) {
                    ((org.telegram.ui.qh0) this.b).finishFragment();
                    break;
                }
                break;
            case 25:
                if (i10 == -1) {
                    ((org.telegram.ui.rh0) this.b).finishFragment();
                    break;
                }
                break;
            case 26:
                org.telegram.ui.bj0 bj0Var = (org.telegram.ui.bj0) this.b;
                if (i10 == -1) {
                    bj0Var.finishFragment();
                    break;
                } else if (i10 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", bj0Var.b);
                    bj0Var.presentFragment(new na1(bundle));
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
