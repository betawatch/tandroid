package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class hx0 extends org.telegram.ui.Components.dk0 {
    public final Context c;
    public final /* synthetic */ jx0 d;

    public hx0(jx0 jx0Var, Context context) {
        this.d = jx0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
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
        org.telegram.ui.ActionBar.h6 h6Var = jx0Var.e;
        long j3 = jx0Var.h;
        long j10 = jx0Var.f;
        int i16 = f1Var.f;
        View view = f1Var.a;
        switch (i16) {
            case 0:
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                if (i7 != jx0Var.x) {
                    if (i7 != jx0Var.M) {
                        if (i7 != jx0Var.V) {
                            if (i7 == jx0Var.R) {
                                o4Var.setText(org.telegram.messenger.hd.N0(2131743034, null));
                                break;
                            }
                        } else {
                            o4Var.setText(org.telegram.messenger.hd.N0(2131747710, null));
                            break;
                        }
                    } else {
                        o4Var.setText(org.telegram.messenger.hd.N0(2131746443, null));
                        break;
                    }
                } else {
                    o4Var.setText(org.telegram.messenger.hd.N0(2131750457, null));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                String v = org.telegram.messenger.ys.v(j10, j3, false);
                i10 = ((org.telegram.ui.ActionBar.g2) jx0Var).currentAccount;
                SharedPreferences sharedPreferences = org.telegram.messenger.np.u1(i10).g7;
                if (i7 != jx0Var.Y) {
                    org.telegram.ui.ActionBar.t6.U(x9Var.getTextView(), org.telegram.ui.ActionBar.m6.G6, h6Var);
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
                                                            x9Var.c(org.telegram.messenger.hd.N0(2131743369, null), org.telegram.messenger.hd.N0(2131748530, null), false, true);
                                                            break;
                                                        }
                                                    } else {
                                                        x9Var.c(org.telegram.messenger.hd.N0(2131743369, null), org.telegram.messenger.hd.N0(2131743367, null), false, true);
                                                        break;
                                                    }
                                                } else {
                                                    x9Var.c(org.telegram.messenger.hd.N0(2131743369, null), org.telegram.messenger.hd.N0(2131745170, null), false, true);
                                                    break;
                                                }
                                            } else {
                                                x9Var.c(org.telegram.messenger.hd.N0(2131743369, null), org.telegram.messenger.hd.N0(2131743368, null), false, true);
                                                break;
                                            }
                                        }
                                    } else {
                                        int c11 = org.telegram.messenger.f3.c("smart_max_count_", v, sharedPreferences, 2);
                                        int c12 = org.telegram.messenger.f3.c("smart_delay_", v, sharedPreferences, org.telegram.messenger.ls.K2);
                                        if (c11 != 0) {
                                            x9Var.c(org.telegram.messenger.hd.N0(2131745104, null), org.telegram.messenger.hd.a0("SmartNotificationsInfo", null, 2131745102, Integer.valueOf(c11), org.telegram.messenger.hd.G(c12 / 60, "Minutes", new Object[0])), false, jx0Var.K != -1);
                                            break;
                                        } else {
                                            x9Var.c(org.telegram.messenger.hd.N0(2131745104, null), org.telegram.messenger.hd.N0(2131745103, null), false, jx0Var.K != -1);
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
                                                        x9Var.c(org.telegram.messenger.hd.N0(2131747712, null), org.telegram.messenger.hd.N0(2131747687, null), false, false);
                                                        break;
                                                    }
                                                } else {
                                                    x9Var.c(org.telegram.messenger.hd.N0(2131747712, null), org.telegram.messenger.hd.N0(2131747688, null), false, false);
                                                    break;
                                                }
                                            } else {
                                                x9Var.c(org.telegram.messenger.hd.N0(2131747712, null), org.telegram.messenger.hd.N0(2131747686, null), false, false);
                                                break;
                                            }
                                        } else {
                                            x9Var.c(org.telegram.messenger.hd.N0(2131747712, null), org.telegram.messenger.hd.N0(2131747685, null), false, false);
                                            break;
                                        }
                                    } else {
                                        x9Var.c(org.telegram.messenger.hd.N0(2131747712, null), org.telegram.messenger.hd.N0(2131747689, null), false, false);
                                        break;
                                    }
                                }
                            } else {
                                int c14 = org.telegram.messenger.f3.c("vibrate_", v, sharedPreferences, 0);
                                if (c14 != 0 && c14 != 4) {
                                    if (c14 != 1) {
                                        if (c14 != 2) {
                                            if (c14 == 3) {
                                                String N0 = org.telegram.messenger.hd.N0(2131743369, null);
                                                String N02 = org.telegram.messenger.hd.N0(2131748530, null);
                                                if (jx0Var.J == -1 && jx0Var.K == -1) {
                                                    r12 = false;
                                                }
                                                x9Var.c(N0, N02, false, r12);
                                                break;
                                            }
                                        } else {
                                            String N03 = org.telegram.messenger.hd.N0(2131743369, null);
                                            String N04 = org.telegram.messenger.hd.N0(2131743367, null);
                                            if (jx0Var.J == -1 && jx0Var.K == -1) {
                                                r12 = false;
                                            }
                                            x9Var.c(N03, N04, false, r12);
                                            break;
                                        }
                                    } else {
                                        String N05 = org.telegram.messenger.hd.N0(2131743369, null);
                                        String N06 = org.telegram.messenger.hd.N0(2131745170, null);
                                        if (jx0Var.J == -1 && jx0Var.K == -1) {
                                            r12 = false;
                                        }
                                        x9Var.c(N05, N06, false, r12);
                                        break;
                                    }
                                } else {
                                    String N07 = org.telegram.messenger.hd.N0(2131743369, null);
                                    String N08 = org.telegram.messenger.hd.N0(2131743368, null);
                                    if (jx0Var.J == -1 && jx0Var.K == -1) {
                                        r12 = false;
                                    }
                                    x9Var.c(N07, N08, false, r12);
                                    break;
                                }
                            }
                        } else {
                            String string = sharedPreferences.getString(p5.c.k("ringtone_", v), org.telegram.messenger.hd.N0(2131751587, null));
                            if (string.equals("NoSound")) {
                                string = org.telegram.messenger.hd.N0(2131747958, null);
                            }
                            x9Var.c(org.telegram.messenger.hd.N0(2131742996, null), string, false, false);
                            break;
                        }
                    } else {
                        String string2 = sharedPreferences.getString(p5.c.k("sound_", v), org.telegram.messenger.hd.N0(2131745084, null));
                        long j11 = sharedPreferences.getLong("sound_document_id_" + v, 0L);
                        if (j11 != 0) {
                            TLRPC.Document c15 = jx0Var.getMediaDataController().A0.c(j11);
                            string2 = c15 == null ? org.telegram.messenger.hd.N0(2131751667, null) : yh0.g0(c15, c15.file_name_fixed);
                        } else if (string2.equals("NoSound")) {
                            string2 = org.telegram.messenger.hd.N0(2131747958, null);
                        } else if (string2.equals("Default")) {
                            string2 = org.telegram.messenger.hd.N0(2131745084, null);
                        }
                        x9Var.c(org.telegram.messenger.hd.N0(2131745087, null), string2, false, true);
                        break;
                    }
                } else {
                    x9Var.b(org.telegram.messenger.hd.N0(2131745908, null), false);
                    org.telegram.ui.ActionBar.t6.U(x9Var.getTextView(), org.telegram.ui.ActionBar.m6.q7, h6Var);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                a9Var.setFixedSize(0);
                if (i7 != jx0Var.P) {
                    if (i7 != jx0Var.X) {
                        if (i7 != jx0Var.L) {
                            if (i7 == jx0Var.U) {
                                a9Var.setText(org.telegram.messenger.hd.N0(2131742999, null));
                                break;
                            }
                        } else if (jx0Var.K != -1) {
                            a9Var.setText(org.telegram.messenger.hd.N0(2131746675, null));
                            break;
                        } else {
                            a9Var.setText("");
                            break;
                        }
                    } else {
                        a9Var.setText(org.telegram.messenger.hd.N0(2131747708, null));
                        break;
                    }
                } else {
                    a9Var.setText(org.telegram.messenger.hd.N0(2131746442, null));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.u8 u8Var = (org.telegram.ui.Cells.u8) view;
                String v10 = org.telegram.messenger.ys.v(j10, j3, false);
                i11 = ((org.telegram.ui.ActionBar.g2) jx0Var).currentAccount;
                SharedPreferences sharedPreferences2 = org.telegram.messenger.np.u1(i11).g7;
                StringBuilder sb2 = new StringBuilder("color_");
                sb2.append(v10);
                int c16 = sharedPreferences2.contains(sb2.toString()) ? org.telegram.messenger.f3.c("color_", v10, sharedPreferences2, -16776961) : org.telegram.messenger.n5.z(j10) ? sharedPreferences2.getInt("GroupLed", -16776961) : sharedPreferences2.getInt("MessagesLed", -16776961);
                int i17 = 0;
                while (true) {
                    if (i17 < 9) {
                        if (org.telegram.ui.Cells.u8.f[i17] == c16) {
                            c16 = org.telegram.ui.Cells.u8.e[i17];
                        } else {
                            i17++;
                        }
                    }
                }
                u8Var.b(c16, org.telegram.messenger.hd.N0(2131747709, null), false);
                break;
            case 4:
                org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) view;
                i12 = ((org.telegram.ui.ActionBar.g2) jx0Var).currentAccount;
                SharedPreferences sharedPreferences3 = org.telegram.messenger.np.u1(i12).g7;
                int c17 = org.telegram.messenger.f3.c("popup_", org.telegram.messenger.ys.v(j10, j3, false), sharedPreferences3, 0);
                if (c17 == 0) {
                    c17 = sharedPreferences3.getInt(org.telegram.messenger.n5.z(j10) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                }
                if (i7 != jx0Var.N) {
                    if (i7 == jx0Var.O) {
                        j6Var.c(org.telegram.messenger.hd.N0(2131746906, null), c17 == 2, false);
                        j6Var.setTag(2);
                        break;
                    }
                } else {
                    j6Var.c(org.telegram.messenger.hd.N0(2131746905, null), c17 == 1, true);
                    j6Var.setTag(1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.qa qaVar = (org.telegram.ui.Cells.qa) view;
                if (org.telegram.messenger.n5.E(j10)) {
                    i14 = ((org.telegram.ui.ActionBar.g2) jx0Var).currentAccount;
                    O0 = org.telegram.messenger.np.u1(i14).c2(Long.valueOf(j10));
                } else {
                    i13 = ((org.telegram.ui.ActionBar.g2) jx0Var).currentAccount;
                    O0 = org.telegram.messenger.np.u1(i13).O0(Long.valueOf(-j10));
                }
                qaVar.a(null, O0);
                break;
            case 6:
                org.telegram.ui.Cells.z6 z6Var = (org.telegram.ui.Cells.z6) view;
                boolean z10 = i7 > 0;
                r12 = i7 < jx0Var.a0 - 1;
                if (z6Var.c != z10 || z6Var.d != r12) {
                    z6Var.c = z10;
                    z6Var.d = r12;
                    int i18 = z6Var.b;
                    if (i18 != 0) {
                        z6Var.setBackgroundColor(i18);
                        break;
                    } else {
                        z6Var.setBackground(null);
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                i15 = ((org.telegram.ui.ActionBar.g2) jx0Var).currentAccount;
                SharedPreferences sharedPreferences4 = org.telegram.messenger.np.u1(i15).g7;
                if (i7 != jx0Var.F) {
                    if (i7 != jx0Var.G) {
                        if (i7 == jx0Var.Q) {
                            String k10 = p5.c.k("stories_", org.telegram.messenger.ys.v(j10, j3, false));
                            if (jx0Var.b0 || (sharedPreferences4.contains("EnableAllStories") && sharedPreferences4.getBoolean("EnableAllStories", true))) {
                                r13 = true;
                            }
                            s8Var.f(org.telegram.messenger.hd.N0(2131744501, null), sharedPreferences4.getBoolean(k10, r13), true);
                            break;
                        }
                    } else {
                        String v11 = org.telegram.messenger.ys.v(j10, j3, false);
                        s8Var.f(org.telegram.messenger.hd.N0(2131748344, null), sharedPreferences4.getBoolean("content_preview_" + v11, true), true);
                        break;
                    }
                } else {
                    s8Var.f(org.telegram.messenger.hd.N0(2131747730, null), jx0Var.r, true);
                    break;
                }
                break;
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View o4Var;
        org.telegram.ui.ActionBar.h6 h6Var = this.d.e;
        Context context = this.c;
        switch (i7) {
            case 0:
                o4Var = new org.telegram.ui.Cells.o4(context, h6Var);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, o4Var, h6Var);
                break;
            case 1:
                o4Var = new org.telegram.ui.Cells.x9(0, context, h6Var);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, o4Var, h6Var);
                break;
            case 2:
                o4Var = new org.telegram.ui.Cells.a9(context, h6Var);
                break;
            case 3:
                o4Var = new org.telegram.ui.Cells.u8(context, h6Var);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, o4Var, h6Var);
                break;
            case 4:
                o4Var = new org.telegram.ui.Cells.j6(context, h6Var);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, o4Var, h6Var);
                break;
            case 5:
                o4Var = new org.telegram.ui.Cells.qa(context, h6Var);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, o4Var, h6Var);
                break;
            case 6:
                o4Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                break;
            default:
                o4Var = new org.telegram.ui.Cells.s8(context, h6Var);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, o4Var, h6Var);
                break;
        }
        return i5.c.q(o4Var, o4Var, -1, -2);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        int i7 = f1Var.f;
        View view = f1Var.a;
        jx0 jx0Var = this.d;
        if (i7 == 0) {
            ((org.telegram.ui.Cells.o4) view).a(null, jx0Var.r);
            return;
        }
        if (i7 == 1) {
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
            if (f1Var.b() == jx0Var.Y) {
                x9Var.a(null, true);
                return;
            } else {
                x9Var.a(null, jx0Var.r);
                return;
            }
        }
        if (i7 == 2) {
            ((org.telegram.ui.Cells.a9) view).c(null, jx0Var.r);
            return;
        }
        if (i7 == 3) {
            ((org.telegram.ui.Cells.u8) view).a(null, jx0Var.r);
            return;
        }
        if (i7 == 4) {
            ((org.telegram.ui.Cells.j6) view).b(null, jx0Var.r);
            return;
        }
        if (i7 != 7) {
            return;
        }
        org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
        if (f1Var.b() == jx0Var.G) {
            s8Var.e(null, jx0Var.r);
        } else if (f1Var.b() == jx0Var.Q) {
            s8Var.e(null, jx0Var.r);
        } else {
            s8Var.e(null, true);
        }
    }
}
