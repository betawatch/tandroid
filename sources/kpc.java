// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class kpc implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kpc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                npc npcVar = (npc) obj;
                if (!npcVar.y && npcVar.r && !npcVar.h.b()) {
                    npcVar.h.setProgress(0.0f);
                    npcVar.h.d();
                    break;
                }
                break;
            case 1:
                ((brc) obj).b(!r2.E);
                break;
            case 2:
                mrc mrcVar = ((qrc) obj).c;
                mrcVar.requestFocus();
                gm.E3(mrcVar);
                break;
            default:
                quc qucVar = (quc) obj;
                qucVar.a.c(!r3.b(), true);
                qucVar.c.setEnabled(qucVar.a.b());
                qucVar.c.animate().alpha(qucVar.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
