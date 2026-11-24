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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class g7a extends n39 {
    public final Context c;
    public final /* synthetic */ SessionsActivity d;

    public g7a(SessionsActivity sessionsActivity, Context context) {
        this.d = sessionsActivity;
        this.c = context;
        C(true);
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i;
        int i2;
        int b = s49Var.b();
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

    @Override // w39
    public final int b() {
        return this.d.S;
    }

    @Override // w39
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

    @Override // w39
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

    @Override // w39
    public final void t(s49 s49Var, int i) {
        int i2;
        int i3 = s49Var.f;
        if (i3 == 0) {
            wgb wgbVar = (wgb) s49Var.a;
            i2 = this.d.terminateAllSessionsRow;
            if (i != i2) {
                if (i == this.d.Q) {
                    int i4 = bkb.p6;
                    wgbVar.g(i4, i4);
                    wgbVar.setTag(Integer.valueOf(i4));
                    wgbVar.o(R.drawable.msg_qrcode, k96.M0(2131753891, null), !this.d.d.isEmpty());
                    return;
                }
                return;
            }
            int i5 = bkb.o7;
            wgbVar.g(i5, i5);
            wgbVar.setTag(Integer.valueOf(i5));
            if (this.d.w) {
                wgbVar.o(R.drawable.msg_block2, k96.M0(2131743966, null), false);
                return;
            } else {
                wgbVar.o(R.drawable.msg_block2, k96.M0(2131743967, null), false);
                return;
            }
        }
        if (i3 == 1) {
            mhb mhbVar = (mhb) s49Var.a;
            mhbVar.setFixedSize(0);
            SessionsActivity sessionsActivity = this.d;
            if (i == sessionsActivity.E) {
                if (sessionsActivity.w) {
                    mhbVar.setText(k96.M0(2131752061, null));
                    return;
                } else {
                    mhbVar.setText(k96.M0(2131752062, null));
                    return;
                }
            }
            if (i == sessionsActivity.O) {
                if (sessionsActivity.w) {
                    mhbVar.setText(k96.M0(2131743962, null));
                    return;
                } else if (sessionsActivity.d.isEmpty()) {
                    mhbVar.setText("");
                    return;
                } else {
                    mhbVar.setText(k96.M0(2131745362, null));
                    return;
                }
            }
            if (i == sessionsActivity.I) {
                mhbVar.setText(k96.M0(2131748546, null));
                return;
            } else {
                if (i == sessionsActivity.R || i == sessionsActivity.U || i == sessionsActivity.P) {
                    mhbVar.setText("");
                    mhbVar.setFixedSize(12);
                    return;
                }
                return;
            }
        }
        if (i3 == 2) {
            ld5 ld5Var = (ld5) s49Var.a;
            SessionsActivity sessionsActivity2 = this.d;
            if (i == sessionsActivity2.x) {
                ld5Var.setText(k96.M0(2131751681, null));
                return;
            }
            if (i == sessionsActivity2.J) {
                if (sessionsActivity2.w) {
                    ld5Var.setText(k96.M0(2131747570, null));
                    return;
                } else {
                    ld5Var.setText(k96.M0(2131747573, null));
                    return;
                }
            }
            if (i == sessionsActivity2.F) {
                ld5Var.setText(k96.M0(2131748547, null));
                return;
            } else {
                if (i == sessionsActivity2.T) {
                    ld5Var.setText(k96.M0(2131743965, null));
                    return;
                }
                return;
            }
        }
        if (i3 != 5) {
            View view = s49Var.a;
            if (i3 == 6) {
                uib uibVar = (uib) view;
                int i6 = this.d.s;
                uibVar.c(k96.M0(2131749080, null), (i6 <= 30 || i6 > 183) ? i6 == 365 ? k96.G(i6 / 365, "Years", new Object[0]) : k96.G(i6 / 7, "Weeks", new Object[0]) : k96.G(i6 / 30, "Months", new Object[0]), true, false);
                return;
            }
            o5a o5aVar = (o5a) view;
            SessionsActivity sessionsActivity3 = this.d;
            if (i != sessionsActivity3.y) {
                int i7 = sessionsActivity3.K;
                if (i >= i7 && i < sessionsActivity3.L) {
                    o5aVar.c((TLObject) sessionsActivity3.d.get(i - i7), i != this.d.L - 1);
                    return;
                }
                int i8 = sessionsActivity3.M;
                if (i < i8 || i >= sessionsActivity3.N) {
                    int i9 = sessionsActivity3.G;
                    if (i < i9 || i >= sessionsActivity3.H) {
                        return;
                    }
                    o5aVar.c((TLObject) sessionsActivity3.e.get(i - i9), i != this.d.H - 1);
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
                o5aVar.c(tL_connectedBot, r1);
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
                    boolean z = w01.a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(tL_authorization.app_version);
                    sb2.append(" beta");
                    tL_authorization.app_version = sb2.toString();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                tL_authorization.country = "";
                tL_authorization.region = "";
                tL_authorization.ip = "";
            }
            o5aVar.c(tL_authorization, (this.d.d.isEmpty() && this.d.e.isEmpty() && this.d.Q == -1) ? false : true);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i == 0) {
            frameLayout = new wgb(context);
        } else if (i == 1) {
            frameLayout = new mhb(context);
        } else if (i != 2) {
            SessionsActivity sessionsActivity = this.d;
            if (i == 5) {
                frameLayout = new h7a(sessionsActivity, context);
            } else if (i != 6) {
                boolean z = sessionsActivity.w;
                o5a o5aVar = new o5a(context);
                o5aVar.s = new lm(o5aVar);
                o5aVar.x = y6c.t0;
                LinearLayout linearLayout = new LinearLayout(context);
                o5aVar.w = linearLayout;
                linearLayout.setOrientation(0);
                linearLayout.setWeightSum(1.0f);
                o5aVar.a = z;
                int i2 = 21;
                if (z) {
                    boolean z2 = k96.a0;
                    o5aVar.addView(linearLayout, nme.d(-1, 30.0f, (z2 ? 5 : 3) | 48, z2 ? 15 : 49, 11.0f, z2 ? 49 : 15, 0.0f));
                    pb0 pb0Var = new pb0((wjb) null);
                    o5aVar.n = pb0Var;
                    pb0Var.s(gl.L(10.0f));
                    be0 be0Var = new be0(context);
                    o5aVar.h = be0Var;
                    be0Var.setRoundRadius(gl.L(10.0f));
                    boolean z3 = k96.a0;
                    o5aVar.addView(be0Var, nme.d(20, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 0 : 21, 13.0f, z3 ? 21 : 0, 0.0f));
                } else {
                    be0 be0Var2 = new be0(context);
                    o5aVar.f = be0Var2;
                    be0Var2.setRoundRadius(gl.L(10.0f));
                    boolean z4 = k96.a0;
                    o5aVar.addView(be0Var2, nme.d(42, 42.0f, (z4 ? 5 : 3) | 48, z4 ? 0 : 16, 9.0f, z4 ? 16 : 0, 0.0f));
                    o5aVar.n = new pb0((wjb) null);
                    be0 be0Var3 = new be0(context);
                    o5aVar.h = be0Var3;
                    be0Var3.setRoundRadius(gl.L(10.0f));
                    boolean z5 = k96.a0;
                    o5aVar.addView(be0Var3, nme.d(42, 42.0f, (z5 ? 5 : 3) | 48, z5 ? 0 : 16, 9.0f, z5 ? 16 : 0, 0.0f));
                    boolean z6 = k96.a0;
                    o5aVar.addView(linearLayout, nme.d(-1, 30.0f, (z6 ? 5 : 3) | 48, z6 ? 15 : 72, 6.333f, z6 ? 72 : 15, 0.0f));
                }
                TextView textView = new TextView(context);
                o5aVar.b = textView;
                int i3 = bkb.F6;
                zkb.X(textView, i3, null);
                textView.setTextSize(1, !z ? 15.0f : 16.0f);
                textView.setLines(1);
                textView.setTypeface(gl.o());
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setGravity((k96.a0 ? 5 : 3) | 48);
                TextView textView2 = new TextView(context);
                o5aVar.c = textView2;
                textView2.setTextSize(1, !z ? 12.0f : 13.0f);
                textView2.setGravity((k96.a0 ? 3 : 5) | 48);
                if (k96.a0) {
                    linearLayout.addView(textView2, nme.t(-2, -1, 51, 0, 2, 0, 0));
                    linearLayout.addView(textView, nme.q(0, -1, 1.0f, 53, 10, 0, 0, 0));
                } else {
                    linearLayout.addView(textView, nme.q(0, -1, 1.0f, 51, 0, 0, 10, 0));
                    linearLayout.addView(textView2, nme.t(-2, -1, 53, 0, 2, 0, 0));
                }
                if (!k96.a0) {
                    i2 = z ? 21 : 72;
                    r7 = 21;
                } else if (z) {
                    r7 = 21;
                }
                TextView textView3 = new TextView(context);
                o5aVar.d = textView3;
                zkb.X(textView3, i3, null);
                ug8.w(textView3, 1, !z ? 13.0f : 14.0f, 1, 1);
                textView3.setSingleLine(true);
                textView3.setEllipsize(truncateAt);
                textView3.setGravity((k96.a0 ? 5 : 3) | 48);
                float f = i2;
                float f2 = r7;
                o5aVar.addView(textView3, nme.d(-1, -2.0f, (k96.a0 ? 5 : 3) | 48, f, !z ? 28.0f : 36.0f, f2, 0.0f));
                TextView textView4 = new TextView(context);
                o5aVar.e = textView4;
                zkb.X(textView4, bkb.z6, null);
                ug8.w(textView4, 1, z ? 14.0f : 13.0f, 1, 1);
                textView4.setSingleLine(true);
                textView4.setEllipsize(truncateAt);
                textView4.setGravity((k96.a0 ? 5 : 3) | 48);
                o5aVar.addView(textView4, nme.d(-1, -2.0f, (k96.a0 ? 5 : 3) | 48, f, !z ? 46.0f : 59.0f, f2, 0.0f));
                frameLayout = o5aVar;
            } else {
                frameLayout = new uib(context);
            }
        } else {
            frameLayout = new ld5(context);
        }
        return new y29(frameLayout);
    }
}
