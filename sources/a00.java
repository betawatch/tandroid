// default package

import android.media.AudioManager;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class a00 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a00(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        oz ozVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                d00 d00Var = (d00) obj;
                d00Var.getClass();
                if (i != -3 && i != -2) {
                    if (i == -1) {
                        c74 c74Var = d00Var.c;
                        if (c74Var != null) {
                            c74Var.h.b(33, -1, 0).b();
                        }
                        d00Var.a();
                        d00Var.b(1);
                        break;
                    } else if (i == 1) {
                        d00Var.b(2);
                        c74 c74Var2 = d00Var.c;
                        if (c74Var2 != null) {
                            c74Var2.h.b(33, 1, 0).b();
                            break;
                        }
                    } else {
                        c00.p(i, "Unknown focus change type: ", "AudioFocusManager");
                        break;
                    }
                } else if (i != -2 && ((ozVar = d00Var.d) == null || ozVar.a != 1)) {
                    d00Var.b(4);
                    break;
                } else {
                    c74 c74Var3 = d00Var.c;
                    if (c74Var3 != null) {
                        c74Var3.h.b(33, 0, 0).b();
                    }
                    d00Var.b(3);
                    break;
                }
                break;
            default:
                MediaController mediaController = (MediaController) obj;
                String[] strArr = MediaController.W1;
                if (i != 1) {
                    mediaController.W = false;
                    break;
                }
                break;
        }
    }
}
