package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class Mp4Movie {
    private File cacheFile;
    private int height;
    private ac.d matrix = ac.d.j;
    private ArrayList<Track> tracks = new ArrayList<>();
    private int width;

    public void addSample(int i10, long j10, MediaCodec.BufferInfo bufferInfo) {
        if (i10 < 0 || i10 >= this.tracks.size()) {
            return;
        }
        this.tracks.get(i10).addSample(j10, bufferInfo);
    }

    public int addTrack(MediaFormat mediaFormat, boolean z10) {
        this.tracks.add(new Track(this.tracks.size(), mediaFormat, z10));
        return this.tracks.size() - 1;
    }

    public File getCacheFile() {
        return this.cacheFile;
    }

    public int getHeight() {
        return this.height;
    }

    public long getLastFrameTimestamp(int i10) {
        if (i10 < 0 || i10 >= this.tracks.size()) {
            return 0L;
        }
        return this.tracks.get(i10).getLastFrameTimestamp();
    }

    public ac.d getMatrix() {
        return this.matrix;
    }

    public ArrayList<Track> getTracks() {
        return this.tracks;
    }

    public int getWidth() {
        return this.width;
    }

    public void setCacheFile(File file) {
        this.cacheFile = file;
    }

    public void setRotation(int i10) {
        if (i10 == 0) {
            this.matrix = ac.d.j;
            return;
        }
        if (i10 == 90) {
            this.matrix = ac.d.k;
        } else if (i10 == 180) {
            this.matrix = ac.d.l;
        } else if (i10 == 270) {
            this.matrix = ac.d.m;
        }
    }

    public void setSize(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }
}
