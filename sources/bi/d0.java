package bi;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ d0(int i7, Runnable runnable) {
        this.a = i7;
        this.b = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.run();
                break;
            case 1:
                this.b.run();
                break;
            case 2:
                this.b.run();
                break;
            case 3:
                this.b.run();
                break;
            case 4:
                this.b.run();
                break;
            case 5:
                this.b.run();
                break;
            default:
                this.b.run();
                break;
        }
    }
}
