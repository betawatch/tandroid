package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class hc1 extends org.telegram.ui.Components.xl0 {
    public final Context c;
    public boolean d = true;
    public final /* synthetic */ ThemeActivity e;

    public hc1(ThemeActivity themeActivity, Context context) {
        this.e = themeActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 1 || i10 == 4 || i10 == 7 || i10 == 10 || i10 == 11 || i10 == 12 || i10 == 14 || i10 == 18 || i10 == 20 || i10 == 21;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.J0;
    }

    @Override // s4.h0
    public final int j(int i10) {
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
        int i24;
        ThemeActivity themeActivity = this.e;
        if (i10 == themeActivity.a0 || i10 == themeActivity.K || i10 == themeActivity.b0 || i10 == themeActivity.Y || i10 == themeActivity.P || i10 == themeActivity.Q || i10 == themeActivity.M || i10 == themeActivity.L) {
            return 1;
        }
        if (i10 == themeActivity.f0 || i10 == themeActivity.Z || i10 == themeActivity.v0 || i10 == themeActivity.A0 || i10 == themeActivity.G0) {
            return 2;
        }
        if (i10 == themeActivity.r0 || i10 == themeActivity.V || i10 == themeActivity.c0 || i10 == themeActivity.O || i10 == themeActivity.h0 || i10 == themeActivity.n0 || i10 == themeActivity.k0 || i10 == themeActivity.J || i10 == themeActivity.I0 || i10 == themeActivity.z0 || i10 == themeActivity.B0 || i10 == themeActivity.C0 || i10 == themeActivity.D0) {
            return 3;
        }
        if (i10 == themeActivity.R || i10 == themeActivity.S || i10 == themeActivity.T || i10 == themeActivity.U) {
            return 4;
        }
        if (i10 == themeActivity.W || i10 == themeActivity.d0 || i10 == themeActivity.g0 || i10 == themeActivity.x || i10 == themeActivity.i0 || i10 == themeActivity.w || i10 == themeActivity.l0 || i10 == themeActivity.j0 || i10 == themeActivity.t0 || i10 == themeActivity.w0 || i10 == themeActivity.H0 || i10 == themeActivity.E0 || i10 == themeActivity.F0) {
            return 5;
        }
        if (i10 == themeActivity.e0) {
            return 6;
        }
        if (i10 == themeActivity.X || i10 == themeActivity.G || i10 == themeActivity.E) {
            return 7;
        }
        i11 = themeActivity.raiseToListenRow;
        if (i10 == i11) {
            return 7;
        }
        i12 = themeActivity.pauseOnRecordRow;
        if (i10 == i12 || i10 == themeActivity.y || i10 == themeActivity.s0) {
            return 7;
        }
        i13 = themeActivity.pauseOnMediaRow;
        if (i10 == i13 || i10 == themeActivity.F) {
            return 7;
        }
        i14 = themeActivity.sensitiveContentRow;
        if (i10 == i14) {
            return 7;
        }
        i15 = themeActivity.textSizeRow;
        if (i10 == i15) {
            return 8;
        }
        if (i10 == themeActivity.m0) {
            return 9;
        }
        i16 = themeActivity.nightThemeRow;
        if (i10 == i16) {
            return 10;
        }
        i17 = themeActivity.browserRow;
        if (i10 == i17) {
            return 10;
        }
        if (i10 == themeActivity.o0) {
            return 11;
        }
        if (i10 == themeActivity.q0) {
            return 12;
        }
        i18 = themeActivity.bubbleRadiusRow;
        if (i10 == i18) {
            return 13;
        }
        i19 = themeActivity.backgroundRow;
        if (i10 == i19 || i10 == themeActivity.y0) {
            return 14;
        }
        i20 = themeActivity.createNewThemeRow;
        if (i10 == i20) {
            return 14;
        }
        i21 = themeActivity.liteModeRow;
        if (i10 == i21) {
            return 14;
        }
        i22 = themeActivity.stickersRow;
        if (i10 == i22) {
            return 14;
        }
        if (i10 == themeActivity.u0) {
            return 15;
        }
        if (i10 == themeActivity.x0) {
            return 16;
        }
        if (i10 == themeActivity.p0) {
            return 17;
        }
        if (i10 == themeActivity.H || i10 == themeActivity.I) {
            return 19;
        }
        i23 = themeActivity.appIconSelectorRow;
        if (i10 == i23) {
            return 20;
        }
        i24 = themeActivity.changeUserColor;
        return i10 == i24 ? 21 : 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
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
        int i23 = c1Var.f;
        View view = c1Var.a;
        ThemeActivity themeActivity = this.e;
        if (i23 == 1) {
            org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) view;
            i11 = themeActivity.nightThemeRow;
            if (i10 == i11) {
                if (org.telegram.ui.ActionBar.j6.o == 0 || org.telegram.ui.ActionBar.j6.J == null) {
                    faVar.c(LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.AutoNightThemeOff), false, false);
                    return;
                } else {
                    faVar.c(LocaleController.getString(R.string.AutoNightTheme), org.telegram.ui.ActionBar.j6.z0(), false, false);
                    return;
                }
            }
            if (i10 == themeActivity.a0) {
                int i24 = org.telegram.ui.ActionBar.j6.r;
                int i25 = i24 / 60;
                faVar.c(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i25), Integer.valueOf(i24 - (i25 * 60))), false, true);
                return;
            }
            if (i10 == themeActivity.b0) {
                int i26 = org.telegram.ui.ActionBar.j6.s;
                int i27 = i26 / 60;
                faVar.c(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i27), Integer.valueOf(i26 - (i27 * 60))), false, false);
                return;
            }
            if (i10 == themeActivity.Y) {
                faVar.c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.j6.w, false, false);
                return;
            }
            if (i10 == themeActivity.Q) {
                int i28 = MessagesController.getGlobalMainSettings().getInt("sortContactsBy", 0);
                faVar.c(LocaleController.getString("SortBy", R.string.SortBy), i28 == 0 ? LocaleController.getString("Default", R.string.Default) : i28 == 1 ? LocaleController.getString("FirstName", R.string.SortFirstName) : LocaleController.getString("LastName", R.string.SortLastName), false, true);
                return;
            }
            if (i10 == themeActivity.P) {
                faVar.b(LocaleController.getString("ImportContacts", R.string.ImportContacts), true);
                return;
            }
            if (i10 == themeActivity.K) {
                int i29 = SharedConfig.distanceSystemType;
                faVar.c(LocaleController.getString("DistanceUnits", R.string.DistanceUnits), i29 == 0 ? LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic) : i29 == 1 ? LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers) : LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles), themeActivity.O0, themeActivity.D0 >= 0);
                themeActivity.O0 = false;
                return;
            } else if (i10 == themeActivity.L) {
                faVar.c(LocaleController.getString(R.string.SearchEngine), org.telegram.ui.web.p1.a().a, themeActivity.P0, false);
                return;
            } else {
                if (i10 == themeActivity.M) {
                    faVar.c(LocaleController.getString(R.string.MicrophoneForVoiceMessages), LocaleController.getString(SharedConfig.recordViaSco ? R.string.MicrophoneForVoiceMessagesSco : R.string.MicrophoneForVoiceMessagesBuiltIn), themeActivity.N0, false);
                    themeActivity.N0 = false;
                    return;
                }
                return;
            }
        }
        if (i23 == 2) {
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            f9Var.setFixedSize(0);
            if (i10 == themeActivity.f0) {
                f9Var.setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (org.telegram.ui.ActionBar.j6.q * 100.0f))));
                return;
            }
            if (i10 == themeActivity.Z) {
                f9Var.setText(ThemeActivity.y0());
                return;
            }
            if (i10 == themeActivity.v0) {
                f9Var.setText(LocaleController.getString("ChatListSwipeGestureInfo", R.string.ChatListSwipeGestureInfo));
                return;
            } else if (i10 == themeActivity.G0) {
                f9Var.setText(LocaleController.getString("LiteModeInfo", R.string.LiteModeInfo));
                return;
            } else {
                f9Var.setFixedSize(12);
                f9Var.setText("");
                return;
            }
        }
        if (i23 == 4) {
            org.telegram.ui.Cells.ka kaVar = (org.telegram.ui.Cells.ka) view;
            if (i10 == themeActivity.R) {
                kaVar.a(LocaleController.getString("AutoNightDisabled", R.string.AutoNightDisabled), org.telegram.ui.ActionBar.j6.o == 0, true);
                return;
            }
            if (i10 == themeActivity.S) {
                kaVar.a(LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled), org.telegram.ui.ActionBar.j6.o == 1, true);
                return;
            } else if (i10 == themeActivity.T) {
                kaVar.a(LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive), org.telegram.ui.ActionBar.j6.o == 2, themeActivity.U != -1);
                return;
            } else {
                if (i10 == themeActivity.U) {
                    kaVar.a(LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault), org.telegram.ui.ActionBar.j6.o == 3, false);
                    return;
                }
                return;
            }
        }
        if (i23 == 5) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (i10 == themeActivity.W) {
                n4Var.setText(LocaleController.getString("AutoNightSchedule", R.string.AutoNightSchedule));
                return;
            }
            if (i10 == themeActivity.d0) {
                n4Var.setText(LocaleController.getString("AutoNightBrightness", R.string.AutoNightBrightness));
                return;
            }
            if (i10 == themeActivity.g0) {
                n4Var.setText(LocaleController.getString("AutoNightPreferred", R.string.AutoNightPreferred));
                return;
            }
            if (i10 == themeActivity.x) {
                n4Var.setText(LocaleController.getString("SETTINGS", R.string.SETTINGS));
                return;
            }
            if (i10 == themeActivity.i0) {
                if (themeActivity.f == 3) {
                    n4Var.setText(LocaleController.getString("BuildMyOwnTheme", R.string.BuildMyOwnTheme));
                    return;
                } else {
                    n4Var.setText(LocaleController.getString("ColorTheme", R.string.ColorTheme));
                    return;
                }
            }
            if (i10 == themeActivity.w) {
                n4Var.setText(LocaleController.getString("TextSizeHeader", R.string.TextSizeHeader));
                return;
            }
            if (i10 == themeActivity.l0) {
                n4Var.setText(LocaleController.getString("ChatList", R.string.ChatList));
                return;
            }
            if (i10 == themeActivity.j0) {
                n4Var.setText(LocaleController.getString("BubbleRadius", R.string.BubbleRadius));
                return;
            }
            if (i10 == themeActivity.t0) {
                n4Var.setText(LocaleController.getString("ChatListSwipeGesture", R.string.ChatListSwipeGesture));
                return;
            }
            if (i10 == themeActivity.w0) {
                n4Var.setText(LocaleController.getString("SelectTheme", R.string.SelectTheme));
                return;
            }
            if (i10 == themeActivity.H0) {
                n4Var.setText(LocaleController.getString(R.string.AppIcon));
                return;
            } else if (i10 == themeActivity.F0) {
                n4Var.setText(LocaleController.getString("OtherSettings", R.string.OtherSettings));
                return;
            } else {
                if (i10 == themeActivity.E0) {
                    n4Var.setText(LocaleController.getString("MediaAndSoundSettings", R.string.MediaAndSoundSettings));
                    return;
                }
                return;
            }
        }
        if (i23 == 6) {
            ((org.telegram.ui.Cells.k0) view).setProgress(org.telegram.ui.ActionBar.j6.q);
            return;
        }
        if (i23 == 7) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            if (i10 == themeActivity.X) {
                x8Var.f(LocaleController.getString("AutoNightLocation", R.string.AutoNightLocation), org.telegram.ui.ActionBar.j6.p, true);
                return;
            }
            if (i10 == themeActivity.N) {
                x8Var.f(LocaleController.getString("EnableAnimations", R.string.EnableAnimations), MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), true);
                return;
            }
            if (i10 == themeActivity.G) {
                x8Var.f(LocaleController.getString("SendByEnter", R.string.SendByEnter), MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false), true);
                return;
            }
            if (i10 == themeActivity.E) {
                x8Var.g(LocaleController.getString("RaiseToSpeak", R.string.RaiseToSpeak), LocaleController.getString("RaiseToSpeakInfo", R.string.RaiseToSpeakInfo), SharedConfig.raiseToSpeak, true, true);
                return;
            }
            i12 = themeActivity.raiseToListenRow;
            if (i10 == i12) {
                x8Var.g(LocaleController.getString("RaiseToListen", R.string.RaiseToListen), LocaleController.getString("RaiseToListenInfo", R.string.RaiseToListenInfo), SharedConfig.raiseToListen, true, true);
                return;
            }
            if (i10 == themeActivity.F) {
                x8Var.g(LocaleController.getString("NextMediaTap", R.string.NextMediaTap), LocaleController.getString("NextMediaTapInfo", R.string.NextMediaTapInfo), SharedConfig.nextMediaTap, true, true);
                return;
            }
            i13 = themeActivity.pauseOnRecordRow;
            if (i10 == i13) {
                x8Var.g(LocaleController.getString(R.string.PauseMusicOnRecord), LocaleController.getString("PauseMusicOnRecordInfo", R.string.PauseMusicOnRecordInfo), SharedConfig.pauseMusicOnRecord, true, true);
                return;
            }
            i14 = themeActivity.pauseOnMediaRow;
            if (i10 == i14) {
                x8Var.f(LocaleController.getString(R.string.PauseMusicOnMedia), SharedConfig.pauseMusicOnMedia, true);
                return;
            }
            if (i10 == themeActivity.y) {
                x8Var.g(LocaleController.getString("DirectShare", R.string.DirectShare), LocaleController.getString("DirectShareInfo", R.string.DirectShareInfo), SharedConfig.directShare, false, true);
                return;
            }
            i15 = themeActivity.sensitiveContentRow;
            if (i10 == i15) {
                x8Var.g(LocaleController.getString(R.string.ShowSensitiveContent), LocaleController.getString(R.string.ShowSensitiveContentInfo), themeActivity.getMessagesController().showSensitiveContent(), true, true);
                return;
            } else {
                if (i10 == themeActivity.s0) {
                    x8Var.f(LocaleController.getString("BlurInChat", R.string.BlurInChat), SharedConfig.chatBlurEnabled(), true);
                    return;
                }
                return;
            }
        }
        if (i23 == 14) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            s8Var.v = 48;
            i16 = themeActivity.backgroundRow;
            if (i10 == i16) {
                s8Var.setSubtitle(null);
                int i30 = org.telegram.ui.ActionBar.j6.q6;
                s8Var.e(i30, i30);
                String string = LocaleController.getString(R.string.ChangeChatBackground);
                int i31 = R.drawable.msg_background;
                i20 = themeActivity.changeUserColor;
                s8Var.m(i31, string, i20 >= 0);
                return;
            }
            if (i10 == themeActivity.y0) {
                s8Var.setSubtitle(null);
                int i32 = org.telegram.ui.ActionBar.j6.q6;
                s8Var.e(i32, i32);
                s8Var.m(R.drawable.msg_theme, LocaleController.getString(R.string.EditCurrentTheme), true);
                return;
            }
            i17 = themeActivity.createNewThemeRow;
            if (i10 == i17) {
                s8Var.setSubtitle(null);
                int i33 = org.telegram.ui.ActionBar.j6.q6;
                s8Var.e(i33, i33);
                s8Var.m(R.drawable.msg_colors, LocaleController.getString(R.string.CreateNewTheme), false);
                return;
            }
            i18 = themeActivity.liteModeRow;
            if (i10 == i18) {
                s8Var.e(org.telegram.ui.ActionBar.j6.J5, org.telegram.ui.ActionBar.j6.G6);
                s8Var.m(R.drawable.msg2_animations, LocaleController.getString(R.string.LiteMode), true);
                s8Var.setSubtitle(LocaleController.getString(R.string.LiteModeInfo));
                s8Var.v = 60;
                s8Var.s = 64;
                s8Var.w = 20;
                return;
            }
            i19 = themeActivity.stickersRow;
            if (i10 == i19) {
                s8Var.e(org.telegram.ui.ActionBar.j6.J5, org.telegram.ui.ActionBar.j6.G6);
                s8Var.m(R.drawable.msg2_sticker, LocaleController.getString(R.string.StickersName), false);
                s8Var.setSubtitle(LocaleController.getString(R.string.StickersNameInfo2));
                s8Var.s = 64;
                s8Var.v = 60;
                s8Var.w = 20;
                return;
            }
            return;
        }
        if (i23 == 17) {
            ((gv) view).b();
            return;
        }
        if (i23 == 19) {
            org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) view;
            if (i10 == themeActivity.H) {
                k6Var.b("save media only from peer chats", "", true, false);
                return;
            } else {
                k6Var.b("save media from all chats", "", true, false);
                return;
            }
        }
        if (i23 == 21) {
            ((hp0) view).set(themeActivity.getUserConfig().getCurrentUser());
            return;
        }
        switch (i23) {
            case 10:
                org.telegram.ui.Cells.k5 k5Var = (org.telegram.ui.Cells.k5) view;
                i21 = themeActivity.nightThemeRow;
                if (i10 != i21) {
                    i22 = themeActivity.browserRow;
                    if (i10 == i22) {
                        k5Var.b(LocaleController.getString(R.string.InappBrowser), LocaleController.getString(R.string.InappBrowserInfo), R.drawable.msg2_language, themeActivity.getMessagesController().isWebBrowserInAppEnabled(), 0, false, true, false);
                        break;
                    }
                } else {
                    boolean z10 = org.telegram.ui.ActionBar.j6.o != 0;
                    String z02 = z10 ? org.telegram.ui.ActionBar.j6.z0() : LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
                    if (z10) {
                        int i34 = org.telegram.ui.ActionBar.j6.o;
                        z02 = a4.a.C(i34 == 1 ? LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled) : i34 == 3 ? LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault) : LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive), " ", z02);
                    }
                    k5Var.b(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), z02, R.drawable.menu_night_mode_24, z10, 0, false, true, false);
                    break;
                }
                break;
            case 11:
                if (this.d) {
                    themeActivity.c.y1(themeActivity.b.getMeasuredWidth());
                    this.d = false;
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.yl0 yl0Var = (org.telegram.ui.Components.yl0) view;
                jc1 jc1Var = (jc1) yl0Var.getAdapter();
                jc1Var.l();
                int indexOf = jc1Var.e.indexOf(jc1Var.d.k(false));
                if (indexOf == -1) {
                    indexOf = jc1Var.h() - 1;
                }
                if (indexOf != -1) {
                    ((s4.c0) yl0Var.getLayoutManager()).h1(indexOf, (themeActivity.b.getMeasuredWidth() / 2) - AndroidUtilities.dp(42.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, org.telegram.ui.Cells.ka] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object, org.telegram.ui.dc1] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29, types: [org.telegram.ui.hp0] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ?? kaVar;
        View k5Var;
        int i11;
        org.telegram.ui.ActionBar.d5 d5Var;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.f6 f6Var = null;
        ThemeActivity themeActivity = this.e;
        Context context = this.c;
        switch (i10) {
            case 1:
                k5Var = new org.telegram.ui.Cells.fa(context);
                break;
            case 2:
                k5Var = new org.telegram.ui.Cells.f9(context);
                break;
            case 3:
                k5Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 4:
                kaVar = new org.telegram.ui.Cells.ka(context);
                kaVar.setWillNotDraw(false);
                TextView textView = new TextView(context);
                kaVar.a = textView;
                org.telegram.messenger.rk.t(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                boolean z10 = LocaleController.isRTL;
                kaVar.addView(textView, w7.y5.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 71.0f : 21.0f, 0.0f, z10 ? 21.0f : 23.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                kaVar.b = imageView;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Mh, false), PorterDuff.Mode.MULTIPLY));
                imageView.setImageResource(R.drawable.sticker_added);
                kaVar.addView(imageView, w7.y5.d(19, 14.0f, (LocaleController.isRTL ? 3 : 5) | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                k5Var = kaVar;
                break;
            case 5:
                k5Var = new org.telegram.ui.Cells.n4(context);
                break;
            case 6:
                k5Var = new cc1(this, context);
                break;
            case 7:
                k5Var = new org.telegram.ui.Cells.x8(context);
                break;
            case 8:
                k5Var = new ic1(themeActivity, context);
                break;
            case 9:
                kaVar = new dc1(context);
                kaVar.b = new org.telegram.ui.Cells.y0[2];
                kaVar.setOrientation(0);
                kaVar.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), 0);
                int i14 = 0;
                while (true) {
                    org.telegram.ui.Cells.y0[] y0VarArr = (org.telegram.ui.Cells.y0[]) kaVar.b;
                    if (i14 >= y0VarArr.length) {
                        k5Var = kaVar;
                        break;
                    } else {
                        boolean z11 = i14 == 1;
                        org.telegram.ui.Cells.y0 y0Var = new org.telegram.ui.Cells.y0(context);
                        y0Var.c = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        y0Var.d = textPaint;
                        y0Var.setWillNotDraw(false);
                        y0Var.b = z11;
                        y0Var.setContentDescription(LocaleController.getString(z11 ? R.string.ChatListExpanded : R.string.ChatListDefault));
                        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                        org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(y0Var, context);
                        y0Var.a = x0Var;
                        x0Var.setSize(AndroidUtilities.dp(20.0f));
                        y0Var.addView(x0Var, w7.y5.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        x0Var.a((z11 && SharedConfig.useThreeLinesLayout) || !(z11 || SharedConfig.useThreeLinesLayout), false);
                        y0VarArr[i14] = y0Var;
                        kaVar.addView(((org.telegram.ui.Cells.y0[]) kaVar.b)[i14], w7.y5.m(0.5f, -1, -1, i14 == 1 ? 10 : 0, 0, 0));
                        ((org.telegram.ui.Cells.y0[]) kaVar.b)[i14].setOnClickListener(new ai.j3(3, kaVar, z11));
                        i14++;
                    }
                }
                break;
            case 10:
                k5Var = new org.telegram.ui.Cells.k5(21, 60, this.c, null, true);
                break;
            case 11:
                this.d = true;
                ec1 ec1Var = new ec1(this, this.c, themeActivity, themeActivity.f, themeActivity.e, themeActivity.d);
                themeActivity.c = ec1Var;
                ec1Var.setDrawDivider(themeActivity.v);
                themeActivity.c.setFocusable(false);
                View view = themeActivity.c;
                view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(148.0f)));
                k5Var = view;
                break;
            case 12:
                fc1 fc1Var = new fc1(context, 0, f6Var);
                fc1Var.setFocusable(false);
                fc1Var.setItemAnimator(null);
                fc1Var.setLayoutAnimation(null);
                fc1Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
                fc1Var.setClipToPadding(false);
                s4.c0 c0Var = new s4.c0();
                c0Var.j1(0);
                fc1Var.setLayoutManager(c0Var);
                jc1 jc1Var = new jc1(themeActivity, context);
                fc1Var.setAdapter(jc1Var);
                fc1Var.setOnItemClickListener(new ac1(this, jc1Var, fc1Var, 0));
                fc1Var.setOnItemLongClickListener(new rv0(13, this, jc1Var));
                fc1Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(62.0f)));
                k5Var = fc1Var;
                break;
            case 13:
                k5Var = new xb1(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                k5Var = new org.telegram.ui.Cells.s8(context);
                break;
            case 15:
                i11 = ((org.telegram.ui.ActionBar.n2) themeActivity).currentAccount;
                org.telegram.ui.Components.gz0 gz0Var = new org.telegram.ui.Components.gz0(context);
                Paint paint = new Paint(1);
                gz0Var.a = paint;
                gz0Var.b = new Paint(1);
                Paint paint2 = new Paint(1);
                gz0Var.c = paint2;
                Paint paint3 = new Paint(1);
                gz0Var.d = paint3;
                gz0Var.e = new RectF();
                gz0Var.h = new String[]{LocaleController.getString(R.string.SwipeSettingsPin), LocaleController.getString(R.string.SwipeSettingsRead), LocaleController.getString(R.string.SwipeSettingsArchive), LocaleController.getString(R.string.SwipeSettingsMute), LocaleController.getString(R.string.SwipeSettingsDelete), LocaleController.getString(R.string.SwipeSettingsFolders)};
                gz0Var.n = new int[]{r14, r14, r14, r14, org.telegram.ui.ActionBar.j6.Y5, org.telegram.ui.ActionBar.j6.d9};
                gz0Var.r = new org.telegram.ui.Components.kj0[6];
                gz0Var.v = new org.telegram.ui.Components.nj0[2];
                gz0Var.x = 1.0f;
                int i15 = org.telegram.ui.ActionBar.j6.c9;
                Paint.Style style = Paint.Style.STROKE;
                paint.setStyle(style);
                paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                paint2.setStyle(style);
                Paint.Cap cap = Paint.Cap.ROUND;
                paint2.setStrokeCap(cap);
                paint2.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint3.setStyle(style);
                paint3.setStrokeCap(cap);
                paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
                org.telegram.ui.Components.fz0 fz0Var = new org.telegram.ui.Components.fz0(gz0Var, context);
                gz0Var.f = fz0Var;
                fz0Var.setMinValue(0);
                fz0Var.setDrawDividers(false);
                boolean isEmpty = MessagesController.getInstance(i11).dialogFilters.isEmpty();
                fz0Var.setMaxValue(isEmpty ? 4 : 5);
                fz0Var.setAllItemsCount(isEmpty ? 5 : 6);
                fz0Var.setWrapSelectorWheel(true);
                fz0Var.setFormatter(new org.telegram.ui.Components.ez0(gz0Var));
                fz0Var.setOnValueChangedListener(new org.telegram.ui.Components.ez0(gz0Var));
                fz0Var.setImportantForAccessibility(2);
                fz0Var.setValue(SharedConfig.getChatSwipeAction(i11));
                gz0Var.addView(fz0Var, w7.y5.d(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
                gz0Var.setWillNotDraw(false);
                gz0Var.s = 0;
                for (int i16 = 0; i16 < 2; i16++) {
                    gz0Var.v[i16] = new org.telegram.ui.Components.nj0(context);
                    gz0Var.addView(gz0Var.v[i16], w7.y5.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
                }
                org.telegram.ui.Components.kj0 a2 = gz0Var.a(gz0Var.f.getValue());
                if (a2 != null) {
                    gz0Var.v[0].setImageDrawable(a2);
                    a2.M(a2.e[0] - 1);
                }
                AndroidUtilities.updateViewVisibilityAnimated(gz0Var.v[0], true, 0.5f, false);
                AndroidUtilities.updateViewVisibilityAnimated(gz0Var.v[1], false, 0.5f, false);
                gz0Var.w = gz0Var.f.getValue() != 5 ? 0.0f : 1.0f;
                gz0Var.F = gz0Var.f.getValue();
                k5Var = gz0Var;
                break;
            case 16:
                d5Var = ((org.telegram.ui.ActionBar.n2) themeActivity).parentLayout;
                View gc1Var = new gc1(context, d5Var, 0);
                gc1Var.setImportantForAccessibility(4);
                k5Var = gc1Var;
                break;
            case 17:
                View gvVar = new gv(themeActivity.f, context, themeActivity);
                gvVar.setFocusable(false);
                gvVar.setLayoutParams(new s4.p0(-1, -2));
                k5Var = gvVar;
                break;
            case 19:
                k5Var = new org.telegram.ui.Cells.k6(context, false);
                break;
            case 20:
                i12 = ((org.telegram.ui.ActionBar.n2) themeActivity).currentAccount;
                org.telegram.ui.Cells.t tVar = new org.telegram.ui.Cells.t(context, null);
                tVar.X2 = new ArrayList();
                tVar.Z2 = i12;
                tVar.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                tVar.setFocusable(false);
                tVar.setItemAnimator(null);
                tVar.setLayoutAnimation(null);
                s4.c0 c0Var2 = new s4.c0(0, false);
                tVar.Y2 = c0Var2;
                tVar.setLayoutManager(c0Var2);
                int i17 = 1;
                tVar.setAdapter(new x7(tVar, i17));
                tVar.i(new ci.r1(tVar, i17));
                tVar.setOnItemClickListener(new ai.u0(tVar, themeActivity, context, 3));
                tVar.x1();
                k5Var = tVar;
                break;
            case 21:
                i13 = ((org.telegram.ui.ActionBar.n2) themeActivity).currentAccount;
                kaVar = new hp0(i13, 0L, this.c, themeActivity.getResourceProvider());
                k5Var = kaVar;
                break;
        }
        return new org.telegram.ui.Components.il0(k5Var);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        if (c1Var.f == 4) {
            ((org.telegram.ui.Cells.ka) c1Var.a).setTypeChecked(c1Var.b() == org.telegram.ui.ActionBar.j6.o);
        }
    }
}
