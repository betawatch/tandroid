package ai;

import android.speech.RecognitionSupport;
import android.speech.RecognitionSupportCallback;
import android.util.Log;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class c implements RecognitionSupportCallback {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ b b;

    public c(boolean[] zArr, b bVar) {
        this.a = zArr;
        this.b = bVar;
    }

    public final void onError(int i7) {
        Log.d("Dictation", "support probe: error " + i7);
        if (i7 == 14) {
            this.a[0] = true;
        }
        this.b.run();
    }

    public final void onSupportResult(RecognitionSupport recognitionSupport) {
        Log.d("Dictation", "support probe: installed=" + recognitionSupport.getInstalledOnDeviceLanguages().size() + " pending=" + recognitionSupport.getPendingOnDeviceLanguages().size() + " onDevice=" + recognitionSupport.getSupportedOnDeviceLanguages().size() + " online=" + recognitionSupport.getOnlineLanguages().size());
        if (!recognitionSupport.getInstalledOnDeviceLanguages().isEmpty() || !recognitionSupport.getPendingOnDeviceLanguages().isEmpty() || !recognitionSupport.getSupportedOnDeviceLanguages().isEmpty() || !recognitionSupport.getOnlineLanguages().isEmpty()) {
            this.a[0] = true;
        }
        this.b.run();
    }
}
