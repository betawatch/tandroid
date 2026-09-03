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
import org.telegram.ui.oa1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                    ((bi1) this.b).a(false, false);
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((org.telegram.ui.au) this.b).finishFragment();
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
                    ((org.telegram.ui.zu) this.b).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((org.telegram.ui.mv) this.b).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i10 == -1) {
                    ((org.telegram.ui.jz) this.b).finishFragment();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.a00 a00Var = (org.telegram.ui.a00) this.b;
                if (i10 == -1) {
                    if (a00Var.W(true)) {
                        a00Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    if (Math.abs(a00Var.Q - 1.0f) < 0.1f) {
                        a00Var.c0();
                        break;
                    } else if (Math.abs(a00Var.Q - 0.5f) < 0.1f) {
                        for (int i11 = 0; i11 < a00Var.a.getChildCount(); i11++) {
                            View childAt = a00Var.a.getChildAt(i11);
                            a00Var.a.getClass();
                            if (RecyclerView.R(childAt) == a00Var.I && (childAt instanceof a10)) {
                                int i12 = -a00Var.s;
                                a00Var.s = i12;
                                AndroidUtilities.shakeViewSpring(childAt, i12);
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            case 10:
                org.telegram.ui.c10 c10Var = (org.telegram.ui.c10) this.b;
                if (i10 == -1) {
                    if (c10Var.h0(true)) {
                        c10Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    c10Var.q0();
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
                    ((org.telegram.ui.n20) this.b).finishFragment();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.a70 a70Var = (org.telegram.ui.a70) this.b;
                if (i10 == -1) {
                    if (a70Var.f0(true)) {
                        a70Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    a70Var.o0();
                    break;
                }
                break;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.g70) this.b).finishFragment();
                    break;
                }
                break;
            case 15:
                if (i10 == -1) {
                    ((org.telegram.ui.i70) this.b).finishFragment();
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((org.telegram.ui.o70) this.b).finishFragment();
                    break;
                }
                break;
            case 17:
                if (i10 == -1) {
                    ((org.telegram.ui.q70) this.b).finishFragment();
                    break;
                }
                break;
            case 18:
                if (i10 == -1) {
                    ((org.telegram.ui.e80) this.b).finishFragment();
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
                org.telegram.ui.pb0 pb0Var = (org.telegram.ui.pb0) this.b;
                if (i10 == -1) {
                    pb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(pb0Var.C);
                    break;
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((org.telegram.ui.gc0) this.b).finishFragment();
                    break;
                }
                break;
            case 22:
                org.telegram.ui.pg0 pg0Var = (org.telegram.ui.pg0) this.b;
                if (i10 == 1) {
                    pg0Var.p1();
                    break;
                } else if (i10 == -1 && pg0Var.onBackPressed(true)) {
                    pg0Var.finishFragment();
                    break;
                }
                break;
            case 23:
                if (i10 == -1) {
                    ((org.telegram.ui.rg0) this.b).finishFragment();
                    break;
                }
                break;
            case 24:
                if (i10 == -1) {
                    ((org.telegram.ui.rh0) this.b).finishFragment();
                    break;
                }
                break;
            case 25:
                if (i10 == -1) {
                    ((org.telegram.ui.sh0) this.b).finishFragment();
                    break;
                }
                break;
            case 26:
                org.telegram.ui.cj0 cj0Var = (org.telegram.ui.cj0) this.b;
                if (i10 == -1) {
                    cj0Var.finishFragment();
                    break;
                } else if (i10 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", cj0Var.b);
                    cj0Var.presentFragment(new oa1(bundle));
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
