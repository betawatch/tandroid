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
import org.telegram.ui.hh1;
import org.telegram.ui.t91;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m51 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m51(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == -1) {
                    ((p51) this.b).finishFragment();
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
                    ((hh1) this.b).a(false, false);
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((org.telegram.ui.rt) this.b).finishFragment();
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
                    ((org.telegram.ui.pu) this.b).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((org.telegram.ui.cv) this.b).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i10 == -1) {
                    ((org.telegram.ui.xy) this.b).finishFragment();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.nz nzVar = (org.telegram.ui.nz) this.b;
                if (i10 == -1) {
                    if (nzVar.W(true)) {
                        nzVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    if (Math.abs(nzVar.P - 1.0f) < 0.1f) {
                        nzVar.c0();
                        break;
                    } else if (Math.abs(nzVar.P - 0.5f) < 0.1f) {
                        for (int i11 = 0; i11 < nzVar.a.getChildCount(); i11++) {
                            View childAt = nzVar.a.getChildAt(i11);
                            nzVar.a.getClass();
                            if (RecyclerView.R(childAt) == nzVar.H && (childAt instanceof v00)) {
                                int i12 = -nzVar.s;
                                nzVar.s = i12;
                                AndroidUtilities.shakeViewSpring(childAt, i12);
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            case 10:
                org.telegram.ui.p00 p00Var = (org.telegram.ui.p00) this.b;
                if (i10 == -1) {
                    if (p00Var.h0(true)) {
                        p00Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    p00Var.q0();
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
                    ((org.telegram.ui.z10) this.b).finishFragment();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.m60 m60Var = (org.telegram.ui.m60) this.b;
                if (i10 == -1) {
                    if (m60Var.f0(true)) {
                        m60Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    m60Var.o0();
                    break;
                }
                break;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.t60) this.b).finishFragment();
                    break;
                }
                break;
            case 15:
                if (i10 == -1) {
                    ((org.telegram.ui.v60) this.b).finishFragment();
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((org.telegram.ui.c70) this.b).finishFragment();
                    break;
                }
                break;
            case 17:
                if (i10 == -1) {
                    ((org.telegram.ui.e70) this.b).finishFragment();
                    break;
                }
                break;
            case 18:
                if (i10 == -1) {
                    ((org.telegram.ui.s70) this.b).finishFragment();
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
                org.telegram.ui.eb0 eb0Var = (org.telegram.ui.eb0) this.b;
                if (i10 == -1) {
                    eb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(eb0Var.B);
                    break;
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((org.telegram.ui.ub0) this.b).finishFragment();
                    break;
                }
                break;
            case 22:
                org.telegram.ui.fg0 fg0Var = (org.telegram.ui.fg0) this.b;
                if (i10 == 1) {
                    fg0Var.p1();
                    break;
                } else if (i10 == -1 && fg0Var.onBackPressed(true)) {
                    fg0Var.finishFragment();
                    break;
                }
                break;
            case 23:
                if (i10 == -1) {
                    ((org.telegram.ui.hg0) this.b).finishFragment();
                    break;
                }
                break;
            case 24:
                if (i10 == -1) {
                    ((org.telegram.ui.hh0) this.b).finishFragment();
                    break;
                }
                break;
            case 25:
                if (i10 == -1) {
                    ((org.telegram.ui.ih0) this.b).finishFragment();
                    break;
                }
                break;
            case 26:
                org.telegram.ui.si0 si0Var = (org.telegram.ui.si0) this.b;
                if (i10 == -1) {
                    si0Var.finishFragment();
                    break;
                } else if (i10 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", si0Var.b);
                    si0Var.presentFragment(new t91(bundle));
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
