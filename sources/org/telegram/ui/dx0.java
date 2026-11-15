package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class dx0 extends org.telegram.ui.Components.tj0 {
    public final Context c;
    public final /* synthetic */ fx0 d;

    public dx0(fx0 fx0Var, Context context) {
        this.d = fx0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int b10 = e1Var.b();
        fx0 fx0Var = this.d;
        if (b10 == fx0Var.G) {
            return fx0Var.r;
        }
        if (e1Var.b() == fx0Var.Y) {
            return true;
        }
        switch (e1Var.f) {
        }
        return fx0Var.r;
    }

    @Override // v4.h0
    public final int b() {
        return this.d.a0;
    }

    @Override // v4.h0
    public final int d(int i7) {
        fx0 fx0Var = this.d;
        if (i7 == fx0Var.x || i7 == fx0Var.M || i7 == fx0Var.V || i7 == fx0Var.R) {
            return 0;
        }
        if (i7 == fx0Var.H || i7 == fx0Var.I || i7 == fx0Var.K || i7 == fx0Var.J || i7 == fx0Var.S || i7 == fx0Var.T || i7 == fx0Var.Y) {
            return 1;
        }
        if (i7 == fx0Var.P || i7 == fx0Var.X || i7 == fx0Var.L || i7 == fx0Var.U) {
            return 2;
        }
        if (i7 == fx0Var.W) {
            return 3;
        }
        if (i7 == fx0Var.N || i7 == fx0Var.O) {
            return 4;
        }
        if (i7 == fx0Var.y) {
            return 5;
        }
        if (i7 == fx0Var.E || i7 == fx0Var.Z) {
            return 6;
        }
        return (i7 == fx0Var.F || i7 == fx0Var.G || i7 == fx0Var.Q) ? 7 : 0;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        TLObject M0;
        int i14;
        int i15;
        fx0 fx0Var = this.d;
        org.telegram.ui.ActionBar.e6 e6Var = fx0Var.e;
        long j3 = fx0Var.h;
        long j10 = fx0Var.f;
        int i16 = e1Var.f;
        View view = e1Var.a;
        switch (i16) {
            case 0:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i7 != fx0Var.x) {
                    if (i7 != fx0Var.M) {
                        if (i7 != fx0Var.V) {
                            if (i7 == fx0Var.R) {
                                n4Var.setText(org.telegram.messenger.hd.M0(2131743279, null));
                                break;
                            }
                        } else {
                            n4Var.setText(org.telegram.messenger.hd.M0(2131747904, null));
                            break;
                        }
                    } else {
                        n4Var.setText(org.telegram.messenger.hd.M0(2131746639, null));
                        break;
                    }
                } else {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131750474, null));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
                String v = org.telegram.messenger.at.v(j10, j3, false);
                i10 = ((org.telegram.ui.ActionBar.e2) fx0Var).currentAccount;
                SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(i10).e7;
                if (i7 != fx0Var.Y) {
                    org.telegram.ui.ActionBar.q6.U(v9Var.getTextView(), org.telegram.ui.ActionBar.j6.G6, e6Var);
                    if (i7 != fx0Var.H) {
                        if (i7 != fx0Var.S) {
                            if (i7 != fx0Var.I) {
                                if (i7 != fx0Var.K) {
                                    if (i7 != fx0Var.J) {
                                        if (i7 == fx0Var.T) {
                                            int c10 = org.telegram.messenger.k5.c("calls_vibrate_", v, sharedPreferences, 0);
                                            if (c10 != 0 && c10 != 4) {
                                                if (c10 != 1) {
                                                    if (c10 != 2) {
                                                        if (c10 == 3) {
                                                            v9Var.c(org.telegram.messenger.hd.M0(2131743614, null), org.telegram.messenger.hd.M0(2131748723, null), false, true);
                                                            break;
                                                        }
                                                    } else {
                                                        v9Var.c(org.telegram.messenger.hd.M0(2131743614, null), org.telegram.messenger.hd.M0(2131743612, null), false, true);
                                                        break;
                                                    }
                                                } else {
                                                    v9Var.c(org.telegram.messenger.hd.M0(2131743614, null), org.telegram.messenger.hd.M0(2131745366, null), false, true);
                                                    break;
                                                }
                                            } else {
                                                v9Var.c(org.telegram.messenger.hd.M0(2131743614, null), org.telegram.messenger.hd.M0(2131743613, null), false, true);
                                                break;
                                            }
                                        }
                                    } else {
                                        int c11 = org.telegram.messenger.k5.c("smart_max_count_", v, sharedPreferences, 2);
                                        int c12 = org.telegram.messenger.k5.c("smart_delay_", v, sharedPreferences, org.telegram.messenger.ns.K2);
                                        if (c11 != 0) {
                                            v9Var.c(org.telegram.messenger.hd.M0(2131745300, null), org.telegram.messenger.hd.a0("SmartNotificationsInfo", null, 2131745298, Integer.valueOf(c11), org.telegram.messenger.hd.G(c12 / 60, "Minutes", new Object[0])), false, fx0Var.K != -1);
                                            break;
                                        } else {
                                            v9Var.c(org.telegram.messenger.hd.M0(2131745300, null), org.telegram.messenger.hd.M0(2131745299, null), false, fx0Var.K != -1);
                                            break;
                                        }
                                    }
                                } else {
                                    int c13 = org.telegram.messenger.k5.c("priority_", v, sharedPreferences, 3);
                                    if (c13 != 0) {
                                        if (c13 != 1 && c13 != 2) {
                                            if (c13 != 3) {
                                                if (c13 != 4) {
                                                    if (c13 == 5) {
                                                        v9Var.c(org.telegram.messenger.hd.M0(2131747906, null), org.telegram.messenger.hd.M0(2131747881, null), false, false);
                                                        break;
                                                    }
                                                } else {
                                                    v9Var.c(org.telegram.messenger.hd.M0(2131747906, null), org.telegram.messenger.hd.M0(2131747882, null), false, false);
                                                    break;
                                                }
                                            } else {
                                                v9Var.c(org.telegram.messenger.hd.M0(2131747906, null), org.telegram.messenger.hd.M0(2131747880, null), false, false);
                                                break;
                                            }
                                        } else {
                                            v9Var.c(org.telegram.messenger.hd.M0(2131747906, null), org.telegram.messenger.hd.M0(2131747879, null), false, false);
                                            break;
                                        }
                                    } else {
                                        v9Var.c(org.telegram.messenger.hd.M0(2131747906, null), org.telegram.messenger.hd.M0(2131747883, null), false, false);
                                        break;
                                    }
                                }
                            } else {
                                int c14 = org.telegram.messenger.k5.c("vibrate_", v, sharedPreferences, 0);
                                if (c14 != 0 && c14 != 4) {
                                    if (c14 != 1) {
                                        if (c14 != 2) {
                                            if (c14 == 3) {
                                                String M02 = org.telegram.messenger.hd.M0(2131743614, null);
                                                String M03 = org.telegram.messenger.hd.M0(2131748723, null);
                                                if (fx0Var.J == -1 && fx0Var.K == -1) {
                                                    r12 = false;
                                                }
                                                v9Var.c(M02, M03, false, r12);
                                                break;
                                            }
                                        } else {
                                            String M04 = org.telegram.messenger.hd.M0(2131743614, null);
                                            String M05 = org.telegram.messenger.hd.M0(2131743612, null);
                                            if (fx0Var.J == -1 && fx0Var.K == -1) {
                                                r12 = false;
                                            }
                                            v9Var.c(M04, M05, false, r12);
                                            break;
                                        }
                                    } else {
                                        String M06 = org.telegram.messenger.hd.M0(2131743614, null);
                                        String M07 = org.telegram.messenger.hd.M0(2131745366, null);
                                        if (fx0Var.J == -1 && fx0Var.K == -1) {
                                            r12 = false;
                                        }
                                        v9Var.c(M06, M07, false, r12);
                                        break;
                                    }
                                } else {
                                    String M08 = org.telegram.messenger.hd.M0(2131743614, null);
                                    String M09 = org.telegram.messenger.hd.M0(2131743613, null);
                                    if (fx0Var.J == -1 && fx0Var.K == -1) {
                                        r12 = false;
                                    }
                                    v9Var.c(M08, M09, false, r12);
                                    break;
                                }
                            }
                        } else {
                            String string = sharedPreferences.getString(r.b.k("ringtone_", v), org.telegram.messenger.hd.M0(2131751599, null));
                            if (string.equals("NoSound")) {
                                string = org.telegram.messenger.hd.M0(2131748151, null);
                            }
                            v9Var.c(org.telegram.messenger.hd.M0(2131743241, null), string, false, false);
                            break;
                        }
                    } else {
                        String string2 = sharedPreferences.getString(r.b.k("sound_", v), org.telegram.messenger.hd.M0(2131745280, null));
                        long j11 = sharedPreferences.getLong("sound_document_id_" + v, 0L);
                        if (j11 != 0) {
                            TLRPC.Document c15 = fx0Var.getMediaDataController().A0.c(j11);
                            string2 = c15 == null ? org.telegram.messenger.hd.M0(2131751679, null) : uh0.g0(c15, c15.file_name_fixed);
                        } else if (string2.equals("NoSound")) {
                            string2 = org.telegram.messenger.hd.M0(2131748151, null);
                        } else if (string2.equals("Default")) {
                            string2 = org.telegram.messenger.hd.M0(2131745280, null);
                        }
                        v9Var.c(org.telegram.messenger.hd.M0(2131745283, null), string2, false, true);
                        break;
                    }
                } else {
                    v9Var.b(org.telegram.messenger.hd.M0(2131746104, null), false);
                    org.telegram.ui.ActionBar.q6.U(v9Var.getTextView(), org.telegram.ui.ActionBar.j6.q7, e6Var);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                y8Var.setFixedSize(0);
                if (i7 != fx0Var.P) {
                    if (i7 != fx0Var.X) {
                        if (i7 != fx0Var.L) {
                            if (i7 == fx0Var.U) {
                                y8Var.setText(org.telegram.messenger.hd.M0(2131743244, null));
                                break;
                            }
                        } else if (fx0Var.K != -1) {
                            y8Var.setText(org.telegram.messenger.hd.M0(2131746869, null));
                            break;
                        } else {
                            y8Var.setText("");
                            break;
                        }
                    } else {
                        y8Var.setText(org.telegram.messenger.hd.M0(2131747902, null));
                        break;
                    }
                } else {
                    y8Var.setText(org.telegram.messenger.hd.M0(2131746638, null));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                String v10 = org.telegram.messenger.at.v(j10, j3, false);
                i11 = ((org.telegram.ui.ActionBar.e2) fx0Var).currentAccount;
                SharedPreferences sharedPreferences2 = org.telegram.messenger.np.s1(i11).e7;
                StringBuilder sb2 = new StringBuilder("color_");
                sb2.append(v10);
                int c16 = sharedPreferences2.contains(sb2.toString()) ? org.telegram.messenger.k5.c("color_", v10, sharedPreferences2, -16776961) : org.telegram.messenger.m5.z(j10) ? sharedPreferences2.getInt("GroupLed", -16776961) : sharedPreferences2.getInt("MessagesLed", -16776961);
                int i17 = 0;
                while (true) {
                    if (i17 < 9) {
                        if (org.telegram.ui.Cells.s8.f[i17] == c16) {
                            c16 = org.telegram.ui.Cells.s8.e[i17];
                        } else {
                            i17++;
                        }
                    }
                }
                s8Var.b(c16, org.telegram.messenger.hd.M0(2131747903, null), false);
                break;
            case 4:
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                i12 = ((org.telegram.ui.ActionBar.e2) fx0Var).currentAccount;
                SharedPreferences sharedPreferences3 = org.telegram.messenger.np.s1(i12).e7;
                int c17 = org.telegram.messenger.k5.c("popup_", org.telegram.messenger.at.v(j10, j3, false), sharedPreferences3, 0);
                if (c17 == 0) {
                    c17 = sharedPreferences3.getInt(org.telegram.messenger.m5.z(j10) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                }
                if (i7 != fx0Var.N) {
                    if (i7 == fx0Var.O) {
                        h6Var.c(org.telegram.messenger.hd.M0(2131747100, null), c17 == 2, false);
                        h6Var.setTag(2);
                        break;
                    }
                } else {
                    h6Var.c(org.telegram.messenger.hd.M0(2131747099, null), c17 == 1, true);
                    h6Var.setTag(1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.oa oaVar = (org.telegram.ui.Cells.oa) view;
                if (org.telegram.messenger.m5.E(j10)) {
                    i14 = ((org.telegram.ui.ActionBar.e2) fx0Var).currentAccount;
                    M0 = org.telegram.messenger.np.s1(i14).a2(Long.valueOf(j10));
                } else {
                    i13 = ((org.telegram.ui.ActionBar.e2) fx0Var).currentAccount;
                    M0 = org.telegram.messenger.np.s1(i13).M0(Long.valueOf(-j10));
                }
                oaVar.a(null, M0);
                break;
            case 6:
                org.telegram.ui.Cells.x6 x6Var = (org.telegram.ui.Cells.x6) view;
                boolean z10 = i7 > 0;
                r12 = i7 < fx0Var.a0 - 1;
                if (x6Var.c != z10 || x6Var.d != r12) {
                    x6Var.c = z10;
                    x6Var.d = r12;
                    int i18 = x6Var.b;
                    if (i18 != 0) {
                        x6Var.setBackgroundColor(i18);
                        break;
                    } else {
                        x6Var.setBackground(null);
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                i15 = ((org.telegram.ui.ActionBar.e2) fx0Var).currentAccount;
                SharedPreferences sharedPreferences4 = org.telegram.messenger.np.s1(i15).e7;
                if (i7 != fx0Var.F) {
                    if (i7 != fx0Var.G) {
                        if (i7 == fx0Var.Q) {
                            String k10 = r.b.k("stories_", org.telegram.messenger.at.v(j10, j3, false));
                            if (fx0Var.b0 || (sharedPreferences4.contains("EnableAllStories") && sharedPreferences4.getBoolean("EnableAllStories", true))) {
                                r13 = true;
                            }
                            q8Var.f(org.telegram.messenger.hd.M0(2131744744, null), sharedPreferences4.getBoolean(k10, r13), true);
                            break;
                        }
                    } else {
                        String v11 = org.telegram.messenger.at.v(j10, j3, false);
                        q8Var.f(org.telegram.messenger.hd.M0(2131748537, null), sharedPreferences4.getBoolean("content_preview_" + v11, true), true);
                        break;
                    }
                } else {
                    q8Var.f(org.telegram.messenger.hd.M0(2131747924, null), fx0Var.r, true);
                    break;
                }
                break;
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View n4Var;
        org.telegram.ui.ActionBar.e6 e6Var = this.d.e;
        Context context = this.c;
        switch (i7) {
            case 0:
                n4Var = new org.telegram.ui.Cells.n4(context, e6Var);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, n4Var, e6Var);
                break;
            case 1:
                n4Var = new org.telegram.ui.Cells.v9(0, context, e6Var);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, n4Var, e6Var);
                break;
            case 2:
                n4Var = new org.telegram.ui.Cells.y8(context, e6Var);
                break;
            case 3:
                n4Var = new org.telegram.ui.Cells.s8(context, e6Var);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, n4Var, e6Var);
                break;
            case 4:
                n4Var = new org.telegram.ui.Cells.h6(context, e6Var);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, n4Var, e6Var);
                break;
            case 5:
                n4Var = new org.telegram.ui.Cells.oa(context, e6Var);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, n4Var, e6Var);
                break;
            case 6:
                n4Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
                break;
            default:
                n4Var = new org.telegram.ui.Cells.q8(context, e6Var);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, n4Var, e6Var);
                break;
        }
        return i5.c.q(n4Var, n4Var, -1, -2);
    }

    @Override // v4.h0
    public final void y(v4.e1 e1Var) {
        int i7 = e1Var.f;
        View view = e1Var.a;
        fx0 fx0Var = this.d;
        if (i7 == 0) {
            ((org.telegram.ui.Cells.n4) view).a(null, fx0Var.r);
            return;
        }
        if (i7 == 1) {
            org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
            if (e1Var.b() == fx0Var.Y) {
                v9Var.a(null, true);
                return;
            } else {
                v9Var.a(null, fx0Var.r);
                return;
            }
        }
        if (i7 == 2) {
            ((org.telegram.ui.Cells.y8) view).c(null, fx0Var.r);
            return;
        }
        if (i7 == 3) {
            ((org.telegram.ui.Cells.s8) view).a(null, fx0Var.r);
            return;
        }
        if (i7 == 4) {
            ((org.telegram.ui.Cells.h6) view).b(null, fx0Var.r);
            return;
        }
        if (i7 != 7) {
            return;
        }
        org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
        if (e1Var.b() == fx0Var.G) {
            q8Var.e(null, fx0Var.r);
        } else if (e1Var.b() == fx0Var.Q) {
            q8Var.e(null, fx0Var.r);
        } else {
            q8Var.e(null, true);
        }
    }
}
