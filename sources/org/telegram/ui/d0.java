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
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class d0 extends n39 {
    public final Context c;
    public boolean d = true;
    public final /* synthetic */ ThemeActivity e;

    public d0(ThemeActivity themeActivity, Context context) {
        this.e = themeActivity;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return i == 0 || i == 1 || i == 4 || i == 7 || i == 10 || i == 11 || i == 12 || i == 14 || i == 18 || i == 20 || i == 21;
    }

    @Override // w39
    public final int b() {
        return this.e.L0;
    }

    @Override // w39
    public final int d(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ThemeActivity themeActivity = this.e;
        if (i == themeActivity.b0 || i == themeActivity.L || i == themeActivity.c0 || i == themeActivity.Z || i == themeActivity.Q || i == themeActivity.R || i == themeActivity.N || i == themeActivity.M) {
            return 1;
        }
        if (i == themeActivity.g0 || i == themeActivity.a0 || i == themeActivity.w0 || i == themeActivity.C0 || i == themeActivity.I0) {
            return 2;
        }
        if (i == themeActivity.s0 || i == themeActivity.W || i == themeActivity.d0 || i == themeActivity.P || i == themeActivity.i0 || i == themeActivity.o0 || i == themeActivity.l0 || i == themeActivity.K || i == themeActivity.K0 || i == themeActivity.A0 || i == themeActivity.D0 || i == themeActivity.E0 || i == themeActivity.F0) {
            return 3;
        }
        if (i == themeActivity.S || i == themeActivity.T || i == themeActivity.U || i == themeActivity.V) {
            return 4;
        }
        if (i == themeActivity.X || i == themeActivity.e0 || i == themeActivity.h0 || i == themeActivity.y || i == themeActivity.j0 || i == themeActivity.x || i == themeActivity.m0 || i == themeActivity.k0 || i == themeActivity.u0 || i == themeActivity.x0 || i == themeActivity.J0 || i == themeActivity.G0 || i == themeActivity.H0) {
            return 5;
        }
        if (i == themeActivity.f0) {
            return 6;
        }
        if (i == themeActivity.Y || i == themeActivity.H || i == themeActivity.F) {
            return 7;
        }
        i2 = themeActivity.raiseToListenRow;
        if (i == i2) {
            return 7;
        }
        i3 = themeActivity.pauseOnRecordRow;
        if (i == i3 || i == themeActivity.E || i == themeActivity.t0) {
            return 7;
        }
        i4 = themeActivity.pauseOnMediaRow;
        if (i == i4 || i == themeActivity.G) {
            return 7;
        }
        i5 = themeActivity.sensitiveContentRow;
        if (i == i5) {
            return 7;
        }
        i6 = themeActivity.textSizeRow;
        if (i == i6) {
            return 8;
        }
        if (i == themeActivity.n0) {
            return 9;
        }
        i7 = themeActivity.nightThemeRow;
        if (i == i7) {
            return 10;
        }
        i8 = themeActivity.browserRow;
        if (i == i8) {
            return 10;
        }
        if (i == themeActivity.p0) {
            return 11;
        }
        if (i == themeActivity.r0) {
            return 12;
        }
        i9 = themeActivity.bubbleRadiusRow;
        if (i == i9) {
            return 13;
        }
        i10 = themeActivity.backgroundRow;
        if (i == i10 || i == themeActivity.z0) {
            return 14;
        }
        i11 = themeActivity.createNewThemeRow;
        if (i == i11) {
            return 14;
        }
        i12 = themeActivity.liteModeRow;
        if (i == i12) {
            return 14;
        }
        i13 = themeActivity.stickersRow;
        if (i == i13 || i == themeActivity.B0) {
            return 14;
        }
        if (i == themeActivity.v0) {
            return 15;
        }
        if (i == themeActivity.y0) {
            return 16;
        }
        if (i == themeActivity.q0) {
            return 17;
        }
        if (i == themeActivity.I || i == themeActivity.J) {
            return 19;
        }
        i14 = themeActivity.appIconSelectorRow;
        if (i == i14) {
            return 20;
        }
        i15 = themeActivity.changeUserColor;
        return i == i15 ? 21 : 1;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = s49Var.f;
        View view = s49Var.a;
        ThemeActivity themeActivity = this.e;
        if (i14 == 1) {
            uib uibVar = (uib) view;
            i2 = themeActivity.nightThemeRow;
            if (i == i2) {
                if (bkb.o == 0 || bkb.J == null) {
                    uibVar.c(k96.M0(2131753781, null), k96.M0(2131753780, null), false, false);
                    return;
                } else {
                    uibVar.c(k96.M0(2131753781, null), bkb.A0(), false, false);
                    return;
                }
            }
            if (i == themeActivity.b0) {
                int i15 = bkb.r;
                int i16 = i15 / 60;
                uibVar.c(k96.M0(2131753789, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i16), Integer.valueOf(i15 - (i16 * 60))), false, true);
                return;
            }
            if (i == themeActivity.c0) {
                int i17 = bkb.s;
                int i18 = i17 / 60;
                uibVar.c(k96.M0(2131753779, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i18), Integer.valueOf(i17 - (i18 * 60))), false, false);
                return;
            }
            if (i == themeActivity.Z) {
                uibVar.c(k96.M0(2131753778, "AutoNightUpdateLocation"), bkb.w, false, false);
                return;
            }
            if (i == themeActivity.R) {
                int i19 = na7.c1().getInt("sortContactsBy", 0);
                uibVar.c(k96.M0(2131745099, "SortBy"), i19 == 0 ? k96.M0(2131751588, "Default") : i19 == 1 ? k96.M0(2131745095, "FirstName") : k96.M0(2131745094, "LastName"), false, true);
                return;
            }
            if (i == themeActivity.Q) {
                uibVar.b(k96.M0(2131749072, "ImportContacts"), true);
                return;
            }
            if (i == themeActivity.L) {
                int i20 = gba.p1;
                uibVar.c(k96.M0(2131751355, "DistanceUnits"), i20 == 0 ? k96.M0(2131751354, "DistanceUnitsAutomatic") : i20 == 1 ? k96.M0(2131751353, "DistanceUnitsKilometers") : k96.M0(2131751352, "DistanceUnitsMiles"), themeActivity.Q0, themeActivity.F0 >= 0);
                themeActivity.Q0 = false;
                return;
            } else if (i == themeActivity.M) {
                uibVar.c(k96.M0(2131745607, null), is9.a().a, themeActivity.R0, false);
                return;
            } else {
                if (i == themeActivity.N) {
                    uibVar.c(k96.M0(2131748247, null), k96.M0(gba.r0 ? 2131748245 : 2131748246, null), themeActivity.P0, false);
                    themeActivity.P0 = false;
                    return;
                }
                return;
            }
        }
        if (i14 == 2) {
            mhb mhbVar = (mhb) view;
            mhbVar.setFixedSize(0);
            if (i == themeActivity.g0) {
                mhbVar.setText(k96.a0("AutoNightBrightnessInfo", null, 2131753791, Integer.valueOf((int) (bkb.q * 100.0f))));
                return;
            }
            if (i == themeActivity.a0) {
                mhbVar.setText(ThemeActivity.w0());
                return;
            }
            if (i == themeActivity.w0) {
                mhbVar.setText(k96.M0(2131752209, "ChatListSwipeGestureInfo"));
                return;
            } else if (i == themeActivity.I0) {
                mhbVar.setText(k96.M0(2131748673, "LiteModeInfo"));
                return;
            } else {
                mhbVar.setFixedSize(12);
                mhbVar.setText("");
                return;
            }
        }
        if (i14 == 4) {
            bnb bnbVar = (bnb) view;
            if (i == themeActivity.S) {
                bnbVar.a(k96.M0(2131753790, "AutoNightDisabled"), bkb.o == 0, true);
                return;
            }
            if (i == themeActivity.T) {
                bnbVar.a(k96.M0(2131753784, "AutoNightScheduled"), bkb.o == 1, true);
                return;
            } else if (i == themeActivity.U) {
                bnbVar.a(k96.M0(2131753793, "AutoNightAdaptive"), bkb.o == 2, themeActivity.V != -1);
                return;
            } else {
                if (i == themeActivity.V) {
                    bnbVar.a(k96.M0(2131753783, "AutoNightSystemDefault"), bkb.o == 3, false);
                    return;
                }
                return;
            }
        }
        if (i14 == 5) {
            ld5 ld5Var = (ld5) view;
            if (i == themeActivity.X) {
                ld5Var.setText(k96.M0(2131753785, "AutoNightSchedule"));
                return;
            }
            if (i == themeActivity.e0) {
                ld5Var.setText(k96.M0(2131753792, "AutoNightBrightness"));
                return;
            }
            if (i == themeActivity.h0) {
                ld5Var.setText(k96.M0(2131753786, "AutoNightPreferred"));
                return;
            }
            if (i == themeActivity.y) {
                ld5Var.setText(k96.M0(2131745791, "SETTINGS"));
                return;
            }
            if (i == themeActivity.j0) {
                if (themeActivity.f == 3) {
                    ld5Var.setText(k96.M0(2131752827, "BuildMyOwnTheme"));
                    return;
                } else {
                    ld5Var.setText(k96.M0(2131751999, "ColorTheme"));
                    return;
                }
            }
            if (i == themeActivity.x) {
                ld5Var.setText(k96.M0(2131743950, "TextSizeHeader"));
                return;
            }
            if (i == themeActivity.m0) {
                ld5Var.setText(k96.M0(2131752213, "ChatList"));
                return;
            }
            if (i == themeActivity.k0) {
                ld5Var.setText(k96.M0(2131752828, "BubbleRadius"));
                return;
            }
            if (i == themeActivity.u0) {
                ld5Var.setText(k96.M0(2131752210, "ChatListSwipeGesture"));
                return;
            }
            if (i == themeActivity.x0) {
                ld5Var.setText(k96.M0(2131745459, "SelectTheme"));
                return;
            }
            if (i == themeActivity.J0) {
                ld5Var.setText(k96.M0(2131754237, null));
                return;
            } else if (i == themeActivity.H0) {
                ld5Var.setText(k96.M0(2131747572, "OtherSettings"));
                return;
            } else {
                if (i == themeActivity.G0) {
                    ld5Var.setText(k96.M0(2131748468, "MediaAndSoundSettings"));
                    return;
                }
                return;
            }
        }
        if (i14 == 6) {
            ((uy0) view).setProgress(bkb.q);
            return;
        }
        if (i14 == 7) {
            ahb ahbVar = (ahb) view;
            if (i == themeActivity.Y) {
                ahbVar.f(k96.M0(2131753788, "AutoNightLocation"), bkb.p, true);
                return;
            }
            if (i == themeActivity.O) {
                ahbVar.f(k96.M0(2131751145, "EnableAnimations"), na7.c1().getBoolean("view_animations", true), true);
                return;
            }
            if (i == themeActivity.H) {
                ahbVar.f(k96.M0(2131745440, "SendByEnter"), na7.c1().getBoolean("send_by_enter", false), true);
                return;
            }
            if (i == themeActivity.F) {
                ahbVar.g(k96.M0(2131746232, "RaiseToSpeak"), k96.M0(2131746231, "RaiseToSpeakInfo"), gba.o0, true, true);
                return;
            }
            i3 = themeActivity.raiseToListenRow;
            if (i == i3) {
                ahbVar.g(k96.M0(2131746234, "RaiseToListen"), k96.M0(2131746233, "RaiseToListenInfo"), gba.p0, true, true);
                return;
            }
            if (i == themeActivity.G) {
                ahbVar.g(k96.M0(2131748057, "NextMediaTap"), k96.M0(2131748056, "NextMediaTapInfo"), gba.q0, true, true);
                return;
            }
            i4 = themeActivity.pauseOnRecordRow;
            if (i == i4) {
                ahbVar.g(k96.M0(2131747238, null), k96.M0(2131747237, "PauseMusicOnRecordInfo"), gba.B0, true, true);
                return;
            }
            i5 = themeActivity.pauseOnMediaRow;
            if (i == i5) {
                ahbVar.f(k96.M0(2131747239, null), gba.C0, true);
                return;
            }
            if (i == themeActivity.E) {
                ahbVar.g(k96.M0(2131751426, "DirectShare"), k96.M0(2131751425, "DirectShareInfo"), gba.u0, false, true);
                return;
            }
            i6 = themeActivity.sensitiveContentRow;
            if (i == i6) {
                ahbVar.g(k96.M0(2131745138, null), k96.M0(2131745137, null), themeActivity.getMessagesController().X4(), true, true);
                return;
            } else {
                if (i == themeActivity.t0) {
                    ahbVar.f(k96.M0(2131753672, "BlurInChat"), gba.f(), true);
                    return;
                }
                return;
            }
        }
        if (i14 != 14) {
            if (i14 == 17) {
                ((hc3) view).a();
                return;
            }
            if (i14 == 19) {
                uy8 uy8Var = (uy8) view;
                if (i == themeActivity.I) {
                    uy8Var.b("save media only from peer chats", "", true, false);
                    return;
                } else {
                    uy8Var.b("save media from all chats", "", true, false);
                    return;
                }
            }
            if (i14 == 21) {
                ((d08) view).set(themeActivity.getUserConfig().f());
                return;
            }
            switch (i14) {
                case 10:
                    vl7 vl7Var = (vl7) view;
                    i12 = themeActivity.nightThemeRow;
                    if (i != i12) {
                        i13 = themeActivity.browserRow;
                        if (i == i13) {
                            vl7Var.b(k96.M0(2131749017, null), k96.M0(2131749016, null), R.drawable.msg2_language, themeActivity.getMessagesController().L2(), 0, false, true, false);
                            break;
                        }
                    } else {
                        boolean z = bkb.o != 0;
                        String A0 = z ? bkb.A0() : k96.M0(2131753780, "AutoNightThemeOff");
                        if (z) {
                            int i21 = bkb.o;
                            A0 = tb4.y(i21 == 1 ? k96.M0(2131753784, "AutoNightScheduled") : i21 == 3 ? k96.M0(2131753783, "AutoNightSystemDefault") : k96.M0(2131753793, "AutoNightAdaptive"), " ", A0);
                        }
                        vl7Var.b(k96.M0(2131753781, "AutoNightTheme"), A0, R.drawable.menu_night_mode_24, z, 0, false, true, false);
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
                    o39 o39Var = (o39) view;
                    e0 e0Var = (e0) o39Var.getAdapter();
                    e0Var.f();
                    int indexOf = e0Var.e.indexOf(e0Var.d.i(false));
                    if (indexOf == -1) {
                        indexOf = e0Var.b() - 1;
                    }
                    if (indexOf != -1) {
                        ((t26) o39Var.getLayoutManager()).g1(indexOf, (themeActivity.b.getMeasuredWidth() / 2) - gl.L(42.0f));
                        break;
                    }
                    break;
            }
            return;
        }
        wgb wgbVar = (wgb) view;
        wgbVar.w = (byte) 48;
        i7 = themeActivity.backgroundRow;
        if (i == i7) {
            wgbVar.setSubtitle(null);
            int i22 = bkb.p6;
            wgbVar.g(i22, i22);
            String M0 = k96.M0(2131752538, null);
            i11 = themeActivity.changeUserColor;
            wgbVar.o(R.drawable.msg_background, M0, i11 >= 0);
            return;
        }
        if (i == themeActivity.z0) {
            wgbVar.setSubtitle(null);
            int i23 = bkb.p6;
            wgbVar.g(i23, i23);
            wgbVar.o(R.drawable.msg_theme, k96.M0(2131751269, null), true);
            return;
        }
        i8 = themeActivity.createNewThemeRow;
        if (i == i8) {
            wgbVar.setSubtitle(null);
            int i24 = bkb.p6;
            wgbVar.g(i24, i24);
            wgbVar.o(R.drawable.msg_colors, k96.M0(2131751700, null), false);
            return;
        }
        i9 = themeActivity.liteModeRow;
        if (i == i9) {
            wgbVar.g(bkb.I5, bkb.F6);
            wgbVar.o(R.drawable.msg2_animations, k96.M0(2131748674, null), true);
            wgbVar.setSubtitle(k96.M0(2131748673, null));
            wgbVar.w = (byte) 60;
            wgbVar.s = 64;
            wgbVar.x = 20;
            return;
        }
        i10 = themeActivity.stickersRow;
        if (i == i10) {
            wgbVar.g(bkb.I5, bkb.F6);
            wgbVar.o(R.drawable.msg2_sticker, k96.M0(2131744620, null), true);
            wgbVar.setSubtitle(k96.M0(2131744619, null));
            wgbVar.s = 64;
            wgbVar.w = (byte) 60;
            wgbVar.x = 20;
            return;
        }
        if (i == themeActivity.B0) {
            wgbVar.g(bkb.I5, bkb.F6);
            wgbVar.o(R.drawable.msg2_speech, k96.M0(2131745039, null), false);
            wgbVar.setSubtitle(k96.M0(2131745040, null));
            wgbVar.s = 64;
            wgbVar.w = (byte) 60;
            wgbVar.x = 20;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, bnb] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object, pkb] */
    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        ?? bnbVar;
        View view;
        int i2;
        ui5 ui5Var;
        int i3;
        int i4;
        wjb wjbVar = null;
        byte b = 0;
        ThemeActivity themeActivity = this.e;
        Context context = this.c;
        switch (i) {
            case 1:
                view = new uib(context);
                break;
            case 2:
                view = new mhb(context);
                break;
            case 3:
                view = new b9a(context, (de9) null);
                break;
            case 4:
                bnbVar = new bnb(context);
                bnbVar.setWillNotDraw(false);
                TextView textView = new TextView(context);
                bnbVar.a = textView;
                zkb.X(textView, bkb.F6, null);
                ug8.w(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity((k96.a0 ? 5 : 3) | 16);
                boolean z = k96.a0;
                bnbVar.addView(textView, nme.d(-1, -1.0f, (z ? 5 : 3) | 48, z ? 71.0f : 21.0f, 0.0f, z ? 21.0f : 23.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                bnbVar.b = imageView;
                zkb.s(imageView, bkb.Ci, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(R.drawable.sticker_added);
                bnbVar.addView(imageView, nme.d(19, 14.0f, (k96.a0 ? (byte) 3 : (byte) 5) | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                view = bnbVar;
                break;
            case 5:
                view = new ld5(context);
                break;
            case 6:
                view = new okb(this, context);
                break;
            case 7:
                view = new ahb(context);
                break;
            case 8:
                view = new skb(themeActivity, context);
                break;
            case 9:
                bnbVar = new pkb(context, (byte) 0);
                bnbVar.b = new z92[2];
                bnbVar.setOrientation(0);
                bnbVar.setPadding(gl.L(21.0f), gl.L(10.0f), gl.L(21.0f), 0);
                int i5 = 0;
                while (true) {
                    z92[] z92VarArr = (z92[]) bnbVar.b;
                    if (i5 >= z92VarArr.length) {
                        view = bnbVar;
                        break;
                    } else {
                        boolean z2 = i5 == 1;
                        z92 z92Var = new z92(context, (byte) 0);
                        z92Var.b = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        z92Var.e = textPaint;
                        z92Var.setWillNotDraw(false);
                        z92Var.c = z2;
                        z92Var.setContentDescription(k96.M0(z2 ? 2131752211 : 2131752212, null));
                        textPaint.setTextSize(gl.L(13.0f));
                        y92 y92Var = new y92(z92Var, context);
                        z92Var.d = y92Var;
                        y92Var.setSize(gl.L(20.0f));
                        z92Var.addView(y92Var, nme.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        boolean z3 = gba.m1;
                        y92Var.a(!z2 ? z3 : !z3, false);
                        z92VarArr[i5] = z92Var;
                        bnbVar.addView(((z92[]) bnbVar.b)[i5], nme.m(0.5f, -1, -1, i5 == 1 ? 10 : 0, 0, 0));
                        ((z92[]) bnbVar.b)[i5].setOnClickListener(new v6(r0, bnbVar, z2));
                        i5++;
                    }
                }
            case 10:
                view = new vl7(this.c, 21, 60, true, null);
                break;
            case 11:
                this.d = true;
                qkb qkbVar = new qkb(this, this.c, themeActivity, themeActivity.f, themeActivity.e, themeActivity.d);
                themeActivity.c = qkbVar;
                qkbVar.setDrawDivider(themeActivity.w);
                themeActivity.c.setFocusable(false);
                View view2 = themeActivity.c;
                view2.setLayoutParams(new e49(-1, gl.L(148.0f)));
                view = view2;
                break;
            case 12:
                final rkb rkbVar = new rkb(context, wjbVar, b);
                rkbVar.setFocusable(false);
                rkbVar.setItemAnimator(null);
                rkbVar.setLayoutAnimation(null);
                rkbVar.setPadding(gl.L(11.0f), 0, gl.L(11.0f), 0);
                rkbVar.setClipToPadding(false);
                t26 t26Var = new t26();
                t26Var.i1(0);
                rkbVar.setLayoutManager(t26Var);
                final e0 e0Var = new e0(themeActivity, context);
                rkbVar.setAdapter(e0Var);
                rkbVar.setOnItemClickListener(new c39() { // from class: org.telegram.ui.c0
                    @Override // c39
                    public final void d(int i6, View view3) {
                        ThemeActivity themeActivity2 = d0.this.e;
                        byte b2 = themeActivity2.f;
                        akb B0 = b2 == 1 ? bkb.J : bkb.B0();
                        e0 e0Var2 = e0Var;
                        if (i6 == e0Var2.b() - 1) {
                            themeActivity2.presentFragment(new qmb(B0, false, 1, false, b2 == 1));
                        } else {
                            zjb zjbVar = (zjb) e0Var2.e.get(i6);
                            int i7 = B0.Z;
                            int i8 = zjbVar.a;
                            if (i7 != i8) {
                                bkb.I1(B0, b2 == 1, i8, view3);
                                jy3.q(B0, zjbVar.a);
                                bkb.K1(themeActivity2);
                            } else {
                                themeActivity2.presentFragment(new qmb(B0, false, 1, i8 >= 100, b2 == 1));
                            }
                        }
                        int left = view3.getLeft();
                        int right = view3.getRight();
                        int L = gl.L(52.0f);
                        int i9 = left - L;
                        rkb rkbVar2 = rkbVar;
                        if (i9 < 0) {
                            rkbVar2.x0(i9, 0, null);
                        } else {
                            int i10 = right + L;
                            if (i10 > rkbVar2.getMeasuredWidth()) {
                                rkbVar2.x0(i10 - rkbVar2.getMeasuredWidth(), 0, null);
                            }
                        }
                        int childCount = rkbVar2.getChildCount();
                        for (int i11 = 0; i11 < childCount; i11++) {
                            View childAt = rkbVar2.getChildAt(i11);
                            if (childAt instanceof ThemeActivity.InnerAccentView) {
                                ((ThemeActivity.InnerAccentView) childAt).a(true);
                            }
                        }
                    }
                });
                rkbVar.setOnItemLongClickListener(new kq8(this, e0Var, (byte) 25));
                rkbVar.setLayoutParams(new e49(-1, gl.L(62.0f)));
                view = rkbVar;
                break;
            case 13:
                view = new mkb(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                view = new wgb(context);
                break;
            case 15:
                i2 = ((org.telegram.ui.ActionBar.d) themeActivity).currentAccount;
                view = new pcb(context, i2);
                break;
            case 16:
                ui5Var = ((org.telegram.ui.ActionBar.d) themeActivity).parentLayout;
                View o08Var = new o08(context, ui5Var, 0);
                o08Var.setImportantForAccessibility(4);
                view = o08Var;
                break;
            case 17:
                View hc3Var = new hc3(context, themeActivity, themeActivity.f);
                hc3Var.setFocusable(false);
                hc3Var.setLayoutParams(new e49(-1, -2));
                view = hc3Var;
                break;
            case 19:
                view = new uy8(context, false);
                break;
            case 20:
                i3 = ((org.telegram.ui.ActionBar.d) themeActivity).currentAccount;
                or orVar = new or(context, null);
                orVar.f3 = new ArrayList();
                orVar.h3 = i3;
                orVar.setPadding(0, gl.L(12.0f), 0, gl.L(12.0f));
                orVar.setFocusable(false);
                orVar.setItemAnimator(null);
                orVar.setLayoutAnimation(null);
                t26 t26Var2 = new t26(0, false);
                orVar.g3 = t26Var2;
                orVar.setLayoutManager(t26Var2);
                orVar.setAdapter(new jr(orVar, b));
                orVar.i(new kr(orVar, b));
                orVar.setOnItemClickListener(new ir(orVar, themeActivity, context, b));
                orVar.z1();
                view = orVar;
                break;
            case 21:
                i4 = ((org.telegram.ui.ActionBar.d) themeActivity).currentAccount;
                view = new d08(i4, 0L, themeActivity.getResourceProvider(), this.c);
                break;
        }
        return new y29(view);
    }

    @Override // w39
    public final void y(s49 s49Var) {
        if (s49Var.f == 4) {
            ((bnb) s49Var.a).setTypeChecked(s49Var.b() == bkb.o);
        }
    }
}
