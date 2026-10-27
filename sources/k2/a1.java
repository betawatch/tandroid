package k2;

import a8.ld;
import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import f9.s1;
import j$.util.Comparator$-CC;
import j$.util.Comparator$-EL;
import j$.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class a1 {
    public static final s1 a = f9.i0.y(12);

    public static f9.i0 a(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator$-EL.reversed(Comparator$-CC.comparing(new g(0))));
        for (AudioProfile audioProfile : audioProfiles) {
            if (audioProfile.getEncapsulationType() != 1 && e2.n0.M(audioProfile.getFormat())) {
                for (int i10 : audioProfile.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i10));
                }
            }
        }
        return f9.i0.u(treeSet);
    }

    public static f9.i0 b(AudioDeviceInfo audioDeviceInfo) {
        int type;
        f9.i0 i0Var;
        int speakerLayoutChannelMask;
        boolean a2 = ld.a(audioDeviceInfo.getType());
        s1 s1Var = a;
        if (!a2) {
            if (audioDeviceInfo.getType() == 1) {
                return f9.i0.y(4);
            }
            if (audioDeviceInfo.getType() == 2) {
                if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return f9.i0.y(Integer.valueOf(speakerLayoutChannelMask));
                }
                e2.a.l("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return s1Var;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 31 || audioDeviceInfo.getType() != 10) {
                if (i10 >= 31) {
                    int type2 = audioDeviceInfo.getType();
                    if (i10 >= 31 && type2 == 29) {
                        f9.i0 a10 = a(audioDeviceInfo);
                        if (!a10.isEmpty()) {
                            return a10;
                        }
                        List<AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                        if (i10 >= 34) {
                            if (i10 < 34 || audioDescriptors == null) {
                                f9.g0 g0Var = f9.i0.b;
                                i0Var = s1.e;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                Iterator<AudioDescriptor> it = audioDescriptors.iterator();
                                while (it.hasNext()) {
                                    AudioDescriptor e = jh.l.e(it.next());
                                    if (e.getStandard() == 2) {
                                        byte[] descriptor = e.getDescriptor();
                                        if (descriptor.length != 3) {
                                            e2.a.l("AudioDescriptorUtil", "Invalid SADB length: " + descriptor.length);
                                        } else {
                                            if (Build.VERSION.SDK_INT >= 34 && descriptor.length == 3) {
                                                byte b10 = descriptor[0];
                                                r10 = (b10 & 1) != 0 ? 12 : 0;
                                                if ((b10 & 2) != 0) {
                                                    r10 |= 32;
                                                }
                                                if ((b10 & 4) != 0) {
                                                    r10 |= 16;
                                                }
                                                if ((b10 & 8) != 0) {
                                                    r10 |= 192;
                                                }
                                                if ((b10 & 16) != 0) {
                                                    r10 |= 1024;
                                                }
                                                if ((b10 & 32) != 0) {
                                                    r10 |= 768;
                                                }
                                                if ((b10 & 128) != 0) {
                                                    r10 |= 201326592;
                                                }
                                                byte b11 = descriptor[1];
                                                if ((b11 & 1) != 0) {
                                                    r10 |= 81920;
                                                }
                                                if ((b11 & 2) != 0) {
                                                    r10 |= 8192;
                                                }
                                                if ((b11 & 4) != 0) {
                                                    r10 |= 32768;
                                                }
                                                if ((b11 & 8) != 0) {
                                                    r10 |= 6144;
                                                }
                                                if ((b11 & 16) != 0) {
                                                    r10 |= 33554432;
                                                }
                                                if ((b11 & 32) != 0) {
                                                    r10 |= 262144;
                                                }
                                                if ((b11 & 64) != 0) {
                                                    r10 |= 6144;
                                                }
                                                if ((b11 & 128) != 0) {
                                                    r10 |= 3145728;
                                                }
                                                byte b12 = descriptor[2];
                                                if ((b12 & 1) != 0) {
                                                    r10 |= 655360;
                                                }
                                                if ((b12 & 2) != 0) {
                                                    r10 = 8388608 | r10;
                                                }
                                                if ((b12 & 4) != 0) {
                                                    r10 |= 20971520;
                                                }
                                            }
                                            arrayList.add(Integer.valueOf(r10));
                                        }
                                    }
                                }
                                List.-EL.sort(arrayList, new a4.d(25));
                                i0Var = f9.i0.u(arrayList);
                            }
                            if (!i0Var.isEmpty()) {
                                return i0Var;
                            }
                        }
                        f9.i0 c10 = ag.t0.c(audioDescriptors);
                        if (!c10.isEmpty()) {
                            return c10;
                        }
                    }
                }
                if (i10 >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (i10 >= 31 && type == 22))) {
                    f9.i0 a11 = a(audioDeviceInfo);
                    if (!a11.isEmpty()) {
                        return a11;
                    }
                }
            } else {
                f9.i0 a12 = a(audioDeviceInfo);
                if (!a12.isEmpty()) {
                    return a12;
                }
                f9.i0 c11 = ag.t0.c(audioDeviceInfo.getAudioDescriptors());
                if (!c11.isEmpty()) {
                    return c11;
                }
            }
        }
        return s1Var;
    }
}
