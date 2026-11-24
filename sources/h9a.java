// default package

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class h9a extends q59 {
    public final Context c;
    public final /* synthetic */ SessionsActivity d;

    public h9a(SessionsActivity sessionsActivity, Context context) {
        this.d = sessionsActivity;
        this.c = context;
        C(true);
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i;
        int i2;
        int b = u69Var.b();
        SessionsActivity sessionsActivity = this.d;
        i = sessionsActivity.terminateAllSessionsRow;
        if (b == i) {
            return true;
        }
        if (b >= sessionsActivity.K && b < sessionsActivity.L) {
            return true;
        }
        if (b >= sessionsActivity.M && b < sessionsActivity.N) {
            return true;
        }
        if ((b >= sessionsActivity.G && b < sessionsActivity.H) || b == sessionsActivity.y) {
            return true;
        }
        i2 = sessionsActivity.ttlRow;
        return b == i2;
    }

    @Override // y59
    public final int b() {
        return this.d.S;
    }

    @Override // y59
    public final long c(int i) {
        int i2;
        int i3;
        int hash;
        SessionsActivity sessionsActivity = this.d;
        i2 = sessionsActivity.terminateAllSessionsRow;
        if (i == i2) {
            hash = Objects.hash(0, 0);
        } else if (i == sessionsActivity.E) {
            hash = Objects.hash(0, 1);
        } else if (i == sessionsActivity.O) {
            hash = Objects.hash(0, 2);
        } else if (i == sessionsActivity.I) {
            hash = Objects.hash(0, 3);
        } else if (i == sessionsActivity.R) {
            hash = Objects.hash(0, 4);
        } else if (i == sessionsActivity.U) {
            hash = Objects.hash(0, 5);
        } else if (i == sessionsActivity.P) {
            hash = Objects.hash(0, 6);
        } else if (i == sessionsActivity.x) {
            hash = Objects.hash(0, 7);
        } else if (i == sessionsActivity.J) {
            hash = Objects.hash(0, 8);
        } else if (i == sessionsActivity.F) {
            hash = Objects.hash(0, 9);
        } else if (i == sessionsActivity.T) {
            hash = Objects.hash(0, 10);
        } else if (i == sessionsActivity.y) {
            hash = Objects.hash(0, 11);
        } else {
            int i4 = sessionsActivity.K;
            if (i < i4 || i >= sessionsActivity.L) {
                int i5 = sessionsActivity.M;
                if (i < i5 || i >= sessionsActivity.N) {
                    int i6 = sessionsActivity.G;
                    if (i >= i6 && i < sessionsActivity.H) {
                        TLObject tLObject = (TLObject) sessionsActivity.e.get(i - i6);
                        if (tLObject instanceof TLRPC.TL_authorization) {
                            hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_authorization) tLObject).hash));
                        } else {
                            if (tLObject instanceof TLRPC.TL_webAuthorization) {
                                hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject).hash));
                            }
                            hash = Objects.hash(0, -1);
                        }
                    } else if (i == sessionsActivity.Q) {
                        hash = Objects.hash(0, 12);
                    } else {
                        i3 = sessionsActivity.ttlRow;
                        if (i == i3) {
                            hash = Objects.hash(0, 13);
                        }
                        hash = Objects.hash(0, -1);
                    }
                } else {
                    hash = Objects.hash(3, Long.valueOf(((TL_account.TL_connectedBot) sessionsActivity.f.get(i - i5)).bot_id));
                }
            } else {
                TLObject tLObject2 = (TLObject) sessionsActivity.d.get(i - i4);
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

    @Override // y59
    public final int d(int i) {
        int i2;
        int i3;
        SessionsActivity sessionsActivity = this.d;
        i2 = sessionsActivity.terminateAllSessionsRow;
        if (i == i2) {
            return 0;
        }
        if (i == sessionsActivity.E || i == sessionsActivity.O || i == sessionsActivity.I || i == sessionsActivity.R || i == sessionsActivity.U || i == sessionsActivity.P) {
            return 1;
        }
        if (i == sessionsActivity.x || i == sessionsActivity.J || i == sessionsActivity.F || i == sessionsActivity.T) {
            return 2;
        }
        if (i == sessionsActivity.y) {
            return 4;
        }
        if (i >= sessionsActivity.K && i < sessionsActivity.L) {
            return 4;
        }
        if (i >= sessionsActivity.M && i < sessionsActivity.N) {
            return 4;
        }
        if (i >= sessionsActivity.G && i < sessionsActivity.H) {
            return 4;
        }
        if (i == sessionsActivity.Q) {
            return 5;
        }
        i3 = sessionsActivity.ttlRow;
        return i == i3 ? 6 : 0;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        int i2;
        int i3 = u69Var.f;
        if (i3 == 0) {
            xib xibVar = (xib) u69Var.a;
            i2 = this.d.terminateAllSessionsRow;
            if (i != i2) {
                if (i == this.d.Q) {
                    int i4 = cmb.p6;
                    xibVar.g(i4, i4);
                    xibVar.setTag(Integer.valueOf(i4));
                    xibVar.o(R.drawable.msg_qrcode, jb6.M0(2131753859, null), !this.d.d.isEmpty());
                    return;
                }
                return;
            }
            int i5 = cmb.o7;
            xibVar.g(i5, i5);
            xibVar.setTag(Integer.valueOf(i5));
            if (this.d.w) {
                xibVar.o(R.drawable.msg_block2, jb6.M0(2131743892, null), false);
                return;
            } else {
                xibVar.o(R.drawable.msg_block2, jb6.M0(2131743893, null), false);
                return;
            }
        }
        if (i3 == 1) {
            njb njbVar = (njb) u69Var.a;
            njbVar.setFixedSize(0);
            SessionsActivity sessionsActivity = this.d;
            if (i == sessionsActivity.E) {
                if (sessionsActivity.w) {
                    njbVar.setText(jb6.M0(2131752010, null));
                    return;
                } else {
                    njbVar.setText(jb6.M0(2131752011, null));
                    return;
                }
            }
            if (i == sessionsActivity.O) {
                if (sessionsActivity.w) {
                    njbVar.setText(jb6.M0(2131743888, null));
                    return;
                } else if (sessionsActivity.d.isEmpty()) {
                    njbVar.setText("");
                    return;
                } else {
                    njbVar.setText(jb6.M0(2131745288, null));
                    return;
                }
            }
            if (i == sessionsActivity.I) {
                njbVar.setText(jb6.M0(2131748495, null));
                return;
            } else {
                if (i == sessionsActivity.R || i == sessionsActivity.U || i == sessionsActivity.P) {
                    njbVar.setText("");
                    njbVar.setFixedSize(12);
                    return;
                }
                return;
            }
        }
        if (i3 == 2) {
            jf5 jf5Var = (jf5) u69Var.a;
            SessionsActivity sessionsActivity2 = this.d;
            if (i == sessionsActivity2.x) {
                jf5Var.setText(jb6.M0(2131751630, null));
                return;
            }
            if (i == sessionsActivity2.J) {
                if (sessionsActivity2.w) {
                    jf5Var.setText(jb6.M0(2131747496, null));
                    return;
                } else {
                    jf5Var.setText(jb6.M0(2131747499, null));
                    return;
                }
            }
            if (i == sessionsActivity2.F) {
                jf5Var.setText(jb6.M0(2131748496, null));
                return;
            } else {
                if (i == sessionsActivity2.T) {
                    jf5Var.setText(jb6.M0(2131743891, null));
                    return;
                }
                return;
            }
        }
        if (i3 != 5) {
            View view = u69Var.a;
            if (i3 == 6) {
                vkb vkbVar = (vkb) view;
                int i6 = this.d.s;
                vkbVar.c(jb6.M0(2131749029, null), (i6 <= 30 || i6 > 183) ? i6 == 365 ? jb6.G(i6 / 365, "Years", new Object[0]) : jb6.G(i6 / 7, "Weeks", new Object[0]) : jb6.G(i6 / 30, "Months", new Object[0]), true, false);
                return;
            }
            q7a q7aVar = (q7a) view;
            SessionsActivity sessionsActivity3 = this.d;
            if (i != sessionsActivity3.y) {
                int i7 = sessionsActivity3.K;
                if (i >= i7 && i < sessionsActivity3.L) {
                    q7aVar.c((TLObject) sessionsActivity3.d.get(i - i7), i != this.d.L - 1);
                    return;
                }
                int i8 = sessionsActivity3.M;
                if (i < i8 || i >= sessionsActivity3.N) {
                    int i9 = sessionsActivity3.G;
                    if (i < i9 || i >= sessionsActivity3.H) {
                        return;
                    }
                    q7aVar.c((TLObject) sessionsActivity3.e.get(i - i9), i != this.d.H - 1);
                    return;
                }
                int i10 = i - i8;
                ArrayList arrayList = sessionsActivity3.f;
                if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
                    return;
                }
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.d.f.get(i10);
                SessionsActivity sessionsActivity4 = this.d;
                if (i != sessionsActivity4.N - 1 && i != sessionsActivity4.L - 1) {
                    r1 = true;
                }
                q7aVar.c(tL_connectedBot, r1);
                return;
            }
            TLRPC.TL_authorization tL_authorization = sessionsActivity3.h;
            if (tL_authorization == null) {
                tL_authorization = new TLRPC.TL_authorization();
                tL_authorization.flags = 1;
                tL_authorization.current = true;
                tL_authorization.platform = "Android";
                tL_authorization.device_model = Build.MANUFACTURER + " " + Build.MODEL;
                StringBuilder sb = new StringBuilder("SDK ");
                sb.append(Build.VERSION.SDK_INT);
                tL_authorization.system_version = sb.toString();
                tL_authorization.app_name = "Telegram Android";
                tL_authorization.app_version = "";
                try {
                    PackageInfo packageInfo = a.b.getPackageManager().getPackageInfo(a.b.getPackageName(), 0);
                    tL_authorization.app_version = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                    boolean z = e21.a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(tL_authorization.app_version);
                    sb2.append(" beta");
                    tL_authorization.app_version = sb2.toString();
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                tL_authorization.country = "";
                tL_authorization.region = "";
                tL_authorization.ip = "";
            }
            q7aVar.c(tL_authorization, (this.d.d.isEmpty() && this.d.e.isEmpty() && this.d.Q == -1) ? false : true);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i == 0) {
            frameLayout = new xib(context);
        } else if (i == 1) {
            frameLayout = new njb(context);
        } else if (i != 2) {
            SessionsActivity sessionsActivity = this.d;
            if (i == 5) {
                frameLayout = new i9a(sessionsActivity, context);
            } else if (i != 6) {
                boolean z = sessionsActivity.w;
                q7a q7aVar = new q7a(context);
                q7aVar.s = new ln(q7aVar);
                q7aVar.x = z8c.t0;
                LinearLayout linearLayout = new LinearLayout(context);
                q7aVar.w = linearLayout;
                linearLayout.setOrientation(0);
                linearLayout.setWeightSum(1.0f);
                q7aVar.a = z;
                int i2 = 21;
                if (z) {
                    boolean z2 = jb6.a0;
                    q7aVar.addView(linearLayout, qoe.d(-1, 30.0f, (z2 ? 5 : 3) | 48, z2 ? 15 : 49, 11.0f, z2 ? 49 : 15, 0.0f));
                    pc0 pc0Var = new pc0((ylb) null);
                    q7aVar.n = pc0Var;
                    pc0Var.s(gm.L(10.0f));
                    bf0 bf0Var = new bf0(context);
                    q7aVar.h = bf0Var;
                    bf0Var.setRoundRadius(gm.L(10.0f));
                    boolean z3 = jb6.a0;
                    q7aVar.addView(bf0Var, qoe.d(20, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 0 : 21, 13.0f, z3 ? 21 : 0, 0.0f));
                } else {
                    bf0 bf0Var2 = new bf0(context);
                    q7aVar.f = bf0Var2;
                    bf0Var2.setRoundRadius(gm.L(10.0f));
                    boolean z4 = jb6.a0;
                    q7aVar.addView(bf0Var2, qoe.d(42, 42.0f, (z4 ? 5 : 3) | 48, z4 ? 0 : 16, 9.0f, z4 ? 16 : 0, 0.0f));
                    q7aVar.n = new pc0((ylb) null);
                    bf0 bf0Var3 = new bf0(context);
                    q7aVar.h = bf0Var3;
                    bf0Var3.setRoundRadius(gm.L(10.0f));
                    boolean z5 = jb6.a0;
                    q7aVar.addView(bf0Var3, qoe.d(42, 42.0f, (z5 ? 5 : 3) | 48, z5 ? 0 : 16, 9.0f, z5 ? 16 : 0, 0.0f));
                    boolean z6 = jb6.a0;
                    q7aVar.addView(linearLayout, qoe.d(-1, 30.0f, (z6 ? 5 : 3) | 48, z6 ? 15 : 72, 6.333f, z6 ? 72 : 15, 0.0f));
                }
                TextView textView = new TextView(context);
                q7aVar.b = textView;
                int i3 = cmb.F6;
                anb.X(textView, i3, null);
                textView.setTextSize(1, !z ? 15.0f : 16.0f);
                textView.setLines(1);
                textView.setTypeface(gm.o());
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setGravity((jb6.a0 ? 5 : 3) | 48);
                TextView textView2 = new TextView(context);
                q7aVar.c = textView2;
                textView2.setTextSize(1, !z ? 12.0f : 13.0f);
                textView2.setGravity((jb6.a0 ? 3 : 5) | 48);
                if (jb6.a0) {
                    linearLayout.addView(textView2, qoe.t(-2, -1, 51, 0, 2, 0, 0));
                    linearLayout.addView(textView, qoe.q(0, -1, 1.0f, 53, 10, 0, 0, 0));
                } else {
                    linearLayout.addView(textView, qoe.q(0, -1, 1.0f, 51, 0, 0, 10, 0));
                    linearLayout.addView(textView2, qoe.t(-2, -1, 53, 0, 2, 0, 0));
                }
                if (!jb6.a0) {
                    i2 = z ? 21 : 72;
                    r7 = 21;
                } else if (z) {
                    r7 = 21;
                }
                TextView textView3 = new TextView(context);
                q7aVar.d = textView3;
                anb.X(textView3, i3, null);
                wi8.w(textView3, 1, !z ? 13.0f : 14.0f, 1, 1);
                textView3.setSingleLine(true);
                textView3.setEllipsize(truncateAt);
                textView3.setGravity((jb6.a0 ? 5 : 3) | 48);
                float f = i2;
                float f2 = r7;
                q7aVar.addView(textView3, qoe.d(-1, -2.0f, (jb6.a0 ? 5 : 3) | 48, f, !z ? 28.0f : 36.0f, f2, 0.0f));
                TextView textView4 = new TextView(context);
                q7aVar.e = textView4;
                anb.X(textView4, cmb.z6, null);
                wi8.w(textView4, 1, z ? 14.0f : 13.0f, 1, 1);
                textView4.setSingleLine(true);
                textView4.setEllipsize(truncateAt);
                textView4.setGravity((jb6.a0 ? 5 : 3) | 48);
                q7aVar.addView(textView4, qoe.d(-1, -2.0f, (jb6.a0 ? 5 : 3) | 48, f, !z ? 46.0f : 59.0f, f2, 0.0f));
                frameLayout = q7aVar;
            } else {
                frameLayout = new vkb(context);
            }
        } else {
            frameLayout = new jf5(context);
        }
        return new b59(frameLayout);
    }
}
