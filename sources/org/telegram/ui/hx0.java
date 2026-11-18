package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class hx0 extends org.telegram.ui.Components.bk0 {
    public final Context c;
    public final /* synthetic */ jx0 d;

    public hx0(jx0 jx0Var, Context context) {
        this.d = jx0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        int b10 = f1Var.b();
        jx0 jx0Var = this.d;
        if (b10 == jx0Var.G) {
            return jx0Var.r;
        }
        if (f1Var.b() == jx0Var.Y) {
            return true;
        }
        switch (f1Var.f) {
        }
        return jx0Var.r;
    }

    @Override // v4.i0
    public final int b() {
        return this.d.a0;
    }

    @Override // v4.i0
    public final int d(int i7) {
        jx0 jx0Var = this.d;
        if (i7 == jx0Var.x || i7 == jx0Var.M || i7 == jx0Var.V || i7 == jx0Var.R) {
            return 0;
        }
        if (i7 == jx0Var.H || i7 == jx0Var.I || i7 == jx0Var.K || i7 == jx0Var.J || i7 == jx0Var.S || i7 == jx0Var.T || i7 == jx0Var.Y) {
            return 1;
        }
        if (i7 == jx0Var.P || i7 == jx0Var.X || i7 == jx0Var.L || i7 == jx0Var.U) {
            return 2;
        }
        if (i7 == jx0Var.W) {
            return 3;
        }
        if (i7 == jx0Var.N || i7 == jx0Var.O) {
            return 4;
        }
        if (i7 == jx0Var.y) {
            return 5;
        }
        if (i7 == jx0Var.E || i7 == jx0Var.Z) {
            return 6;
        }
        return (i7 == jx0Var.F || i7 == jx0Var.G || i7 == jx0Var.Q) ? 7 : 0;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        TLObject O0;
        int i14;
        int i15;
        jx0 jx0Var = this.d;
        org.telegram.ui.ActionBar.i6 i6Var = jx0Var.e;
        long j3 = jx0Var.h;
        long j10 = jx0Var.f;
        int i16 = f1Var.f;
        View view = f1Var.a;
        switch (i16) {
            case 0:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i7 != jx0Var.x) {
                    if (i7 != jx0Var.M) {
                        if (i7 != jx0Var.V) {
                            if (i7 == jx0Var.R) {
                                n4Var.setText(org.telegram.messenger.gd.M0(2131743042, null));
                                break;
                            }
                        } else {
                            n4Var.setText(org.telegram.messenger.gd.M0(2131747711, null));
                            break;
                        }
                    } else {
                        n4Var.setText(org.telegram.messenger.gd.M0(2131746444, null));
                        break;
                    }
                } else {
                    n4Var.setText(org.telegram.messenger.gd.M0(2131750458, null));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
                String v = org.telegram.messenger.xs.v(j10, j3, false);
                i10 = ((org.telegram.ui.ActionBar.h2) jx0Var).currentAccount;
                SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i10).g7;
                if (i7 != jx0Var.Y) {
                    org.telegram.ui.ActionBar.u6.U(w9Var.getTextView(), org.telegram.ui.ActionBar.n6.G6, i6Var);
                    if (i7 != jx0Var.H) {
                        if (i7 != jx0Var.S) {
                            if (i7 != jx0Var.I) {
                                if (i7 != jx0Var.K) {
                                    if (i7 != jx0Var.J) {
                                        if (i7 == jx0Var.T) {
                                            int c10 = org.telegram.messenger.f3.c("calls_vibrate_", v, sharedPreferences, 0);
                                            if (c10 != 0 && c10 != 4) {
                                                if (c10 != 1) {
                                                    if (c10 != 2) {
                                                        if (c10 == 3) {
                                                            w9Var.c(org.telegram.messenger.gd.M0(2131743377, null), org.telegram.messenger.gd.M0(2131748531, null), false, true);
                                                            break;
                                                        }
                                                    } else {
                                                        w9Var.c(org.telegram.messenger.gd.M0(2131743377, null), org.telegram.messenger.gd.M0(2131743375, null), false, true);
                                                        break;
                                                    }
                                                } else {
                                                    w9Var.c(org.telegram.messenger.gd.M0(2131743377, null), org.telegram.messenger.gd.M0(2131745171, null), false, true);
                                                    break;
                                                }
                                            } else {
                                                w9Var.c(org.telegram.messenger.gd.M0(2131743377, null), org.telegram.messenger.gd.M0(2131743376, null), false, true);
                                                break;
                                            }
                                        }
                                    } else {
                                        int c11 = org.telegram.messenger.f3.c("smart_max_count_", v, sharedPreferences, 2);
                                        int c12 = org.telegram.messenger.f3.c("smart_delay_", v, sharedPreferences, org.telegram.messenger.ks.K2);
                                        if (c11 != 0) {
                                            w9Var.c(org.telegram.messenger.gd.M0(2131745105, null), org.telegram.messenger.gd.a0("SmartNotificationsInfo", null, 2131745103, Integer.valueOf(c11), org.telegram.messenger.gd.G(c12 / 60, "Minutes", new Object[0])), false, jx0Var.K != -1);
                                            break;
                                        } else {
                                            w9Var.c(org.telegram.messenger.gd.M0(2131745105, null), org.telegram.messenger.gd.M0(2131745104, null), false, jx0Var.K != -1);
                                            break;
                                        }
                                    }
                                } else {
                                    int c13 = org.telegram.messenger.f3.c("priority_", v, sharedPreferences, 3);
                                    if (c13 != 0) {
                                        if (c13 != 1 && c13 != 2) {
                                            if (c13 != 3) {
                                                if (c13 != 4) {
                                                    if (c13 == 5) {
                                                        w9Var.c(org.telegram.messenger.gd.M0(2131747713, null), org.telegram.messenger.gd.M0(2131747688, null), false, false);
                                                        break;
                                                    }
                                                } else {
                                                    w9Var.c(org.telegram.messenger.gd.M0(2131747713, null), org.telegram.messenger.gd.M0(2131747689, null), false, false);
                                                    break;
                                                }
                                            } else {
                                                w9Var.c(org.telegram.messenger.gd.M0(2131747713, null), org.telegram.messenger.gd.M0(2131747687, null), false, false);
                                                break;
                                            }
                                        } else {
                                            w9Var.c(org.telegram.messenger.gd.M0(2131747713, null), org.telegram.messenger.gd.M0(2131747686, null), false, false);
                                            break;
                                        }
                                    } else {
                                        w9Var.c(org.telegram.messenger.gd.M0(2131747713, null), org.telegram.messenger.gd.M0(2131747690, null), false, false);
                                        break;
                                    }
                                }
                            } else {
                                int c14 = org.telegram.messenger.f3.c("vibrate_", v, sharedPreferences, 0);
                                if (c14 != 0 && c14 != 4) {
                                    if (c14 != 1) {
                                        if (c14 != 2) {
                                            if (c14 == 3) {
                                                String M0 = org.telegram.messenger.gd.M0(2131743377, null);
                                                String M02 = org.telegram.messenger.gd.M0(2131748531, null);
                                                if (jx0Var.J == -1 && jx0Var.K == -1) {
                                                    r12 = false;
                                                }
                                                w9Var.c(M0, M02, false, r12);
                                                break;
                                            }
                                        } else {
                                            String M03 = org.telegram.messenger.gd.M0(2131743377, null);
                                            String M04 = org.telegram.messenger.gd.M0(2131743375, null);
                                            if (jx0Var.J == -1 && jx0Var.K == -1) {
                                                r12 = false;
                                            }
                                            w9Var.c(M03, M04, false, r12);
                                            break;
                                        }
                                    } else {
                                        String M05 = org.telegram.messenger.gd.M0(2131743377, null);
                                        String M06 = org.telegram.messenger.gd.M0(2131745171, null);
                                        if (jx0Var.J == -1 && jx0Var.K == -1) {
                                            r12 = false;
                                        }
                                        w9Var.c(M05, M06, false, r12);
                                        break;
                                    }
                                } else {
                                    String M07 = org.telegram.messenger.gd.M0(2131743377, null);
                                    String M08 = org.telegram.messenger.gd.M0(2131743376, null);
                                    if (jx0Var.J == -1 && jx0Var.K == -1) {
                                        r12 = false;
                                    }
                                    w9Var.c(M07, M08, false, r12);
                                    break;
                                }
                            }
                        } else {
                            String string = sharedPreferences.getString(p5.c.k("ringtone_", v), org.telegram.messenger.gd.M0(2131751588, null));
                            if (string.equals("NoSound")) {
                                string = org.telegram.messenger.gd.M0(2131747959, null);
                            }
                            w9Var.c(org.telegram.messenger.gd.M0(2131743004, null), string, false, false);
                            break;
                        }
                    } else {
                        String string2 = sharedPreferences.getString(p5.c.k("sound_", v), org.telegram.messenger.gd.M0(2131745085, null));
                        long j11 = sharedPreferences.getLong("sound_document_id_" + v, 0L);
                        if (j11 != 0) {
                            TLRPC.Document c15 = jx0Var.getMediaDataController().A0.c(j11);
                            string2 = c15 == null ? org.telegram.messenger.gd.M0(2131751668, null) : xh0.g0(c15, c15.file_name_fixed);
                        } else if (string2.equals("NoSound")) {
                            string2 = org.telegram.messenger.gd.M0(2131747959, null);
                        } else if (string2.equals("Default")) {
                            string2 = org.telegram.messenger.gd.M0(2131745085, null);
                        }
                        w9Var.c(org.telegram.messenger.gd.M0(2131745088, null), string2, false, true);
                        break;
                    }
                } else {
                    w9Var.b(org.telegram.messenger.gd.M0(2131745909, null), false);
                    org.telegram.ui.ActionBar.u6.U(w9Var.getTextView(), org.telegram.ui.ActionBar.n6.q7, i6Var);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                z8Var.setFixedSize(0);
                if (i7 != jx0Var.P) {
                    if (i7 != jx0Var.X) {
                        if (i7 != jx0Var.L) {
                            if (i7 == jx0Var.U) {
                                z8Var.setText(org.telegram.messenger.gd.M0(2131743007, null));
                                break;
                            }
                        } else if (jx0Var.K != -1) {
                            z8Var.setText(org.telegram.messenger.gd.M0(2131746676, null));
                            break;
                        } else {
                            z8Var.setText("");
                            break;
                        }
                    } else {
                        z8Var.setText(org.telegram.messenger.gd.M0(2131747709, null));
                        break;
                    }
                } else {
                    z8Var.setText(org.telegram.messenger.gd.M0(2131746443, null));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                String v10 = org.telegram.messenger.xs.v(j10, j3, false);
                i11 = ((org.telegram.ui.ActionBar.h2) jx0Var).currentAccount;
                SharedPreferences sharedPreferences2 = org.telegram.messenger.mp.u1(i11).g7;
                StringBuilder sb2 = new StringBuilder("color_");
                sb2.append(v10);
                int c16 = sharedPreferences2.contains(sb2.toString()) ? org.telegram.messenger.f3.c("color_", v10, sharedPreferences2, -16776961) : org.telegram.messenger.n5.z(j10) ? sharedPreferences2.getInt("GroupLed", -16776961) : sharedPreferences2.getInt("MessagesLed", -16776961);
                int i17 = 0;
                while (true) {
                    if (i17 < 9) {
                        if (org.telegram.ui.Cells.t8.f[i17] == c16) {
                            c16 = org.telegram.ui.Cells.t8.e[i17];
                        } else {
                            i17++;
                        }
                    }
                }
                t8Var.b(c16, org.telegram.messenger.gd.M0(2131747710, null), false);
                break;
            case 4:
                org.telegram.ui.Cells.i6 i6Var2 = (org.telegram.ui.Cells.i6) view;
                i12 = ((org.telegram.ui.ActionBar.h2) jx0Var).currentAccount;
                SharedPreferences sharedPreferences3 = org.telegram.messenger.mp.u1(i12).g7;
                int c17 = org.telegram.messenger.f3.c("popup_", org.telegram.messenger.xs.v(j10, j3, false), sharedPreferences3, 0);
                if (c17 == 0) {
                    c17 = sharedPreferences3.getInt(org.telegram.messenger.n5.z(j10) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                }
                if (i7 != jx0Var.N) {
                    if (i7 == jx0Var.O) {
                        i6Var2.c(org.telegram.messenger.gd.M0(2131746907, null), c17 == 2, false);
                        i6Var2.setTag(2);
                        break;
                    }
                } else {
                    i6Var2.c(org.telegram.messenger.gd.M0(2131746906, null), c17 == 1, true);
                    i6Var2.setTag(1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                if (org.telegram.messenger.n5.E(j10)) {
                    i14 = ((org.telegram.ui.ActionBar.h2) jx0Var).currentAccount;
                    O0 = org.telegram.messenger.mp.u1(i14).c2(Long.valueOf(j10));
                } else {
                    i13 = ((org.telegram.ui.ActionBar.h2) jx0Var).currentAccount;
                    O0 = org.telegram.messenger.mp.u1(i13).O0(Long.valueOf(-j10));
                }
                paVar.a(null, O0);
                break;
            case 6:
                org.telegram.ui.Cells.y6 y6Var = (org.telegram.ui.Cells.y6) view;
                boolean z10 = i7 > 0;
                r12 = i7 < jx0Var.a0 - 1;
                if (y6Var.c != z10 || y6Var.d != r12) {
                    y6Var.c = z10;
                    y6Var.d = r12;
                    int i18 = y6Var.b;
                    if (i18 != 0) {
                        y6Var.setBackgroundColor(i18);
                        break;
                    } else {
                        y6Var.setBackground(null);
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                i15 = ((org.telegram.ui.ActionBar.h2) jx0Var).currentAccount;
                SharedPreferences sharedPreferences4 = org.telegram.messenger.mp.u1(i15).g7;
                if (i7 != jx0Var.F) {
                    if (i7 != jx0Var.G) {
                        if (i7 == jx0Var.Q) {
                            String k10 = p5.c.k("stories_", org.telegram.messenger.xs.v(j10, j3, false));
                            if (jx0Var.b0 || (sharedPreferences4.contains("EnableAllStories") && sharedPreferences4.getBoolean("EnableAllStories", true))) {
                                r13 = true;
                            }
                            r8Var.f(org.telegram.messenger.gd.M0(2131744509, null), sharedPreferences4.getBoolean(k10, r13), true);
                            break;
                        }
                    } else {
                        String v11 = org.telegram.messenger.xs.v(j10, j3, false);
                        r8Var.f(org.telegram.messenger.gd.M0(2131748345, null), sharedPreferences4.getBoolean("content_preview_" + v11, true), true);
                        break;
                    }
                } else {
                    r8Var.f(org.telegram.messenger.gd.M0(2131747731, null), jx0Var.r, true);
                    break;
                }
                break;
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View n4Var;
        org.telegram.ui.ActionBar.i6 i6Var = this.d.e;
        Context context = this.c;
        switch (i7) {
            case 0:
                n4Var = new org.telegram.ui.Cells.n4(context, i6Var);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, n4Var, i6Var);
                break;
            case 1:
                n4Var = new org.telegram.ui.Cells.w9(0, context, i6Var);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, n4Var, i6Var);
                break;
            case 2:
                n4Var = new org.telegram.ui.Cells.z8(context, i6Var);
                break;
            case 3:
                n4Var = new org.telegram.ui.Cells.t8(context, i6Var);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, n4Var, i6Var);
                break;
            case 4:
                n4Var = new org.telegram.ui.Cells.i6(context, i6Var);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, n4Var, i6Var);
                break;
            case 5:
                n4Var = new org.telegram.ui.Cells.pa(context, i6Var);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, n4Var, i6Var);
                break;
            case 6:
                n4Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
                break;
            default:
                n4Var = new org.telegram.ui.Cells.r8(context, i6Var);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, n4Var, i6Var);
                break;
        }
        return i5.c.q(n4Var, n4Var, -1, -2);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        int i7 = f1Var.f;
        View view = f1Var.a;
        jx0 jx0Var = this.d;
        if (i7 == 0) {
            ((org.telegram.ui.Cells.n4) view).a(null, jx0Var.r);
            return;
        }
        if (i7 == 1) {
            org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
            if (f1Var.b() == jx0Var.Y) {
                w9Var.a(null, true);
                return;
            } else {
                w9Var.a(null, jx0Var.r);
                return;
            }
        }
        if (i7 == 2) {
            ((org.telegram.ui.Cells.z8) view).c(null, jx0Var.r);
            return;
        }
        if (i7 == 3) {
            ((org.telegram.ui.Cells.t8) view).a(null, jx0Var.r);
            return;
        }
        if (i7 == 4) {
            ((org.telegram.ui.Cells.i6) view).b(null, jx0Var.r);
            return;
        }
        if (i7 != 7) {
            return;
        }
        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
        if (f1Var.b() == jx0Var.G) {
            r8Var.e(null, jx0Var.r);
        } else if (f1Var.b() == jx0Var.Q) {
            r8Var.e(null, jx0Var.r);
        } else {
            r8Var.e(null, true);
        }
    }
}
