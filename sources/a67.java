// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class a67 extends FrameLayout implements snb {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final jc0 d;
    public final ema e;
    public final int f;
    public final boolean h;
    public final tk4 n;
    public boolean r;
    public qob s;
    public int w;

    public a67(Context context, int i, r47 r47Var, TLRPC.Chat chat) {
        super(context);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.f = i;
        boolean z = r47Var.g4() || r47.Q4(r47Var.k);
        this.h = z;
        tk4 tk4Var = new tk4(context, null);
        this.n = tk4Var;
        tk4Var.e(aob.G8, aob.i6, -1);
        tk4Var.setViewType(13);
        tk4Var.setIsSingleCell(false);
        addView(tk4Var, tre.c(-1.0f, -2));
        ema emaVar = new ema(context);
        this.e = emaVar;
        emaVar.setTextSize(16);
        emaVar.setEllipsizeByGradient(true);
        emaVar.setRightPadding(hl.L(62.0f));
        addView(emaVar, tre.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        jc0 jc0Var = new jc0(context, false);
        this.d = jc0Var;
        jc0Var.setStyle(11);
        jc0Var.setAvatarsTextSize(hl.L(22.0f));
        addView(jc0Var, tre.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        yob.W(emaVar, aob.E8, null);
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = r47Var.e1();
        tL_messages_getMessageReadParticipants.peer = uc7.s1(i).j1(r47.B0(r47Var.k));
        ImageView imageView = new ImageView(context);
        addView(imageView, tre.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(z ? R.drawable.msg_played : R.drawable.msg_seen).mutate();
        yob.x(this, mutate, aob.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        jc0Var.setAlpha(0.0f);
        emaVar.setAlpha(0.0f);
        TLRPC.Peer peer = r47Var.k.from_id;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getMessageReadParticipants, new gg(this, peer != null ? peer.user_id : 0L, i, chat));
        int w0 = aob.w0(null, aob.I5, false);
        this.w = w0;
        setBackground(aob.Y(w0, 6, 0));
        setEnabled(false);
    }

    public final d79 a() {
        qob qobVar = this.s;
        if (qobVar != null) {
            return qobVar;
        }
        qob qobVar2 = new qob(getContext(), null, (byte) 9);
        this.s = qobVar2;
        getContext();
        qobVar2.setLayoutManager(new x46());
        this.s.i(new lr(this, (byte) 6));
        this.s.setAdapter(new ox0(this, (byte) 4));
        return this.s;
    }

    public final void b() {
        jc0 jc0Var;
        ArrayList arrayList = this.c;
        setEnabled(arrayList.size() > 0);
        int i = 0;
        while (true) {
            jc0Var = this.d;
            if (i >= 3) {
                break;
            }
            int size = arrayList.size();
            int i2 = this.f;
            if (i < size) {
                jc0Var.b(i, i2, (TLObject) arrayList.get(i));
            } else {
                jc0Var.b(i, i2, null);
            }
            i++;
        }
        if (arrayList.size() == 1) {
            jc0Var.setTranslationX(hl.L(24.0f));
        } else if (arrayList.size() == 2) {
            jc0Var.setTranslationX(hl.L(12.0f));
        } else {
            jc0Var.setTranslationX(0.0f);
        }
        int L = hl.L((Math.min(2, arrayList.size() - 1) * 12) + 38);
        ema emaVar = this.e;
        emaVar.setRightPadding(L);
        jc0Var.a(false);
        ArrayList arrayList2 = this.a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            emaVar.l(lv2.o((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            emaVar.l(ob6.M0(2131747855, null), false);
        } else {
            emaVar.l(ob6.G(arrayList2.size(), this.h ? "MessagePlayed" : "MessageSeen", new Object[0]), false);
        }
        emaVar.animate().alpha(1.0f).setDuration(220L).start();
        jc0Var.animate().alpha(1.0f).setDuration(220L).start();
        tk4 tk4Var = this.n;
        tk4Var.animate().alpha(0.0f).setDuration(220L).setListener(new gf4(tk4Var)).start();
        qob qobVar = this.s;
        if (qobVar != null) {
            qobVar.getAdapter();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
        }
        this.r = true;
        tk4 tk4Var = this.n;
        boolean z = tk4Var.getVisibility() == 0;
        ema emaVar = this.e;
        emaVar.setVisibility(8);
        if (z) {
            tk4Var.setVisibility(8);
        }
        super.onMeasure(i, i2);
        if (z) {
            tk4Var.getLayoutParams().width = getMeasuredWidth();
            tk4Var.setVisibility(0);
        }
        emaVar.setVisibility(0);
        emaVar.getLayoutParams().width = getMeasuredWidth() - hl.L(40.0f);
        this.r = false;
        super.onMeasure(i, i2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.r) {
            return;
        }
        super.requestLayout();
    }

    @Override // snb
    public final void updateColors() {
        try {
            int w0 = aob.w0(null, aob.I5, false);
            if (getBackground() != null && w0 != this.w) {
                this.w = w0;
                aob.F1(getBackground(), w0, true);
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
