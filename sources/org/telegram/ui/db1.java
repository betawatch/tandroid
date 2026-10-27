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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class db1 extends org.telegram.ui.Components.mm0 {
    public final Context c;
    public boolean d = true;
    public final /* synthetic */ ThemeActivity e;

    public db1(ThemeActivity themeActivity, Context context) {
        this.e = themeActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
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
    public final void v(s4.e1 e1Var, int i10) {
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
        int i23 = e1Var.f;
        View view = e1Var.a;
        ThemeActivity themeActivity = this.e;
        if (i23 == 1) {
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
            i11 = themeActivity.nightThemeRow;
            if (i10 == i11) {
                if (org.telegram.ui.ActionBar.y6.o == 0 || org.telegram.ui.ActionBar.y6.J == null) {
                    gaVar.c(LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.AutoNightThemeOff), false, false);
                    return;
                } else {
                    gaVar.c(LocaleController.getString(R.string.AutoNightTheme), org.telegram.ui.ActionBar.y6.B0(), false, false);
                    return;
                }
            }
            if (i10 == themeActivity.a0) {
                int i24 = org.telegram.ui.ActionBar.y6.r;
                int i25 = i24 / 60;
                gaVar.c(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i25), Integer.valueOf(i24 - (i25 * 60))), false, true);
                return;
            }
            if (i10 == themeActivity.b0) {
                int i26 = org.telegram.ui.ActionBar.y6.s;
                int i27 = i26 / 60;
                gaVar.c(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i27), Integer.valueOf(i26 - (i27 * 60))), false, false);
                return;
            }
            if (i10 == themeActivity.Y) {
                gaVar.c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.y6.w, false, false);
                return;
            }
            if (i10 == themeActivity.Q) {
                int i28 = MessagesController.getGlobalMainSettings().getInt("sortContactsBy", 0);
                gaVar.c(LocaleController.getString("SortBy", R.string.SortBy), i28 == 0 ? LocaleController.getString("Default", R.string.Default) : i28 == 1 ? LocaleController.getString("FirstName", R.string.SortFirstName) : LocaleController.getString("LastName", R.string.SortLastName), false, true);
                return;
            }
            if (i10 == themeActivity.P) {
                gaVar.b(LocaleController.getString("ImportContacts", R.string.ImportContacts), true);
                return;
            }
            if (i10 == themeActivity.K) {
                int i29 = SharedConfig.distanceSystemType;
                gaVar.c(LocaleController.getString("DistanceUnits", R.string.DistanceUnits), i29 == 0 ? LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic) : i29 == 1 ? LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers) : LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles), themeActivity.O0, themeActivity.D0 >= 0);
                themeActivity.O0 = false;
                return;
            } else if (i10 == themeActivity.L) {
                gaVar.c(LocaleController.getString(R.string.SearchEngine), org.telegram.ui.web.n1.a().a, themeActivity.P0, false);
                return;
            } else {
                if (i10 == themeActivity.M) {
                    gaVar.c(LocaleController.getString(R.string.MicrophoneForVoiceMessages), LocaleController.getString(SharedConfig.recordViaSco ? R.string.MicrophoneForVoiceMessagesSco : R.string.MicrophoneForVoiceMessagesBuiltIn), themeActivity.N0, false);
                    themeActivity.N0 = false;
                    return;
                }
                return;
            }
        }
        if (i23 == 2) {
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
            i9Var.setFixedSize(0);
            if (i10 == themeActivity.f0) {
                i9Var.setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (org.telegram.ui.ActionBar.y6.q * 100.0f))));
                return;
            }
            if (i10 == themeActivity.Z) {
                i9Var.setText(ThemeActivity.z0());
                return;
            }
            if (i10 == themeActivity.v0) {
                i9Var.setText(LocaleController.getString("ChatListSwipeGestureInfo", R.string.ChatListSwipeGestureInfo));
                return;
            } else if (i10 == themeActivity.G0) {
                i9Var.setText(LocaleController.getString("LiteModeInfo", R.string.LiteModeInfo));
                return;
            } else {
                i9Var.setFixedSize(12);
                i9Var.setText("");
                return;
            }
        }
        if (i23 == 4) {
            org.telegram.ui.Cells.la laVar = (org.telegram.ui.Cells.la) view;
            if (i10 == themeActivity.R) {
                laVar.a(LocaleController.getString("AutoNightDisabled", R.string.AutoNightDisabled), org.telegram.ui.ActionBar.y6.o == 0, true);
                return;
            }
            if (i10 == themeActivity.S) {
                laVar.a(LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled), org.telegram.ui.ActionBar.y6.o == 1, true);
                return;
            } else if (i10 == themeActivity.T) {
                laVar.a(LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive), org.telegram.ui.ActionBar.y6.o == 2, themeActivity.U != -1);
                return;
            } else {
                if (i10 == themeActivity.U) {
                    laVar.a(LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault), org.telegram.ui.ActionBar.y6.o == 3, false);
                    return;
                }
                return;
            }
        }
        if (i23 == 5) {
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
            if (i10 == themeActivity.W) {
                q4Var.setText(LocaleController.getString("AutoNightSchedule", R.string.AutoNightSchedule));
                return;
            }
            if (i10 == themeActivity.d0) {
                q4Var.setText(LocaleController.getString("AutoNightBrightness", R.string.AutoNightBrightness));
                return;
            }
            if (i10 == themeActivity.g0) {
                q4Var.setText(LocaleController.getString("AutoNightPreferred", R.string.AutoNightPreferred));
                return;
            }
            if (i10 == themeActivity.x) {
                q4Var.setText(LocaleController.getString("SETTINGS", R.string.SETTINGS));
                return;
            }
            if (i10 == themeActivity.i0) {
                if (themeActivity.f == 3) {
                    q4Var.setText(LocaleController.getString("BuildMyOwnTheme", R.string.BuildMyOwnTheme));
                    return;
                } else {
                    q4Var.setText(LocaleController.getString("ColorTheme", R.string.ColorTheme));
                    return;
                }
            }
            if (i10 == themeActivity.w) {
                q4Var.setText(LocaleController.getString("TextSizeHeader", R.string.TextSizeHeader));
                return;
            }
            if (i10 == themeActivity.l0) {
                q4Var.setText(LocaleController.getString("ChatList", R.string.ChatList));
                return;
            }
            if (i10 == themeActivity.j0) {
                q4Var.setText(LocaleController.getString("BubbleRadius", R.string.BubbleRadius));
                return;
            }
            if (i10 == themeActivity.t0) {
                q4Var.setText(LocaleController.getString("ChatListSwipeGesture", R.string.ChatListSwipeGesture));
                return;
            }
            if (i10 == themeActivity.w0) {
                q4Var.setText(LocaleController.getString("SelectTheme", R.string.SelectTheme));
                return;
            }
            if (i10 == themeActivity.H0) {
                q4Var.setText(LocaleController.getString(R.string.AppIcon));
                return;
            } else if (i10 == themeActivity.F0) {
                q4Var.setText(LocaleController.getString("OtherSettings", R.string.OtherSettings));
                return;
            } else {
                if (i10 == themeActivity.E0) {
                    q4Var.setText(LocaleController.getString("MediaAndSoundSettings", R.string.MediaAndSoundSettings));
                    return;
                }
                return;
            }
        }
        if (i23 == 6) {
            ((org.telegram.ui.Cells.j0) view).setProgress(org.telegram.ui.ActionBar.y6.q);
            return;
        }
        if (i23 == 7) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i10 == themeActivity.X) {
                a9Var.f(LocaleController.getString("AutoNightLocation", R.string.AutoNightLocation), org.telegram.ui.ActionBar.y6.p, true);
                return;
            }
            if (i10 == themeActivity.N) {
                a9Var.f(LocaleController.getString("EnableAnimations", R.string.EnableAnimations), MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), true);
                return;
            }
            if (i10 == themeActivity.G) {
                a9Var.f(LocaleController.getString("SendByEnter", R.string.SendByEnter), MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false), true);
                return;
            }
            if (i10 == themeActivity.E) {
                a9Var.g(LocaleController.getString("RaiseToSpeak", R.string.RaiseToSpeak), LocaleController.getString("RaiseToSpeakInfo", R.string.RaiseToSpeakInfo), SharedConfig.raiseToSpeak, true, true);
                return;
            }
            i12 = themeActivity.raiseToListenRow;
            if (i10 == i12) {
                a9Var.g(LocaleController.getString("RaiseToListen", R.string.RaiseToListen), LocaleController.getString("RaiseToListenInfo", R.string.RaiseToListenInfo), SharedConfig.raiseToListen, true, true);
                return;
            }
            if (i10 == themeActivity.F) {
                a9Var.g(LocaleController.getString("NextMediaTap", R.string.NextMediaTap), LocaleController.getString("NextMediaTapInfo", R.string.NextMediaTapInfo), SharedConfig.nextMediaTap, true, true);
                return;
            }
            i13 = themeActivity.pauseOnRecordRow;
            if (i10 == i13) {
                a9Var.g(LocaleController.getString(R.string.PauseMusicOnRecord), LocaleController.getString("PauseMusicOnRecordInfo", R.string.PauseMusicOnRecordInfo), SharedConfig.pauseMusicOnRecord, true, true);
                return;
            }
            i14 = themeActivity.pauseOnMediaRow;
            if (i10 == i14) {
                a9Var.f(LocaleController.getString(R.string.PauseMusicOnMedia), SharedConfig.pauseMusicOnMedia, true);
                return;
            }
            if (i10 == themeActivity.y) {
                a9Var.g(LocaleController.getString("DirectShare", R.string.DirectShare), LocaleController.getString("DirectShareInfo", R.string.DirectShareInfo), SharedConfig.directShare, false, true);
                return;
            }
            i15 = themeActivity.sensitiveContentRow;
            if (i10 == i15) {
                a9Var.g(LocaleController.getString(R.string.ShowSensitiveContent), LocaleController.getString(R.string.ShowSensitiveContentInfo), themeActivity.getMessagesController().showSensitiveContent(), true, true);
                return;
            } else {
                if (i10 == themeActivity.s0) {
                    a9Var.f(LocaleController.getString("BlurInChat", R.string.BlurInChat), SharedConfig.chatBlurEnabled(), true);
                    return;
                }
                return;
            }
        }
        if (i23 == 14) {
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
            v8Var.v = 48;
            i16 = themeActivity.backgroundRow;
            if (i10 == i16) {
                v8Var.setSubtitle(null);
                int i30 = org.telegram.ui.ActionBar.y6.q6;
                v8Var.g(i30, i30);
                String string = LocaleController.getString(R.string.ChangeChatBackground);
                int i31 = R.drawable.msg_background;
                i20 = themeActivity.changeUserColor;
                v8Var.o(i31, string, i20 >= 0);
                return;
            }
            if (i10 == themeActivity.y0) {
                v8Var.setSubtitle(null);
                int i32 = org.telegram.ui.ActionBar.y6.q6;
                v8Var.g(i32, i32);
                v8Var.o(R.drawable.msg_theme, LocaleController.getString(R.string.EditCurrentTheme), true);
                return;
            }
            i17 = themeActivity.createNewThemeRow;
            if (i10 == i17) {
                v8Var.setSubtitle(null);
                int i33 = org.telegram.ui.ActionBar.y6.q6;
                v8Var.g(i33, i33);
                v8Var.o(R.drawable.msg_colors, LocaleController.getString(R.string.CreateNewTheme), false);
                return;
            }
            i18 = themeActivity.liteModeRow;
            if (i10 == i18) {
                v8Var.g(org.telegram.ui.ActionBar.y6.J5, org.telegram.ui.ActionBar.y6.G6);
                v8Var.o(R.drawable.msg2_animations, LocaleController.getString(R.string.LiteMode), true);
                v8Var.setSubtitle(LocaleController.getString(R.string.LiteModeInfo));
                v8Var.v = 60;
                v8Var.s = 64;
                v8Var.w = 20;
                return;
            }
            i19 = themeActivity.stickersRow;
            if (i10 == i19) {
                v8Var.g(org.telegram.ui.ActionBar.y6.J5, org.telegram.ui.ActionBar.y6.G6);
                v8Var.o(R.drawable.msg2_sticker, LocaleController.getString(R.string.StickersName), false);
                v8Var.setSubtitle(LocaleController.getString(R.string.StickersNameInfo2));
                v8Var.s = 64;
                v8Var.v = 60;
                v8Var.w = 20;
                return;
            }
            return;
        }
        if (i23 == 17) {
            ((tu) view).a();
            return;
        }
        if (i23 == 19) {
            org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) view;
            if (i10 == themeActivity.H) {
                n6Var.b("save media only from peer chats", "", true, false);
                return;
            } else {
                n6Var.b("save media from all chats", "", true, false);
                return;
            }
        }
        if (i23 == 21) {
            ((yo0) view).set(themeActivity.getUserConfig().getCurrentUser());
            return;
        }
        switch (i23) {
            case 10:
                org.telegram.ui.Cells.n5 n5Var = (org.telegram.ui.Cells.n5) view;
                i21 = themeActivity.nightThemeRow;
                if (i10 != i21) {
                    i22 = themeActivity.browserRow;
                    if (i10 == i22) {
                        n5Var.b(LocaleController.getString(R.string.InappBrowser), LocaleController.getString(R.string.InappBrowserInfo), R.drawable.msg2_language, themeActivity.getMessagesController().isWebBrowserInAppEnabled(), 0, false, true, false);
                        break;
                    }
                } else {
                    boolean z10 = org.telegram.ui.ActionBar.y6.o != 0;
                    String B0 = z10 ? org.telegram.ui.ActionBar.y6.B0() : LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
                    if (z10) {
                        int i34 = org.telegram.ui.ActionBar.y6.o;
                        B0 = a1.g.D(i34 == 1 ? LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled) : i34 == 3 ? LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault) : LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive), " ", B0);
                    }
                    n5Var.b(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), B0, R.drawable.menu_night_mode_24, z10, 0, false, true, false);
                    break;
                }
                break;
            case 11:
                if (this.d) {
                    themeActivity.c.D1(themeActivity.b.getMeasuredWidth());
                    this.d = false;
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.nm0 nm0Var = (org.telegram.ui.Components.nm0) view;
                fb1 fb1Var = (fb1) nm0Var.getAdapter();
                fb1Var.l();
                int indexOf = fb1Var.e.indexOf(fb1Var.d.k(false));
                if (indexOf == -1) {
                    indexOf = fb1Var.h() - 1;
                }
                if (indexOf != -1) {
                    ((s4.c0) nm0Var.getLayoutManager()).h1(indexOf, (themeActivity.b.getMeasuredWidth() / 2) - AndroidUtilities.dp(42.0f));
                    break;
                }
                break;
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        org.telegram.ui.ActionBar.j5 j5Var;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.u6 u6Var = null;
        ThemeActivity themeActivity = this.e;
        Context context = this.c;
        switch (i10) {
            case 1:
                view = new org.telegram.ui.Cells.ga(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.i9(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.f7(context, (d3) null);
                break;
            case 4:
                org.telegram.ui.Cells.la laVar = new org.telegram.ui.Cells.la(context);
                laVar.setWillNotDraw(false);
                TextView textView = new TextView(context);
                laVar.a = textView;
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
                org.telegram.messenger.wh.r(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                boolean z10 = LocaleController.isRTL;
                laVar.addView(textView, org.telegram.ui.Components.kb1.h(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 71.0f : 21.0f, 0.0f, z10 ? 21.0f : 23.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                laVar.b = imageView;
                org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.Mh, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(R.drawable.sticker_added);
                laVar.addView(imageView, org.telegram.ui.Components.kb1.h(19, 14.0f, (LocaleController.isRTL ? 3 : 5) | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                view = laVar;
                break;
            case 5:
                view = new org.telegram.ui.Cells.q4(context);
                break;
            case 6:
                view = new ya1(this, context);
                break;
            case 7:
                view = new org.telegram.ui.Cells.a9(context);
                break;
            case 8:
                view = new eb1(themeActivity, context);
                break;
            case 9:
                za1 za1Var = new za1(context);
                za1Var.b = new org.telegram.ui.Cells.x0[2];
                za1Var.setOrientation(0);
                za1Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), 0);
                int i14 = 0;
                while (true) {
                    org.telegram.ui.Cells.x0[] x0VarArr = (org.telegram.ui.Cells.x0[]) za1Var.b;
                    if (i14 >= x0VarArr.length) {
                        view = za1Var;
                        break;
                    } else {
                        boolean z11 = i14 == 1;
                        org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(context);
                        x0Var.c = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        x0Var.d = textPaint;
                        x0Var.setWillNotDraw(false);
                        x0Var.b = z11;
                        x0Var.setContentDescription(LocaleController.getString(z11 ? R.string.ChatListExpanded : R.string.ChatListDefault));
                        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(x0Var, context);
                        x0Var.a = w0Var;
                        w0Var.setSize(AndroidUtilities.dp(20.0f));
                        x0Var.addView(w0Var, org.telegram.ui.Components.kb1.h(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        w0Var.a((z11 && SharedConfig.useThreeLinesLayout) || !(z11 || SharedConfig.useThreeLinesLayout), false);
                        x0VarArr[i14] = x0Var;
                        za1Var.addView(((org.telegram.ui.Cells.x0[]) za1Var.b)[i14], org.telegram.ui.Components.kb1.q(0.5f, -1, -1, i14 == 1 ? 10 : 0, 0, 0));
                        ((org.telegram.ui.Cells.x0[]) za1Var.b)[i14].setOnClickListener(new di.g2(3, za1Var, z11));
                        i14++;
                    }
                }
                break;
            case 10:
                view = new org.telegram.ui.Cells.n5(21, 60, this.c, null, true);
                break;
            case 11:
                this.d = true;
                ab1 ab1Var = new ab1(this, this.c, themeActivity, themeActivity.f, themeActivity.e, themeActivity.d);
                themeActivity.c = ab1Var;
                ab1Var.setDrawDivider(themeActivity.v);
                themeActivity.c.setFocusable(false);
                View view2 = themeActivity.c;
                view2.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(148.0f)));
                view = view2;
                break;
            case 12:
                bb1 bb1Var = new bb1(context, 0, u6Var);
                bb1Var.setFocusable(false);
                bb1Var.setItemAnimator(null);
                bb1Var.setLayoutAnimation(null);
                bb1Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
                bb1Var.setClipToPadding(false);
                s4.c0 c0Var = new s4.c0();
                c0Var.k1(0);
                bb1Var.setLayoutManager(c0Var);
                fb1 fb1Var = new fb1(themeActivity, context);
                bb1Var.setAdapter(fb1Var);
                bb1Var.setOnItemClickListener(new wa1(this, fb1Var, bb1Var, 0));
                bb1Var.setOnItemLongClickListener(new cf0(24, this, fb1Var));
                bb1Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(62.0f)));
                view = bb1Var;
                break;
            case 13:
                view = new ta1(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                view = new org.telegram.ui.Cells.v8(context);
                break;
            case 15:
                i11 = ((org.telegram.ui.ActionBar.r2) themeActivity).currentAccount;
                view = new org.telegram.ui.Components.a01(context, i11);
                break;
            case 16:
                j5Var = ((org.telegram.ui.ActionBar.r2) themeActivity).parentLayout;
                View cb1Var = new cb1(context, j5Var, 0);
                cb1Var.setImportantForAccessibility(4);
                view = cb1Var;
                break;
            case 17:
                View tuVar = new tu(themeActivity.f, context, themeActivity);
                tuVar.setFocusable(false);
                tuVar.setLayoutParams(new s4.q0(-1, -2));
                view = tuVar;
                break;
            case 19:
                view = new org.telegram.ui.Cells.n6(context, false);
                break;
            case 20:
                i12 = ((org.telegram.ui.ActionBar.r2) themeActivity).currentAccount;
                org.telegram.ui.Cells.t tVar = new org.telegram.ui.Cells.t(context, null);
                tVar.f3 = new ArrayList();
                tVar.h3 = i12;
                tVar.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                tVar.setFocusable(false);
                tVar.setItemAnimator(null);
                tVar.setLayoutAnimation(null);
                s4.c0 c0Var2 = new s4.c0(0, false);
                tVar.g3 = c0Var2;
                tVar.setLayoutManager(c0Var2);
                int i15 = 1;
                tVar.setAdapter(new c8(tVar, i15));
                tVar.i(new fi.p1(tVar, i15));
                tVar.setOnItemClickListener(new di.g0(tVar, themeActivity, context, 3));
                tVar.C1();
                view = tVar;
                break;
            case 21:
                i13 = ((org.telegram.ui.ActionBar.r2) themeActivity).currentAccount;
                view = new yo0(i13, 0L, this.c, themeActivity.getResourceProvider());
                break;
        }
        return new org.telegram.ui.Components.wl0(view);
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        if (e1Var.f == 4) {
            ((org.telegram.ui.Cells.la) e1Var.a).setTypeChecked(e1Var.b() == org.telegram.ui.ActionBar.y6.o);
        }
    }
}
