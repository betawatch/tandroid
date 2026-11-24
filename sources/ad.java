// default package

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_agent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ad extends dc {
    public final wc E;
    public String F;
    public final ArrayList G;
    public String H;
    public String I;
    public boolean J;
    public boolean K;
    public int L;
    public String M;
    public final ArrayList N;
    public String O;
    public boolean P;
    public final ArrayList Q;
    public final b1 R;
    public final ArrayList S;
    public final mc y;

    public ad(int i, View view, sm2 sm2Var, ylb ylbVar) {
        super(i, view, sm2Var, ylbVar);
        this.G = new ArrayList();
        this.H = "";
        this.L = -1;
        this.N = new ArrayList();
        this.Q = new ArrayList();
        this.R = new b1(this, (byte) 8);
        this.S = new ArrayList();
        this.y = mc.c(i);
        wc wcVar = new wc(this, view.getContext());
        this.E = wcVar;
        this.f.a(wcVar, qoe.o(nm7.m4, -2));
    }

    public static TL_agent.agentModel e(String str, ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (TextUtils.equals(((TL_agent.agentModel) arrayList.get(i)).id, str)) {
                return (TL_agent.agentModel) arrayList.get(i);
            }
        }
        return null;
    }

    @Override // h27
    public final int getMenuAnchorTint() {
        int i = tc.h;
        return cmb.p1(0.06f, cmb.v0(cmb.Ke, this.d));
    }

    @Override // h27
    public final int getMenuDimAlpha() {
        return 51;
    }

    public final void j(boolean z) {
        String str;
        wc wcVar = this.E;
        byte b = 0;
        if (z) {
            gm.r(this.R);
            if (this.L >= 0) {
                ConnectionsManager.getInstance(this.a).cancelRequest(this.L, true);
                this.L = -1;
            }
            ArrayList arrayList = this.G;
            arrayList.clear();
            this.I = null;
            this.J = false;
            this.K = false;
            if (TextUtils.isEmpty(this.H)) {
                ArrayList arrayList2 = this.N;
                if (!arrayList2.isEmpty()) {
                    arrayList.addAll(arrayList2);
                    this.I = this.O;
                    this.J = this.P;
                    wcVar.c();
                    return;
                }
            }
        }
        if (this.K || this.J || (str = this.F) == null) {
            return;
        }
        this.K = true;
        String str2 = this.H;
        String str3 = this.I;
        lf2 lf2Var = new lf2((Object) this, (Object) str2, (byte) 2);
        mc mcVar = this.y;
        mcVar.getClass();
        TL_agent.getModels getmodels = new TL_agent.getModels();
        getmodels.provider = str;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        getmodels.query = str2;
        getmodels.offset = TextUtils.isEmpty(str3) ? null : str3;
        getmodels.limit = 20;
        this.L = ConnectionsManager.getInstance(mcVar.a).sendRequestTyped(getmodels, new kc(b), lf2Var);
        wcVar.c();
    }
}
