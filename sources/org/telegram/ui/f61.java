package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class f61 extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public boolean d = true;
    public final /* synthetic */ ThemeActivity e;

    public f61(ThemeActivity themeActivity, Context context) {
        this.e = themeActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 0 || i7 == 1 || i7 == 4 || i7 == 7 || i7 == 10 || i7 == 11 || i7 == 12 || i7 == 14 || i7 == 18 || i7 == 20 || i7 == 21;
    }

    @Override // v4.g0
    public final int b() {
        return this.e.J0;
    }

    @Override // v4.g0
    public final int d(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        ThemeActivity themeActivity = this.e;
        if (i7 == themeActivity.a0 || i7 == themeActivity.K || i7 == themeActivity.b0 || i7 == themeActivity.Y || i7 == themeActivity.P || i7 == themeActivity.Q || i7 == themeActivity.M || i7 == themeActivity.L) {
            return 1;
        }
        if (i7 == themeActivity.f0 || i7 == themeActivity.Z || i7 == themeActivity.v0 || i7 == themeActivity.A0 || i7 == themeActivity.G0) {
            return 2;
        }
        if (i7 == themeActivity.r0 || i7 == themeActivity.V || i7 == themeActivity.c0 || i7 == themeActivity.O || i7 == themeActivity.h0 || i7 == themeActivity.n0 || i7 == themeActivity.k0 || i7 == themeActivity.J || i7 == themeActivity.I0 || i7 == themeActivity.z0 || i7 == themeActivity.B0 || i7 == themeActivity.C0 || i7 == themeActivity.D0) {
            return 3;
        }
        if (i7 == themeActivity.R || i7 == themeActivity.S || i7 == themeActivity.T || i7 == themeActivity.U) {
            return 4;
        }
        if (i7 == themeActivity.W || i7 == themeActivity.d0 || i7 == themeActivity.g0 || i7 == themeActivity.y || i7 == themeActivity.i0 || i7 == themeActivity.x || i7 == themeActivity.l0 || i7 == themeActivity.j0 || i7 == themeActivity.t0 || i7 == themeActivity.w0 || i7 == themeActivity.H0 || i7 == themeActivity.E0 || i7 == themeActivity.F0) {
            return 5;
        }
        if (i7 == themeActivity.e0) {
            return 6;
        }
        if (i7 == themeActivity.X || i7 == themeActivity.G || i7 == themeActivity.E) {
            return 7;
        }
        i10 = themeActivity.raiseToListenRow;
        if (i7 == i10) {
            return 7;
        }
        i11 = themeActivity.pauseOnRecordRow;
        if (i7 == i11 || i7 == themeActivity.D || i7 == themeActivity.s0) {
            return 7;
        }
        i12 = themeActivity.pauseOnMediaRow;
        if (i7 == i12 || i7 == themeActivity.F) {
            return 7;
        }
        i13 = themeActivity.sensitiveContentRow;
        if (i7 == i13) {
            return 7;
        }
        i14 = themeActivity.textSizeRow;
        if (i7 == i14) {
            return 8;
        }
        if (i7 == themeActivity.m0) {
            return 9;
        }
        i15 = themeActivity.nightThemeRow;
        if (i7 == i15) {
            return 10;
        }
        i16 = themeActivity.browserRow;
        if (i7 == i16) {
            return 10;
        }
        if (i7 == themeActivity.o0) {
            return 11;
        }
        if (i7 == themeActivity.q0) {
            return 12;
        }
        i17 = themeActivity.bubbleRadiusRow;
        if (i7 == i17) {
            return 13;
        }
        i18 = themeActivity.backgroundRow;
        if (i7 == i18 || i7 == themeActivity.y0) {
            return 14;
        }
        i19 = themeActivity.createNewThemeRow;
        if (i7 == i19) {
            return 14;
        }
        i20 = themeActivity.liteModeRow;
        if (i7 == i20) {
            return 14;
        }
        i21 = themeActivity.stickersRow;
        if (i7 == i21) {
            return 14;
        }
        if (i7 == themeActivity.u0) {
            return 15;
        }
        if (i7 == themeActivity.x0) {
            return 16;
        }
        if (i7 == themeActivity.p0) {
            return 17;
        }
        if (i7 == themeActivity.H || i7 == themeActivity.I) {
            return 19;
        }
        i22 = themeActivity.appIconSelectorRow;
        if (i7 == i22) {
            return 20;
        }
        i23 = themeActivity.changeUserColor;
        return i7 == i23 ? 21 : 1;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22 = d1Var.f;
        View view = d1Var.a;
        ThemeActivity themeActivity = this.e;
        if (i22 == 1) {
            org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
            i10 = themeActivity.nightThemeRow;
            if (i7 == i10) {
                if (org.telegram.ui.ActionBar.k6.o == 0 || org.telegram.ui.ActionBar.k6.J == null) {
                    w9Var.c(org.telegram.messenger.id.M0(2131753784, null), org.telegram.messenger.id.M0(2131753783, null), false, false);
                    return;
                } else {
                    w9Var.c(org.telegram.messenger.id.M0(2131753784, null), org.telegram.ui.ActionBar.k6.C0(), false, false);
                    return;
                }
            }
            if (i7 == themeActivity.a0) {
                int i23 = org.telegram.ui.ActionBar.k6.r;
                int i24 = i23 / 60;
                w9Var.c(org.telegram.messenger.id.M0(2131753792, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i24), Integer.valueOf(i23 - (i24 * 60))), false, true);
                return;
            }
            if (i7 == themeActivity.b0) {
                int i25 = org.telegram.ui.ActionBar.k6.s;
                int i26 = i25 / 60;
                w9Var.c(org.telegram.messenger.id.M0(2131753782, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i26), Integer.valueOf(i25 - (i26 * 60))), false, false);
                return;
            }
            if (i7 == themeActivity.Y) {
                w9Var.c(org.telegram.messenger.id.M0(2131753781, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.k6.w, false, false);
                return;
            }
            if (i7 == themeActivity.Q) {
                int i27 = org.telegram.messenger.qp.e1().getInt("sortContactsBy", 0);
                w9Var.c(org.telegram.messenger.id.M0(2131745294, "SortBy"), i27 == 0 ? org.telegram.messenger.id.M0(2131751601, "Default") : i27 == 1 ? org.telegram.messenger.id.M0(2131745290, "FirstName") : org.telegram.messenger.id.M0(2131745289, "LastName"), false, true);
                return;
            }
            if (i7 == themeActivity.P) {
                w9Var.b(org.telegram.messenger.id.M0(2131749265, "ImportContacts"), true);
                return;
            }
            if (i7 == themeActivity.K) {
                int i28 = org.telegram.messenger.iz.s1;
                w9Var.c(org.telegram.messenger.id.M0(2131751368, "DistanceUnits"), i28 == 0 ? org.telegram.messenger.id.M0(2131751367, "DistanceUnitsAutomatic") : i28 == 1 ? org.telegram.messenger.id.M0(2131751366, "DistanceUnitsKilometers") : org.telegram.messenger.id.M0(2131751365, "DistanceUnitsMiles"), themeActivity.O0, themeActivity.D0 >= 0);
                themeActivity.O0 = false;
                return;
            } else if (i7 == themeActivity.L) {
                w9Var.c(org.telegram.messenger.id.M0(2131745802, null), org.telegram.ui.web.f1.a().a, themeActivity.P0, false);
                return;
            } else {
                if (i7 == themeActivity.M) {
                    w9Var.c(org.telegram.messenger.id.M0(2131748440, null), org.telegram.messenger.id.M0(org.telegram.messenger.iz.u0 ? 2131748438 : 2131748439, null), themeActivity.N0, false);
                    themeActivity.N0 = false;
                    return;
                }
                return;
            }
        }
        if (i22 == 2) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            z8Var.setFixedSize(0);
            if (i7 == themeActivity.f0) {
                z8Var.setText(org.telegram.messenger.id.a0("AutoNightBrightnessInfo", null, 2131753794, Integer.valueOf((int) (org.telegram.ui.ActionBar.k6.q * 100.0f))));
                return;
            }
            if (i7 == themeActivity.Z) {
                z8Var.setText(ThemeActivity.D0());
                return;
            }
            if (i7 == themeActivity.v0) {
                z8Var.setText(org.telegram.messenger.id.M0(2131752221, "ChatListSwipeGestureInfo"));
                return;
            } else if (i7 == themeActivity.G0) {
                z8Var.setText(org.telegram.messenger.id.M0(2131748866, "LiteModeInfo"));
                return;
            } else {
                z8Var.setFixedSize(12);
                z8Var.setText("");
                return;
            }
        }
        if (i22 == 4) {
            org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
            if (i7 == themeActivity.R) {
                aaVar.a(org.telegram.messenger.id.M0(2131753793, "AutoNightDisabled"), org.telegram.ui.ActionBar.k6.o == 0, true);
                return;
            }
            if (i7 == themeActivity.S) {
                aaVar.a(org.telegram.messenger.id.M0(2131753787, "AutoNightScheduled"), org.telegram.ui.ActionBar.k6.o == 1, true);
                return;
            } else if (i7 == themeActivity.T) {
                aaVar.a(org.telegram.messenger.id.M0(2131753796, "AutoNightAdaptive"), org.telegram.ui.ActionBar.k6.o == 2, themeActivity.U != -1);
                return;
            } else {
                if (i7 == themeActivity.U) {
                    aaVar.a(org.telegram.messenger.id.M0(2131753786, "AutoNightSystemDefault"), org.telegram.ui.ActionBar.k6.o == 3, false);
                    return;
                }
                return;
            }
        }
        if (i22 == 5) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (i7 == themeActivity.W) {
                n4Var.setText(org.telegram.messenger.id.M0(2131753788, "AutoNightSchedule"));
                return;
            }
            if (i7 == themeActivity.d0) {
                n4Var.setText(org.telegram.messenger.id.M0(2131753795, "AutoNightBrightness"));
                return;
            }
            if (i7 == themeActivity.g0) {
                n4Var.setText(org.telegram.messenger.id.M0(2131753789, "AutoNightPreferred"));
                return;
            }
            if (i7 == themeActivity.y) {
                n4Var.setText(org.telegram.messenger.id.M0(2131745986, "SETTINGS"));
                return;
            }
            if (i7 == themeActivity.i0) {
                if (themeActivity.f == 3) {
                    n4Var.setText(org.telegram.messenger.id.M0(2131752839, "BuildMyOwnTheme"));
                    return;
                } else {
                    n4Var.setText(org.telegram.messenger.id.M0(2131752011, "ColorTheme"));
                    return;
                }
            }
            if (i7 == themeActivity.x) {
                n4Var.setText(org.telegram.messenger.id.M0(2131744194, "TextSizeHeader"));
                return;
            }
            if (i7 == themeActivity.l0) {
                n4Var.setText(org.telegram.messenger.id.M0(2131752225, "ChatList"));
                return;
            }
            if (i7 == themeActivity.j0) {
                n4Var.setText(org.telegram.messenger.id.M0(2131752840, "BubbleRadius"));
                return;
            }
            if (i7 == themeActivity.t0) {
                n4Var.setText(org.telegram.messenger.id.M0(2131752222, "ChatListSwipeGesture"));
                return;
            }
            if (i7 == themeActivity.w0) {
                n4Var.setText(org.telegram.messenger.id.M0(2131745654, "SelectTheme"));
                return;
            }
            if (i7 == themeActivity.H0) {
                n4Var.setText(org.telegram.messenger.id.M0(2131754240, null));
                return;
            } else if (i7 == themeActivity.F0) {
                n4Var.setText(org.telegram.messenger.id.M0(2131747766, "OtherSettings"));
                return;
            } else {
                if (i7 == themeActivity.E0) {
                    n4Var.setText(org.telegram.messenger.id.M0(2131748661, "MediaAndSoundSettings"));
                    return;
                }
                return;
            }
        }
        if (i22 == 6) {
            ((org.telegram.ui.Cells.i0) view).setProgress(org.telegram.ui.ActionBar.k6.q);
            return;
        }
        if (i22 == 7) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            if (i7 == themeActivity.X) {
                r8Var.f(org.telegram.messenger.id.M0(2131753791, "AutoNightLocation"), org.telegram.ui.ActionBar.k6.p, true);
                return;
            }
            if (i7 == themeActivity.N) {
                r8Var.f(org.telegram.messenger.id.M0(2131751158, "EnableAnimations"), org.telegram.messenger.qp.e1().getBoolean("view_animations", true), true);
                return;
            }
            if (i7 == themeActivity.G) {
                r8Var.f(org.telegram.messenger.id.M0(2131745635, "SendByEnter"), org.telegram.messenger.qp.e1().getBoolean("send_by_enter", false), true);
                return;
            }
            if (i7 == themeActivity.E) {
                r8Var.g(org.telegram.messenger.id.M0(2131746426, "RaiseToSpeak"), org.telegram.messenger.id.M0(2131746425, "RaiseToSpeakInfo"), org.telegram.messenger.iz.r0, true, true);
                return;
            }
            i11 = themeActivity.raiseToListenRow;
            if (i7 == i11) {
                r8Var.g(org.telegram.messenger.id.M0(2131746428, "RaiseToListen"), org.telegram.messenger.id.M0(2131746427, "RaiseToListenInfo"), org.telegram.messenger.iz.s0, true, true);
                return;
            }
            if (i7 == themeActivity.F) {
                r8Var.g(org.telegram.messenger.id.M0(2131748250, "NextMediaTap"), org.telegram.messenger.id.M0(2131748249, "NextMediaTapInfo"), org.telegram.messenger.iz.t0, true, true);
                return;
            }
            i12 = themeActivity.pauseOnRecordRow;
            if (i7 == i12) {
                r8Var.g(org.telegram.messenger.id.M0(2131747432, null), org.telegram.messenger.id.M0(2131747431, "PauseMusicOnRecordInfo"), org.telegram.messenger.iz.F0, true, true);
                return;
            }
            i13 = themeActivity.pauseOnMediaRow;
            if (i7 == i13) {
                r8Var.f(org.telegram.messenger.id.M0(2131747433, null), org.telegram.messenger.iz.G0, true);
                return;
            }
            if (i7 == themeActivity.D) {
                r8Var.g(org.telegram.messenger.id.M0(2131751439, "DirectShare"), org.telegram.messenger.id.M0(2131751438, "DirectShareInfo"), org.telegram.messenger.iz.x0, false, true);
                return;
            }
            i14 = themeActivity.sensitiveContentRow;
            if (i7 == i14) {
                r8Var.g(org.telegram.messenger.id.M0(2131745333, null), org.telegram.messenger.id.M0(2131745332, null), themeActivity.getMessagesController().S4(), true, true);
                return;
            } else {
                if (i7 == themeActivity.s0) {
                    r8Var.f(org.telegram.messenger.id.M0(2131753675, "BlurInChat"), org.telegram.messenger.iz.f(), true);
                    return;
                }
                return;
            }
        }
        if (i22 == 14) {
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            m8Var.w = 48;
            i15 = themeActivity.backgroundRow;
            if (i7 == i15) {
                m8Var.setSubtitle(null);
                int i29 = org.telegram.ui.ActionBar.k6.q6;
                m8Var.g(i29, i29);
                String M0 = org.telegram.messenger.id.M0(2131752550, null);
                i19 = themeActivity.changeUserColor;
                m8Var.o(R.drawable.msg_background, M0, i19 >= 0);
                return;
            }
            if (i7 == themeActivity.y0) {
                m8Var.setSubtitle(null);
                int i30 = org.telegram.ui.ActionBar.k6.q6;
                m8Var.g(i30, i30);
                m8Var.o(R.drawable.msg_theme, org.telegram.messenger.id.M0(2131751282, null), true);
                return;
            }
            i16 = themeActivity.createNewThemeRow;
            if (i7 == i16) {
                m8Var.setSubtitle(null);
                int i31 = org.telegram.ui.ActionBar.k6.q6;
                m8Var.g(i31, i31);
                m8Var.o(R.drawable.msg_colors, org.telegram.messenger.id.M0(2131751713, null), false);
                return;
            }
            i17 = themeActivity.liteModeRow;
            if (i7 == i17) {
                m8Var.g(org.telegram.ui.ActionBar.k6.J5, org.telegram.ui.ActionBar.k6.G6);
                m8Var.o(R.drawable.msg2_animations, org.telegram.messenger.id.M0(2131748867, null), true);
                m8Var.setSubtitle(org.telegram.messenger.id.M0(2131748866, null));
                m8Var.w = 60;
                m8Var.s = 64;
                m8Var.x = 20;
                return;
            }
            i18 = themeActivity.stickersRow;
            if (i7 == i18) {
                m8Var.g(org.telegram.ui.ActionBar.k6.J5, org.telegram.ui.ActionBar.k6.G6);
                m8Var.o(R.drawable.msg2_sticker, org.telegram.messenger.id.M0(2131744860, null), false);
                m8Var.setSubtitle(org.telegram.messenger.id.M0(2131744859, null));
                m8Var.s = 64;
                m8Var.w = 60;
                m8Var.x = 20;
                return;
            }
            return;
        }
        if (i22 == 17) {
            ((tt) view).a();
            return;
        }
        if (i22 == 19) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (i7 == themeActivity.H) {
                h6Var.b("save media only from peer chats", "", true, false);
                return;
            } else {
                h6Var.b("save media from all chats", "", true, false);
                return;
            }
        }
        if (i22 == 21) {
            ((nl0) view).set(themeActivity.getUserConfig().f());
            return;
        }
        switch (i22) {
            case 10:
                org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
                i20 = themeActivity.nightThemeRow;
                if (i7 != i20) {
                    i21 = themeActivity.browserRow;
                    if (i7 == i21) {
                        h5Var.b(org.telegram.messenger.id.M0(2131749210, null), org.telegram.messenger.id.M0(2131749209, null), R.drawable.msg2_language, themeActivity.getMessagesController().M2(), 0, false, true, false);
                        break;
                    }
                } else {
                    boolean z9 = org.telegram.ui.ActionBar.k6.o != 0;
                    String C0 = z9 ? org.telegram.ui.ActionBar.k6.C0() : org.telegram.messenger.id.M0(2131753783, "AutoNightThemeOff");
                    if (z9) {
                        int i32 = org.telegram.ui.ActionBar.k6.o;
                        C0 = a8.p0.D(i32 == 1 ? org.telegram.messenger.id.M0(2131753787, "AutoNightScheduled") : i32 == 3 ? org.telegram.messenger.id.M0(2131753786, "AutoNightSystemDefault") : org.telegram.messenger.id.M0(2131753796, "AutoNightAdaptive"), " ", C0);
                    }
                    h5Var.b(org.telegram.messenger.id.M0(2131753784, "AutoNightTheme"), C0, R.drawable.menu_night_mode_24, z9, 0, false, true, false);
                    break;
                }
                break;
            case 11:
                if (this.d) {
                    themeActivity.c.A1(themeActivity.b.getMeasuredWidth());
                    this.d = false;
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.pj0 pj0Var = (org.telegram.ui.Components.pj0) view;
                h61 h61Var = (h61) pj0Var.getAdapter();
                h61Var.f();
                int indexOf = h61Var.e.indexOf(h61Var.d.k(false));
                if (indexOf == -1) {
                    indexOf = h61Var.b() - 1;
                }
                if (indexOf != -1) {
                    ((v4.b0) pj0Var.getLayoutManager()).h1(indexOf, (themeActivity.b.getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(42.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, org.telegram.ui.Cells.aa] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object, org.telegram.ui.c61] */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        ?? aaVar;
        View view;
        int i10;
        org.telegram.ui.ActionBar.q4 q4Var;
        int i11;
        int i12;
        int i13 = 1;
        org.telegram.ui.ActionBar.f6 f6Var = null;
        int i14 = 0;
        ThemeActivity themeActivity = this.e;
        Context context = this.c;
        switch (i7) {
            case 1:
                view = new org.telegram.ui.Cells.w9(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.z8(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 4:
                aaVar = new org.telegram.ui.Cells.aa(context);
                aaVar.setWillNotDraw(false);
                TextView textView = new TextView(context);
                aaVar.a = textView;
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
                org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 16);
                boolean z9 = org.telegram.messenger.id.a0;
                aaVar.addView(textView, c8.ha.d(-1, -1.0f, (z9 ? 5 : 3) | 48, z9 ? 71.0f : 21.0f, 0.0f, z9 ? 21.0f : 23.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                aaVar.b = imageView;
                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Ai, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(R.drawable.sticker_added);
                aaVar.addView(imageView, c8.ha.d(19, 14.0f, (org.telegram.messenger.id.a0 ? 3 : 5) | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                view = aaVar;
                break;
            case 5:
                view = new org.telegram.ui.Cells.n4(context);
                break;
            case 6:
                view = new b61(this, context);
                break;
            case 7:
                view = new org.telegram.ui.Cells.r8(context);
                break;
            case 8:
                view = new g61(themeActivity, context);
                break;
            case 9:
                aaVar = new c61(context, 0);
                aaVar.b = new org.telegram.ui.Cells.v0[2];
                aaVar.setOrientation(0);
                aaVar.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(21.0f), 0);
                int i15 = 0;
                while (true) {
                    org.telegram.ui.Cells.v0[] v0VarArr = (org.telegram.ui.Cells.v0[]) aaVar.b;
                    if (i15 >= v0VarArr.length) {
                        view = aaVar;
                        break;
                    } else {
                        boolean z10 = i15 == 1;
                        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, 0);
                        v0Var.b = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        v0Var.e = textPaint;
                        v0Var.setWillNotDraw(false);
                        v0Var.c = z10;
                        v0Var.setContentDescription(org.telegram.messenger.id.M0(z10 ? 2131752223 : 2131752224, null));
                        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                        org.telegram.ui.Cells.u0 u0Var = new org.telegram.ui.Cells.u0(v0Var, context);
                        v0Var.d = u0Var;
                        u0Var.setSize(org.telegram.messenger.g0.L(20.0f));
                        v0Var.addView(u0Var, c8.ha.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        u0Var.a((z10 && org.telegram.messenger.iz.p1) || !(z10 || org.telegram.messenger.iz.p1), false);
                        v0VarArr[i15] = v0Var;
                        aaVar.addView(((org.telegram.ui.Cells.v0[]) aaVar.b)[i15], c8.ha.m(0.5f, -1, -1, i15 == 1 ? 10 : 0, 0, 0));
                        ((org.telegram.ui.Cells.v0[]) aaVar.b)[i15].setOnClickListener(new di.a2(r0, aaVar, z10));
                        i15++;
                    }
                }
                break;
            case 10:
                view = new org.telegram.ui.Cells.h5(this.c, 21, 60, true, null);
                break;
            case 11:
                this.d = true;
                d61 d61Var = new d61(this, this.c, themeActivity, themeActivity.f, themeActivity.e, themeActivity.d);
                themeActivity.c = d61Var;
                d61Var.setDrawDivider(themeActivity.w);
                themeActivity.c.setFocusable(false);
                View view2 = themeActivity.c;
                view2.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(148.0f)));
                view = view2;
                break;
            case 12:
                e61 e61Var = new e61(i14, context, f6Var);
                e61Var.setFocusable(false);
                e61Var.setItemAnimator(null);
                e61Var.setLayoutAnimation(null);
                e61Var.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
                e61Var.setClipToPadding(false);
                v4.b0 b0Var = new v4.b0();
                b0Var.j1(0);
                e61Var.setLayoutManager(b0Var);
                h61 h61Var = new h61(themeActivity, context);
                e61Var.setAdapter(h61Var);
                e61Var.setOnItemClickListener(new z51(this, h61Var, e61Var, i14));
                e61Var.setOnItemLongClickListener(new lk0(17, this, h61Var));
                e61Var.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(62.0f)));
                view = e61Var;
                break;
            case 13:
                view = new w51(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                view = new org.telegram.ui.Cells.m8(context);
                break;
            case 15:
                i10 = ((org.telegram.ui.ActionBar.f2) themeActivity).currentAccount;
                view = new org.telegram.ui.Components.uw0(context, i10);
                break;
            case 16:
                q4Var = ((org.telegram.ui.ActionBar.f2) themeActivity).parentLayout;
                View wl0Var = new wl0(context, q4Var, 0);
                wl0Var.setImportantForAccessibility(4);
                view = wl0Var;
                break;
            case 17:
                View ttVar = new tt(themeActivity.f, context, themeActivity);
                ttVar.setFocusable(false);
                ttVar.setLayoutParams(new v4.o0(-1, -2));
                view = ttVar;
                break;
            case 19:
                view = new org.telegram.ui.Cells.h6(context, false);
                break;
            case 20:
                i11 = ((org.telegram.ui.ActionBar.f2) themeActivity).currentAccount;
                org.telegram.ui.Cells.t tVar = new org.telegram.ui.Cells.t(context, null);
                tVar.e3 = new ArrayList();
                tVar.g3 = i11;
                tVar.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
                tVar.setFocusable(false);
                tVar.setItemAnimator(null);
                tVar.setLayoutAnimation(null);
                v4.b0 b0Var2 = new v4.b0(0, false);
                tVar.f3 = b0Var2;
                tVar.setLayoutManager(b0Var2);
                tVar.setAdapter(new x7(tVar, i13));
                tVar.i(new fi.o1(tVar, i13));
                tVar.setOnItemClickListener(new di.f0(tVar, themeActivity, context, r0));
                tVar.z1();
                view = tVar;
                break;
            case 21:
                i12 = ((org.telegram.ui.ActionBar.f2) themeActivity).currentAccount;
                view = new nl0(i12, 0L, this.c, themeActivity.getResourceProvider());
                break;
        }
        return new org.telegram.ui.Components.xi0(view);
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
        if (d1Var.f == 4) {
            ((org.telegram.ui.Cells.aa) d1Var.a).setTypeChecked(d1Var.b() == org.telegram.ui.ActionBar.k6.o);
        }
    }
}
