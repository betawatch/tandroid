// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class iea extends c79 {
    public final Context c;
    public boolean d;
    public boolean e;
    public ArrayList f;
    public final /* synthetic */ kea h;

    public iea(kea keaVar, Context context) {
        this.h = keaVar;
        this.c = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.f != 1;
    }

    public final TLRPC.TL_forumTopic E(int i) {
        int i2 = i - 1;
        if (this.d) {
            i2 = i - 2;
        }
        ArrayList arrayList = this.f;
        if (arrayList == null || i2 < 0 || i2 >= arrayList.size()) {
            return null;
        }
        return (TLRPC.TL_forumTopic) this.f.get(i2);
    }

    @Override // j79
    public final int b() {
        ArrayList arrayList = this.f;
        return (arrayList != null ? arrayList.size() + 1 : 0) + (this.d ? 1 : 0);
    }

    @Override // j79
    public final int d(int i) {
        return i == 0 ? 1 : 0;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        long j;
        if (f89Var.f == 0) {
            tea teaVar = (tea) f89Var.a;
            if (i == 1 && this.d) {
                teaVar.setAsNewBotForumTopic(this.e);
                return;
            }
            if (this.f != null) {
                TLRPC.TL_forumTopic E = E(i);
                kea keaVar = this.h;
                TLRPC.Dialog dialog = keaVar.x2;
                boolean z = E != null && keaVar.P1.h((long) E.id) >= 0;
                lea leaVar = teaVar.b;
                int i2 = teaVar.f;
                de0 de0Var = teaVar.a;
                TextView textView = teaVar.c;
                if (dialog != null) {
                    TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-dialog.id));
                    if (dialog.id > 0) {
                        textView.setText(E.title);
                        j = 0;
                    } else if (M0 == null) {
                        j = 0;
                        textView.setText("");
                    } else if (M0.monoforum) {
                        j = 0;
                        textView.setText(uc7.s1(i2).A1(wf3.n(E.from_id), false));
                    } else {
                        j = 0;
                        textView.setText(E.title);
                    }
                    if (xc2.p0(M0)) {
                        de0Var.setAnimatedEmojiDrawable(null);
                        de0Var.setImageDrawable(null);
                        long n = wf3.n(E.from_id);
                        if (wf3.D(n)) {
                            TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(n));
                            yob.X(textView, aob.j5, teaVar.h);
                            leaVar.q(X1);
                            if (X1 != null) {
                                textView.setText(lv2.m(0, X1.first_name, X1.last_name));
                            } else {
                                textView.setText("");
                            }
                            de0Var.f(X1, leaVar);
                            de0Var.setRoundRadius(hl.L(28.0f));
                        } else {
                            TLRPC.Chat M02 = uc7.s1(i2).M0(Long.valueOf(n));
                            if (M02 != null) {
                                textView.setText(M02.title);
                            } else {
                                textView.setText("");
                            }
                            leaVar.p(M02);
                            de0Var.f(M0, leaVar);
                        }
                    } else if (E.icon_emoji_id != j) {
                        de0Var.setImageDrawable(null);
                        de0Var.setAnimatedEmojiDrawable(new wl(13, yac.t0, E.icon_emoji_id));
                    } else {
                        de0Var.setAnimatedEmojiDrawable(null);
                        oo4 oo4Var = new oo4(E.icon_color);
                        s26 s26Var = new s26(1, null);
                        String upperCase = E.title.trim().toUpperCase();
                        s26Var.a(upperCase.length() >= 1 ? upperCase.substring(0, 1) : "");
                        s26Var.i = 1.8f;
                        zm2 zm2Var = new zm2(oo4Var, s26Var, 0, 0);
                        zm2Var.x = true;
                        de0Var.setImageDrawable(zm2Var);
                    }
                    de0Var.setRoundRadius((M0 == null || !M0.forum || z) ? hl.L(28.0f) : hl.L(16.0f));
                    teaVar.d = dialog.id;
                    teaVar.e = E.id;
                }
            }
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        Context context = this.c;
        if (i == 0 || i == 2) {
            tea teaVar = new tea(context, this.h.J0);
            teaVar.setLayoutParams(new r79(-1, hl.L(100.0f)));
            view = teaVar;
        } else {
            view = new View(context);
            view.setLayoutParams(new r79(-1, a.getCurrentActionBarHeight()));
        }
        return new n69(view);
    }
}
