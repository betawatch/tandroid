package org.telegram.ui;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class n71 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ SessionsActivity d;

    public n71(SessionsActivity sessionsActivity, Context context) {
        this.d = sessionsActivity;
        this.c = context;
        C(true);
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int i10;
        int i11;
        int b10 = e1Var.b();
        SessionsActivity sessionsActivity = this.d;
        i10 = sessionsActivity.terminateAllSessionsRow;
        if (b10 == i10) {
            return true;
        }
        if (b10 >= sessionsActivity.J && b10 < sessionsActivity.K) {
            return true;
        }
        if (b10 >= sessionsActivity.L && b10 < sessionsActivity.M) {
            return true;
        }
        if ((b10 >= sessionsActivity.F && b10 < sessionsActivity.G) || b10 == sessionsActivity.x) {
            return true;
        }
        i11 = sessionsActivity.ttlRow;
        return b10 == i11;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.R;
    }

    @Override // s4.h0
    public final long i(int i10) {
        int i11;
        int i12;
        int hash;
        SessionsActivity sessionsActivity = this.d;
        i11 = sessionsActivity.terminateAllSessionsRow;
        if (i10 == i11) {
            hash = Objects.hash(0, 0);
        } else if (i10 == sessionsActivity.y) {
            hash = Objects.hash(0, 1);
        } else if (i10 == sessionsActivity.N) {
            hash = Objects.hash(0, 2);
        } else if (i10 == sessionsActivity.H) {
            hash = Objects.hash(0, 3);
        } else if (i10 == sessionsActivity.Q) {
            hash = Objects.hash(0, 4);
        } else if (i10 == sessionsActivity.T) {
            hash = Objects.hash(0, 5);
        } else if (i10 == sessionsActivity.O) {
            hash = Objects.hash(0, 6);
        } else if (i10 == sessionsActivity.w) {
            hash = Objects.hash(0, 7);
        } else if (i10 == sessionsActivity.I) {
            hash = Objects.hash(0, 8);
        } else if (i10 == sessionsActivity.E) {
            hash = Objects.hash(0, 9);
        } else if (i10 == sessionsActivity.S) {
            hash = Objects.hash(0, 10);
        } else if (i10 == sessionsActivity.x) {
            hash = Objects.hash(0, 11);
        } else {
            int i13 = sessionsActivity.J;
            if (i10 < i13 || i10 >= sessionsActivity.K) {
                int i14 = sessionsActivity.L;
                if (i10 < i14 || i10 >= sessionsActivity.M) {
                    int i15 = sessionsActivity.F;
                    if (i10 >= i15 && i10 < sessionsActivity.G) {
                        TLObject tLObject = (TLObject) sessionsActivity.e.get(i10 - i15);
                        if (tLObject instanceof TLRPC.TL_authorization) {
                            hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_authorization) tLObject).hash));
                        } else {
                            if (tLObject instanceof TLRPC.TL_webAuthorization) {
                                hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject).hash));
                            }
                            hash = Objects.hash(0, -1);
                        }
                    } else if (i10 == sessionsActivity.P) {
                        hash = Objects.hash(0, 12);
                    } else {
                        i12 = sessionsActivity.ttlRow;
                        if (i10 == i12) {
                            hash = Objects.hash(0, 13);
                        }
                        hash = Objects.hash(0, -1);
                    }
                } else {
                    hash = Objects.hash(3, Long.valueOf(((TL_account.TL_connectedBot) sessionsActivity.f.get(i10 - i14)).bot_id));
                }
            } else {
                TLObject tLObject2 = (TLObject) sessionsActivity.d.get(i10 - i13);
                if (tLObject2 instanceof TLRPC.TL_authorization) {
                    hash = Objects.hash(1, Long.valueOf(((TLRPC.TL_authorization) tLObject2).hash));
                } else {
                    if (tLObject2 instanceof TLRPC.TL_webAuthorization) {
                        hash = Objects.hash(1, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject2).hash));
                    }
                    hash = Objects.hash(0, -1);
                }
            }
        }
        return hash;
    }

    @Override // s4.h0
    public final int j(int i10) {
        int i11;
        int i12;
        SessionsActivity sessionsActivity = this.d;
        i11 = sessionsActivity.terminateAllSessionsRow;
        if (i10 == i11) {
            return 0;
        }
        if (i10 == sessionsActivity.y || i10 == sessionsActivity.N || i10 == sessionsActivity.H || i10 == sessionsActivity.Q || i10 == sessionsActivity.T || i10 == sessionsActivity.O) {
            return 1;
        }
        if (i10 == sessionsActivity.w || i10 == sessionsActivity.I || i10 == sessionsActivity.E || i10 == sessionsActivity.S) {
            return 2;
        }
        if (i10 == sessionsActivity.x) {
            return 4;
        }
        if (i10 >= sessionsActivity.J && i10 < sessionsActivity.K) {
            return 4;
        }
        if (i10 >= sessionsActivity.L && i10 < sessionsActivity.M) {
            return 4;
        }
        if (i10 >= sessionsActivity.F && i10 < sessionsActivity.G) {
            return 4;
        }
        if (i10 == sessionsActivity.P) {
            return 5;
        }
        i12 = sessionsActivity.ttlRow;
        return i10 == i12 ? 6 : 0;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        int i12 = e1Var.f;
        if (i12 == 0) {
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) e1Var.a;
            i11 = this.d.terminateAllSessionsRow;
            if (i10 != i11) {
                if (i10 == this.d.P) {
                    int i13 = org.telegram.ui.ActionBar.y6.q6;
                    v8Var.g(i13, i13);
                    v8Var.setTag(Integer.valueOf(i13));
                    v8Var.o(R.drawable.msg_qrcode, LocaleController.getString(R.string.AuthAnotherClient), !this.d.d.isEmpty());
                    return;
                }
                return;
            }
            int i14 = org.telegram.ui.ActionBar.y6.p7;
            v8Var.g(i14, i14);
            v8Var.setTag(Integer.valueOf(i14));
            if (this.d.v == 0) {
                v8Var.o(R.drawable.msg_block2, LocaleController.getString(R.string.TerminateAllSessions), false);
                return;
            } else {
                v8Var.o(R.drawable.msg_block2, LocaleController.getString(R.string.TerminateAllWebSessions), false);
                return;
            }
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) e1Var.a;
            i9Var.setFixedSize(0);
            SessionsActivity sessionsActivity = this.d;
            if (i10 == sessionsActivity.y) {
                if (sessionsActivity.v == 0) {
                    i9Var.setText(LocaleController.getString(R.string.ClearOtherSessionsHelp));
                    return;
                } else {
                    i9Var.setText(LocaleController.getString(R.string.ClearOtherWebSessionsHelp));
                    return;
                }
            }
            if (i10 == sessionsActivity.N) {
                if (sessionsActivity.v != 0) {
                    i9Var.setText(LocaleController.getString(R.string.TerminateWebSessionInfo));
                    return;
                } else if (sessionsActivity.d.isEmpty()) {
                    i9Var.setText("");
                    return;
                } else {
                    i9Var.setText(LocaleController.getString(R.string.SessionsListInfo));
                    return;
                }
            }
            if (i10 == sessionsActivity.H) {
                i9Var.setText(LocaleController.getString(R.string.LoginAttemptsInfo));
                return;
            } else {
                if (i10 == sessionsActivity.Q || i10 == sessionsActivity.T || i10 == sessionsActivity.O) {
                    i9Var.setText("");
                    i9Var.setFixedSize(12);
                    return;
                }
                return;
            }
        }
        if (i12 == 2) {
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) e1Var.a;
            SessionsActivity sessionsActivity2 = this.d;
            if (i10 == sessionsActivity2.w) {
                q4Var.setText(LocaleController.getString(R.string.CurrentSession));
                return;
            }
            if (i10 == sessionsActivity2.I) {
                if (sessionsActivity2.v == 0) {
                    q4Var.setText(LocaleController.getString(R.string.OtherSessions));
                    return;
                } else {
                    q4Var.setText(LocaleController.getString(R.string.OtherWebSessions));
                    return;
                }
            }
            if (i10 == sessionsActivity2.E) {
                q4Var.setText(LocaleController.getString(R.string.LoginAttempts));
                return;
            } else {
                if (i10 == sessionsActivity2.S) {
                    q4Var.setText(LocaleController.getString(R.string.TerminateOldSessionHeader));
                    return;
                }
                return;
            }
        }
        if (i12 != 5) {
            if (i12 == 6) {
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) e1Var.a;
                int i15 = this.d.s;
                gaVar.c(LocaleController.getString(R.string.IfInactiveFor), (i15 <= 30 || i15 > 183) ? i15 == 365 ? LocaleController.formatPluralString("Years", i15 / 365, new Object[0]) : LocaleController.formatPluralString("Weeks", i15 / 7, new Object[0]) : LocaleController.formatPluralString("Months", i15 / 30, new Object[0]), true, false);
                return;
            }
            org.telegram.ui.Cells.z6 z6Var = (org.telegram.ui.Cells.z6) e1Var.a;
            SessionsActivity sessionsActivity3 = this.d;
            if (i10 != sessionsActivity3.x) {
                int i16 = sessionsActivity3.J;
                if (i10 >= i16 && i10 < sessionsActivity3.K) {
                    z6Var.c((TLObject) sessionsActivity3.d.get(i10 - i16), i10 != this.d.K - 1);
                    return;
                }
                int i17 = sessionsActivity3.L;
                if (i10 < i17 || i10 >= sessionsActivity3.M) {
                    int i18 = sessionsActivity3.F;
                    if (i10 < i18 || i10 >= sessionsActivity3.G) {
                        return;
                    }
                    z6Var.c((TLObject) sessionsActivity3.e.get(i10 - i18), i10 != this.d.G - 1);
                    return;
                }
                int i19 = i10 - i17;
                ArrayList arrayList = sessionsActivity3.f;
                if (arrayList == null || i19 < 0 || i19 >= arrayList.size()) {
                    return;
                }
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.d.f.get(i19);
                SessionsActivity sessionsActivity4 = this.d;
                if (i10 != sessionsActivity4.M - 1 && i10 != sessionsActivity4.K - 1) {
                    r1 = true;
                }
                z6Var.c(tL_connectedBot, r1);
                return;
            }
            TLRPC.TL_authorization tL_authorization = sessionsActivity3.h;
            if (tL_authorization == null) {
                tL_authorization = new TLRPC.TL_authorization();
                tL_authorization.flags = 1;
                tL_authorization.current = true;
                tL_authorization.platform = "Android";
                tL_authorization.device_model = Build.MANUFACTURER + " " + Build.MODEL;
                StringBuilder sb2 = new StringBuilder("SDK ");
                sb2.append(Build.VERSION.SDK_INT);
                tL_authorization.system_version = sb2.toString();
                tL_authorization.app_name = "Telegram Android";
                tL_authorization.app_version = "";
                try {
                    PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                    tL_authorization.app_version = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        tL_authorization.app_version += " pbeta";
                    } else if (BuildVars.DEBUG_VERSION) {
                        tL_authorization.app_version += " beta";
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                tL_authorization.country = "";
                tL_authorization.region = "";
                tL_authorization.ip = "";
            }
            z6Var.c(tL_authorization, (this.d.d.isEmpty() && this.d.e.isEmpty() && this.d.P == -1) ? false : true);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.v8(context);
        } else if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.i9(context);
        } else if (i10 != 2) {
            SessionsActivity sessionsActivity = this.d;
            if (i10 == 5) {
                frameLayout = new o71(sessionsActivity, context);
            } else if (i10 != 6) {
                int i11 = sessionsActivity.v;
                org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context);
                z6Var.s = new org.telegram.ui.Components.h6(z6Var);
                z6Var.w = UserConfig.selectedAccount;
                LinearLayout linearLayout = new LinearLayout(context);
                z6Var.v = linearLayout;
                linearLayout.setOrientation(0);
                linearLayout.setWeightSum(1.0f);
                z6Var.a = i11;
                int i12 = 21;
                if (i11 == 1) {
                    boolean z10 = LocaleController.isRTL;
                    z6Var.addView(linearLayout, org.telegram.ui.Components.gb1.h(-1, 30.0f, (z10 ? 5 : 3) | 48, z10 ? 15 : 49, 11.0f, z10 ? 49 : 15, 0.0f));
                    org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
                    z6Var.n = j9Var;
                    j9Var.u(AndroidUtilities.dp(10.0f));
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
                    z6Var.h = y9Var;
                    y9Var.setRoundRadius(AndroidUtilities.dp(10.0f));
                    boolean z11 = LocaleController.isRTL;
                    z6Var.addView(y9Var, org.telegram.ui.Components.gb1.h(20, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 0 : 21, 13.0f, z11 ? 21 : 0, 0.0f));
                } else {
                    org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context);
                    z6Var.f = y9Var2;
                    y9Var2.setRoundRadius(AndroidUtilities.dp(10.0f));
                    boolean z12 = LocaleController.isRTL;
                    z6Var.addView(y9Var2, org.telegram.ui.Components.gb1.h(42, 42.0f, (z12 ? 5 : 3) | 48, z12 ? 0 : 16, 9.0f, z12 ? 16 : 0, 0.0f));
                    z6Var.n = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
                    org.telegram.ui.Components.y9 y9Var3 = new org.telegram.ui.Components.y9(context);
                    z6Var.h = y9Var3;
                    y9Var3.setRoundRadius(AndroidUtilities.dp(10.0f));
                    boolean z13 = LocaleController.isRTL;
                    z6Var.addView(y9Var3, org.telegram.ui.Components.gb1.h(42, 42.0f, (z13 ? 5 : 3) | 48, z13 ? 0 : 16, 9.0f, z13 ? 16 : 0, 0.0f));
                    boolean z14 = LocaleController.isRTL;
                    z6Var.addView(linearLayout, org.telegram.ui.Components.gb1.h(-1, 30.0f, (z14 ? 5 : 3) | 48, z14 ? 15 : 72, 6.333f, z14 ? 72 : 15, 0.0f));
                }
                TextView textView = new TextView(context);
                z6Var.b = textView;
                int i13 = org.telegram.ui.ActionBar.y6.G6;
                org.telegram.ui.ActionBar.f7.V(textView, i13, null);
                textView.setTextSize(1, i11 == 0 ? 15.0f : 16.0f);
                textView.setLines(1);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                TextView textView2 = new TextView(context);
                z6Var.c = textView2;
                textView2.setTextSize(1, i11 == 0 ? 12.0f : 13.0f);
                textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                if (LocaleController.isRTL) {
                    linearLayout.addView(textView2, org.telegram.ui.Components.gb1.x(-2, -1, 51, 0, 2, 0, 0));
                    linearLayout.addView(textView, org.telegram.ui.Components.gb1.t(0, -1, 1.0f, 53, 10, 0, 0, 0));
                } else {
                    linearLayout.addView(textView, org.telegram.ui.Components.gb1.t(0, -1, 1.0f, 51, 0, 0, 10, 0));
                    linearLayout.addView(textView2, org.telegram.ui.Components.gb1.x(-2, -1, 53, 0, 2, 0, 0));
                }
                if (!LocaleController.isRTL) {
                    i12 = i11 != 0 ? 21 : 72;
                    r8 = 21;
                } else if (i11 != 0) {
                    r8 = 21;
                }
                TextView textView3 = new TextView(context);
                z6Var.d = textView3;
                org.telegram.ui.ActionBar.f7.V(textView3, i13, null);
                org.telegram.messenger.vh.r(textView3, 1, i11 == 0 ? 13.0f : 14.0f, 1, 1);
                textView3.setSingleLine(true);
                textView3.setEllipsize(truncateAt);
                textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                float f7 = i12;
                float f10 = r8;
                z6Var.addView(textView3, org.telegram.ui.Components.gb1.h(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, f7, i11 == 0 ? 28.0f : 36.0f, f10, 0.0f));
                TextView textView4 = new TextView(context);
                z6Var.e = textView4;
                org.telegram.ui.ActionBar.f7.V(textView4, org.telegram.ui.ActionBar.y6.A6, null);
                org.telegram.messenger.vh.r(textView4, 1, i11 != 0 ? 14.0f : 13.0f, 1, 1);
                textView4.setSingleLine(true);
                textView4.setEllipsize(truncateAt);
                textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                z6Var.addView(textView4, org.telegram.ui.Components.gb1.h(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, f7, i11 == 0 ? 46.0f : 59.0f, f10, 0.0f));
                frameLayout = z6Var;
            } else {
                frameLayout = new org.telegram.ui.Cells.ga(context);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.q4(context);
        }
        return new org.telegram.ui.Components.vl0(frameLayout);
    }
}
