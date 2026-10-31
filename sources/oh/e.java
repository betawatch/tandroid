package oh;

import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.t8;
import org.telegram.ui.re;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e {
    public final k2 a;
    public final TLRPC.Chat b;
    public final int c;
    public FrameLayout d;
    public b e;
    public LinearLayout f;
    public TextView g;
    public ImageView h;
    public c i;
    public TLRPC.ChatFull j;
    public int k;
    public int l = -1;
    public d m;

    public e(TLRPC.Chat chat, k2 k2Var) {
        this.a = k2Var;
        this.b = chat;
        this.c = k2Var.getCurrentAccount();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == (this.d.getVisibility() == 0)) {
            return;
        }
        if (z10) {
            int i10 = this.l;
            k2 k2Var = this.a;
            TLRPC.Chat chat = this.b;
            if (i10 == -1 && chat != null) {
                vp messagesController = k2Var.getMessagesController();
                long j10 = chat.id;
                this.l = messagesController.f7.getInt("chatPendingRequests" + j10, 0);
            }
            int i11 = this.k;
            int i12 = this.l;
            if (i11 == i12) {
                return;
            }
            if (i12 != 0 && chat != null) {
                k2Var.getMessagesController().B4(0, chat.id);
            }
        }
        d dVar = this.m;
        if (dVar != null) {
            dVar.c(z10, z11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FrameLayout b() {
        if (this.d == null) {
            k2 k2Var = this.a;
            FrameLayout frameLayout = new FrameLayout(k2Var.getParentActivity());
            this.d = frameLayout;
            final int i10 = 0;
            frameLayout.setBackground(t6.N0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: oh.a
                public final /* synthetic */ e b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            e eVar = this.b;
                            k2 k2Var2 = eVar.a;
                            if (eVar.i == null) {
                                eVar.i = new c(eVar, k2Var2, eVar.b.id);
                            }
                            k2Var2.showDialog(eVar.i);
                            break;
                        default:
                            e eVar2 = this.b;
                            eVar2.a.getMessagesController().B4(eVar2.k, eVar2.b.id);
                            eVar2.l = eVar2.k;
                            eVar2.a(false, true);
                            break;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(k2Var.getParentActivity());
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f, b6.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            b bVar = new b(0 == true ? 1 : 0, k2Var.getParentActivity(), 0 == true ? 1 : 0);
            this.e = bVar;
            bVar.setAvatarsTextSize(i0.L(18.0f));
            t8 t8Var = this.e.a;
            for (int i11 = 0; i11 < t8Var.c.length; i11++) {
                t8Var.j(0, 0, null);
            }
            this.f.addView(this.e, b6.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(k2Var.getParentActivity());
            this.g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.g.setGravity(16);
            this.g.setSingleLine();
            this.g.setText((CharSequence) null);
            a7.V(this.g, t6.Te, k2Var.getResourceProvider());
            this.g.setTypeface(i0.o());
            this.f.addView(this.g, b6.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.h = new ImageView(k2Var.getParentActivity());
            int i12 = t6.x7;
            int themedColor = k2Var.getThemedColor(i12);
            final int i13 = 1;
            y h02 = t6.h0(436207615 & themedColor, 1, i0.L(14.0f));
            if ((themedColor >>> 24) == 255) {
                a7.R(this.h, h02, null, a7.h(i12, 25), k2Var.getResourceProvider());
            } else {
                this.h.setBackground(h02);
            }
            a7.t(this.h, t6.Re, k2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.h.setContentDescription(cd.L0(2131752041, null));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) { // from class: oh.a
                public final /* synthetic */ e b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            e eVar = this.b;
                            k2 k2Var2 = eVar.a;
                            if (eVar.i == null) {
                                eVar.i = new c(eVar, k2Var2, eVar.b.id);
                            }
                            k2Var2.showDialog(eVar.i);
                            break;
                        default:
                            e eVar2 = this.b;
                            eVar2.a.getMessagesController().B4(eVar2.k, eVar2.b.id);
                            eVar2.l = eVar2.k;
                            eVar2.a(false, true);
                            break;
                    }
                }
            });
            this.d.addView(this.h, b6.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.j;
            if (chatFull != null) {
                d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void c(re reVar) {
        this.m = reVar;
    }

    public final void d(int i10, List list, boolean z10) {
        if (this.d == null) {
            return;
        }
        k2 k2Var = this.a;
        if (i10 <= 0) {
            TLRPC.Chat chat = this.b;
            if (chat != null) {
                k2Var.getMessagesController().B4(0, chat.id);
                this.l = 0;
            }
            a(false, z10);
            this.k = 0;
            return;
        }
        if (this.k != i10) {
            this.k = i10;
            this.g.setText(cd.G(i10, "JoinUsersRequests", new Object[0]));
            a(true, z10);
            if (list == null || list.isEmpty()) {
                return;
            }
            int min = Math.min(3, list.size());
            for (int i11 = 0; i11 < min; i11++) {
                TLRPC.User Z1 = k2Var.getMessagesController().Z1((Long) list.get(i11));
                if (Z1 != null) {
                    this.e.b(i11, this.c, Z1);
                }
            }
            this.e.setCount(min);
            this.e.a(true);
        }
    }
}
