package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n71 extends org.telegram.ui.Components.il0 {
    public final Context c;
    public final /* synthetic */ SessionsActivity d;

    public n71(SessionsActivity sessionsActivity, Context context) {
        this.d = sessionsActivity;
        this.c = context;
        C(true);
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10;
        int i11;
        int b10 = n1Var.b();
        SessionsActivity sessionsActivity = this.d;
        i10 = sessionsActivity.terminateAllSessionsRow;
        if (b10 == i10) {
            return true;
        }
        if (b10 >= sessionsActivity.G && b10 < sessionsActivity.H) {
            return true;
        }
        if (b10 >= sessionsActivity.I && b10 < sessionsActivity.J) {
            return true;
        }
        if ((b10 >= sessionsActivity.C && b10 < sessionsActivity.D) || b10 == sessionsActivity.y) {
            return true;
        }
        i11 = sessionsActivity.ttlRow;
        return b10 == i11;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.O;
    }

    @Override // f2.p0
    public final long i(int i10) {
        int i11;
        int i12;
        int hash;
        SessionsActivity sessionsActivity = this.d;
        i11 = sessionsActivity.terminateAllSessionsRow;
        if (i10 == i11) {
            hash = Objects.hash(0, 0);
        } else if (i10 == sessionsActivity.A) {
            hash = Objects.hash(0, 1);
        } else if (i10 == sessionsActivity.K) {
            hash = Objects.hash(0, 2);
        } else if (i10 == sessionsActivity.E) {
            hash = Objects.hash(0, 3);
        } else if (i10 == sessionsActivity.N) {
            hash = Objects.hash(0, 4);
        } else if (i10 == sessionsActivity.Q) {
            hash = Objects.hash(0, 5);
        } else if (i10 == sessionsActivity.L) {
            hash = Objects.hash(0, 6);
        } else if (i10 == sessionsActivity.x) {
            hash = Objects.hash(0, 7);
        } else if (i10 == sessionsActivity.F) {
            hash = Objects.hash(0, 8);
        } else if (i10 == sessionsActivity.B) {
            hash = Objects.hash(0, 9);
        } else if (i10 == sessionsActivity.P) {
            hash = Objects.hash(0, 10);
        } else if (i10 == sessionsActivity.y) {
            hash = Objects.hash(0, 11);
        } else {
            int i13 = sessionsActivity.G;
            if (i10 < i13 || i10 >= sessionsActivity.H) {
                int i14 = sessionsActivity.I;
                if (i10 < i14 || i10 >= sessionsActivity.J) {
                    int i15 = sessionsActivity.C;
                    if (i10 >= i15 && i10 < sessionsActivity.D) {
                        TLObject tLObject = (TLObject) sessionsActivity.f.get(i10 - i15);
                        if (tLObject instanceof TLRPC.TL_authorization) {
                            hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_authorization) tLObject).hash));
                        } else {
                            if (tLObject instanceof TLRPC.TL_webAuthorization) {
                                hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject).hash));
                            }
                            hash = Objects.hash(0, -1);
                        }
                    } else if (i10 == sessionsActivity.M) {
                        hash = Objects.hash(0, 12);
                    } else {
                        i12 = sessionsActivity.ttlRow;
                        if (i10 == i12) {
                            hash = Objects.hash(0, 13);
                        }
                        hash = Objects.hash(0, -1);
                    }
                } else {
                    hash = Objects.hash(3, Long.valueOf(((TL_account.TL_connectedBot) sessionsActivity.h.get(i10 - i14)).bot_id));
                }
            } else {
                TLObject tLObject2 = (TLObject) sessionsActivity.e.get(i10 - i13);
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

    @Override // f2.p0
    public final int j(int i10) {
        int i11;
        int i12;
        SessionsActivity sessionsActivity = this.d;
        i11 = sessionsActivity.terminateAllSessionsRow;
        if (i10 == i11) {
            return 0;
        }
        if (i10 == sessionsActivity.A || i10 == sessionsActivity.K || i10 == sessionsActivity.E || i10 == sessionsActivity.N || i10 == sessionsActivity.Q || i10 == sessionsActivity.L) {
            return 1;
        }
        if (i10 == sessionsActivity.x || i10 == sessionsActivity.F || i10 == sessionsActivity.B || i10 == sessionsActivity.P) {
            return 2;
        }
        if (i10 == sessionsActivity.y) {
            return 4;
        }
        if (i10 >= sessionsActivity.G && i10 < sessionsActivity.H) {
            return 4;
        }
        if (i10 >= sessionsActivity.I && i10 < sessionsActivity.J) {
            return 4;
        }
        if (i10 >= sessionsActivity.C && i10 < sessionsActivity.D) {
            return 4;
        }
        if (i10 == sessionsActivity.M) {
            return 5;
        }
        i12 = sessionsActivity.ttlRow;
        return i10 == i12 ? 6 : 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        int i12 = n1Var.f;
        if (i12 == 0) {
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) n1Var.a;
            i11 = this.d.terminateAllSessionsRow;
            if (i10 != i11) {
                if (i10 == this.d.M) {
                    int i13 = org.telegram.ui.ActionBar.g6.q6;
                    m8Var.e(i13, i13);
                    m8Var.setTag(Integer.valueOf(i13));
                    m8Var.m(R.drawable.msg_qrcode, LocaleController.getString(R.string.AuthAnotherClient), !this.d.e.isEmpty());
                    return;
                }
                return;
            }
            int i14 = org.telegram.ui.ActionBar.g6.p7;
            m8Var.e(i14, i14);
            m8Var.setTag(Integer.valueOf(i14));
            if (this.d.w == 0) {
                m8Var.m(R.drawable.msg_block2, LocaleController.getString(R.string.TerminateAllSessions), false);
                return;
            } else {
                m8Var.m(R.drawable.msg_block2, LocaleController.getString(R.string.TerminateAllWebSessions), false);
                return;
            }
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) n1Var.a;
            y8Var.setFixedSize(0);
            SessionsActivity sessionsActivity = this.d;
            if (i10 == sessionsActivity.A) {
                if (sessionsActivity.w == 0) {
                    y8Var.setText(LocaleController.getString(R.string.ClearOtherSessionsHelp));
                    return;
                } else {
                    y8Var.setText(LocaleController.getString(R.string.ClearOtherWebSessionsHelp));
                    return;
                }
            }
            if (i10 == sessionsActivity.K) {
                if (sessionsActivity.w != 0) {
                    y8Var.setText(LocaleController.getString(R.string.TerminateWebSessionInfo));
                    return;
                } else if (sessionsActivity.e.isEmpty()) {
                    y8Var.setText("");
                    return;
                } else {
                    y8Var.setText(LocaleController.getString(R.string.SessionsListInfo));
                    return;
                }
            }
            if (i10 == sessionsActivity.E) {
                y8Var.setText(LocaleController.getString(R.string.LoginAttemptsInfo));
                return;
            } else {
                if (i10 == sessionsActivity.N || i10 == sessionsActivity.Q || i10 == sessionsActivity.L) {
                    y8Var.setText("");
                    y8Var.setFixedSize(12);
                    return;
                }
                return;
            }
        }
        if (i12 == 2) {
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) n1Var.a;
            SessionsActivity sessionsActivity2 = this.d;
            if (i10 == sessionsActivity2.x) {
                k4Var.setText(LocaleController.getString(R.string.CurrentSession));
                return;
            }
            if (i10 == sessionsActivity2.F) {
                if (sessionsActivity2.w == 0) {
                    k4Var.setText(LocaleController.getString(R.string.OtherSessions));
                    return;
                } else {
                    k4Var.setText(LocaleController.getString(R.string.OtherWebSessions));
                    return;
                }
            }
            if (i10 == sessionsActivity2.B) {
                k4Var.setText(LocaleController.getString(R.string.LoginAttempts));
                return;
            } else {
                if (i10 == sessionsActivity2.P) {
                    k4Var.setText(LocaleController.getString(R.string.TerminateOldSessionHeader));
                    return;
                }
                return;
            }
        }
        if (i12 != 5) {
            if (i12 == 6) {
                org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) n1Var.a;
                int i15 = this.d.v;
                y9Var.c(LocaleController.getString(R.string.IfInactiveFor), (i15 <= 30 || i15 > 183) ? i15 == 365 ? LocaleController.formatPluralString("Years", i15 / 365, new Object[0]) : LocaleController.formatPluralString("Weeks", i15 / 7, new Object[0]) : LocaleController.formatPluralString("Months", i15 / 30, new Object[0]), true, false);
                return;
            }
            org.telegram.ui.Cells.r6 r6Var = (org.telegram.ui.Cells.r6) n1Var.a;
            SessionsActivity sessionsActivity3 = this.d;
            if (i10 == sessionsActivity3.y) {
                TLRPC.TL_authorization tL_authorization = sessionsActivity3.n;
                if (tL_authorization != null) {
                    r6Var.c(tL_authorization, (sessionsActivity3.e.isEmpty() && this.d.f.isEmpty() && this.d.M == -1) ? false : true);
                    return;
                }
                r6Var.w = sessionsActivity3.d;
                r6Var.s = true;
                Drawable mutate = ApplicationLoader.applicationContext.getDrawable(AndroidUtilities.isTablet() ? R.drawable.device_tablet_android : R.drawable.device_phone_android).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J7, false), PorterDuff.Mode.SRC_IN));
                org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(42.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.R7, false)), mutate);
                org.telegram.ui.Components.t9 t9Var = r6Var.f;
                if (t9Var != null) {
                    t9Var.setImageDrawable(jqVar);
                } else {
                    r6Var.h.setImageDrawable(jqVar);
                }
                r6Var.invalidate();
                return;
            }
            int i16 = sessionsActivity3.G;
            if (i10 >= i16 && i10 < sessionsActivity3.H) {
                r6Var.c((TLObject) sessionsActivity3.e.get(i10 - i16), i10 != this.d.H - 1);
                return;
            }
            int i17 = sessionsActivity3.I;
            if (i10 < i17 || i10 >= sessionsActivity3.J) {
                int i18 = sessionsActivity3.C;
                if (i10 < i18 || i10 >= sessionsActivity3.D) {
                    return;
                }
                r6Var.c((TLObject) sessionsActivity3.f.get(i10 - i18), i10 != this.d.D - 1);
                return;
            }
            int i19 = i10 - i17;
            ArrayList arrayList = sessionsActivity3.h;
            if (arrayList == null || i19 < 0 || i19 >= arrayList.size()) {
                return;
            }
            TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.d.h.get(i19);
            SessionsActivity sessionsActivity4 = this.d;
            if (i10 != sessionsActivity4.J - 1 && i10 != sessionsActivity4.H - 1) {
                r1 = true;
            }
            r6Var.c(tL_connectedBot, r1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022b  */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        int i11;
        Context context = this.c;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.m8(context);
        } else if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.y8(context);
        } else if (i10 != 2) {
            SessionsActivity sessionsActivity = this.d;
            if (i10 == 5) {
                frameLayout = new o71(sessionsActivity, context);
            } else if (i10 != 6) {
                int i12 = sessionsActivity.w;
                org.telegram.ui.Cells.r6 r6Var = new org.telegram.ui.Cells.r6(context);
                r6Var.v = new org.telegram.ui.Components.d6(r6Var);
                r6Var.y = UserConfig.selectedAccount;
                LinearLayout linearLayout = new LinearLayout(context);
                r6Var.x = linearLayout;
                linearLayout.setOrientation(0);
                linearLayout.setWeightSum(1.0f);
                r6Var.a = i12;
                int i13 = 21;
                if (i12 == 1) {
                    boolean z10 = LocaleController.isRTL;
                    r6Var.addView(linearLayout, i7.f6.d(-1, 30.0f, (z10 ? 5 : 3) | 48, z10 ? 15 : 49, 11.0f, z10 ? 49 : 15, 0.0f));
                    org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
                    r6Var.n = e9Var;
                    e9Var.u(AndroidUtilities.dp(10.0f));
                    org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
                    r6Var.h = t9Var;
                    t9Var.setRoundRadius(AndroidUtilities.dp(10.0f));
                    boolean z11 = LocaleController.isRTL;
                    r6Var.addView(t9Var, i7.f6.d(20, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 0 : 21, 13.0f, z11 ? 21 : 0, 0.0f));
                } else {
                    org.telegram.ui.Components.t9 t9Var2 = new org.telegram.ui.Components.t9(context);
                    r6Var.f = t9Var2;
                    t9Var2.setRoundRadius(AndroidUtilities.dp(10.0f));
                    boolean z12 = LocaleController.isRTL;
                    r6Var.addView(t9Var2, i7.f6.d(42, 42.0f, (z12 ? 5 : 3) | 48, z12 ? 0 : 16, 9.0f, z12 ? 16 : 0, 0.0f));
                    r6Var.n = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
                    org.telegram.ui.Components.t9 t9Var3 = new org.telegram.ui.Components.t9(context);
                    r6Var.h = t9Var3;
                    t9Var3.setRoundRadius(AndroidUtilities.dp(10.0f));
                    boolean z13 = LocaleController.isRTL;
                    r6Var.addView(t9Var3, i7.f6.d(42, 42.0f, (z13 ? 5 : 3) | 48, z13 ? 0 : 16, 9.0f, z13 ? 16 : 0, 0.0f));
                    boolean z14 = LocaleController.isRTL;
                    r6Var.addView(linearLayout, i7.f6.d(-1, 30.0f, (z14 ? 5 : 3) | 48, z14 ? 15 : 72, 6.333f, z14 ? 72 : 15, 0.0f));
                }
                TextView textView = new TextView(context);
                r6Var.b = textView;
                int i14 = org.telegram.ui.ActionBar.g6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
                textView.setTextSize(1, i12 == 0 ? 15.0f : 16.0f);
                textView.setLines(1);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                TextView textView2 = new TextView(context);
                r6Var.c = textView2;
                textView2.setTextSize(1, i12 == 0 ? 12.0f : 13.0f);
                textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                if (LocaleController.isRTL) {
                    linearLayout.addView(textView2, i7.f6.t(-2, -1, 51, 0, 2, 0, 0));
                    linearLayout.addView(textView, i7.f6.p(0, -1, 1.0f, 53, 10, 0, 0, 0));
                } else {
                    linearLayout.addView(textView, i7.f6.p(0, -1, 1.0f, 51, 0, 0, 10, 0));
                    linearLayout.addView(textView2, i7.f6.t(-2, -1, 53, 0, 2, 0, 0));
                }
                if (!LocaleController.isRTL) {
                    i13 = i12 == 0 ? 72 : 21;
                } else if (i12 == 0) {
                    i11 = 72;
                    TextView textView3 = new TextView(context);
                    r6Var.d = textView3;
                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
                    textView3.setTextSize(1, i12 != 0 ? 13.0f : 14.0f);
                    textView3.setLines(1);
                    textView3.setMaxLines(1);
                    textView3.setSingleLine(true);
                    textView3.setEllipsize(truncateAt);
                    textView3.setGravity((!LocaleController.isRTL ? 5 : 3) | 48);
                    float f9 = i13;
                    float f10 = i11;
                    r6Var.addView(textView3, i7.f6.d(-1, -2.0f, (!LocaleController.isRTL ? 5 : 3) | 48, f9, i12 != 0 ? 28.0f : 36.0f, f10, 0.0f));
                    TextView textView4 = new TextView(context);
                    r6Var.e = textView4;
                    textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A6, false));
                    textView4.setTextSize(1, i12 != 0 ? 14.0f : 13.0f);
                    textView4.setLines(1);
                    textView4.setMaxLines(1);
                    textView4.setSingleLine(true);
                    textView4.setEllipsize(truncateAt);
                    textView4.setGravity((!LocaleController.isRTL ? 5 : 3) | 48);
                    r6Var.addView(textView4, i7.f6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, f9, i12 != 0 ? 46.0f : 59.0f, f10, 0.0f));
                    frameLayout = r6Var;
                }
                i11 = 21;
                TextView textView32 = new TextView(context);
                r6Var.d = textView32;
                textView32.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
                textView32.setTextSize(1, i12 != 0 ? 13.0f : 14.0f);
                textView32.setLines(1);
                textView32.setMaxLines(1);
                textView32.setSingleLine(true);
                textView32.setEllipsize(truncateAt);
                textView32.setGravity((!LocaleController.isRTL ? 5 : 3) | 48);
                float f92 = i13;
                float f102 = i11;
                r6Var.addView(textView32, i7.f6.d(-1, -2.0f, (!LocaleController.isRTL ? 5 : 3) | 48, f92, i12 != 0 ? 28.0f : 36.0f, f102, 0.0f));
                TextView textView42 = new TextView(context);
                r6Var.e = textView42;
                textView42.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A6, false));
                textView42.setTextSize(1, i12 != 0 ? 14.0f : 13.0f);
                textView42.setLines(1);
                textView42.setMaxLines(1);
                textView42.setSingleLine(true);
                textView42.setEllipsize(truncateAt);
                textView42.setGravity((!LocaleController.isRTL ? 5 : 3) | 48);
                r6Var.addView(textView42, i7.f6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, f92, i12 != 0 ? 46.0f : 59.0f, f102, 0.0f));
                frameLayout = r6Var;
            } else {
                frameLayout = new org.telegram.ui.Cells.y9(context);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.k4(context);
        }
        return new org.telegram.ui.Components.vk0(frameLayout);
    }
}
